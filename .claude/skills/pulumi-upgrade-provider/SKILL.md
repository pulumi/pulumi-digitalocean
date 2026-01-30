---
name: pulumi-upgrade-provider
description: Automate Pulumi provider repo upgrades with the `upgrade-provider` tool. Use when upgrading a pulumi provider repository to a new upstream version, running `upgrade-provider`, and addressing its common failure modes like patch conflicts or missing module mappings.
disable-model-invocation: true
---

# Pulumi Upgrade Provider

## CRITICAL: Session Completion Requirements

**DO NOT end this session until one of these conditions is met:**

1. **Success**: The `upgrade-provider` command completes successfully AND you have retrieved the PR URL
2. **Explicit failure**: You have hit a stopping condition listed in "When to Stop and Report Failure" below

**You MUST NOT end the session if:**
- A command is still running or you haven't checked its output
- You encountered an error but haven't attempted to fix it
- You haven't yet run `upgrade-provider` at least once
- The upgrade-provider command failed but you haven't exhausted the error-fixing loop

**Long-running commands**: The `upgrade-provider` command can take up to 10 minutes. You MUST wait for it to complete. Use `timeout: 600000` when running it via Bash.

## Overview

Drive Pulumi provider upgrades by running the `upgrade-provider` tool and iterating on failures until the tool succeeds. Keep all git operations read-only in the repo; the tool owns branches, commits, and PRs.

## Error Tracking

Track errors across iterations to avoid infinite loops:
- Maintain a mental list of errors encountered and fixes attempted
- An error is "the same" if it has the same error message and affects the same file/resource
- After 3 failed attempts at the same error, stop and report failure

## Run Loop

1. Run the upgrade tool from the repo root with a 10-minute timeout:

```console
upgrade-provider $ORG/$REPO --repo-path . --upstream-provider-org $UPSTREAM_ORG --upstream-provider-name $UPSTREAM_NAME > .pulumi/upgrade-provider-stdout.txt 2>&1
```

Use `timeout: 600000` (10 minutes) when invoking via Bash. Create the `.pulumi` directory first if it doesn't exist.

2. **Wait for the command to fully complete** (can take up to 10 minutes). Do not proceed or end the session until you see the final output.
3. Scan `.pulumi/upgrade-provider-stdout.txt` for lines starting with `error: `.
4. If failed:
   - Compare the error to previous attempts
   - If you've seen the **same error 3 times**, stop and report failure (see "When to Stop")
   - If this is a new/different error, fix it using `references/upgrade-provider-errors.md`
   - Rerun the command
5. If a conflict was fixed, report exactly what changed (file paths + concrete edits or kept intent).
6. If the upgrade required changes to patches, run `./scripts/upstream.sh checkout` and review the applied commits:
   - List commit SHAs/titles from `upstream`.
   - Summarize the intent of each commit in plain language.
   - Call out any behavioral changes or risks.
7. When the tool completes successfully, proceed to Post-run Tasks.

## When to Stop and Report Failure

Stop iterating and exit with failure if any of these conditions are met:

1. **Same error 3 times**: You've attempted to fix the same error 3 times without success
2. **Unknown error pattern**: The error is not covered in `references/upgrade-provider-errors.md` and you cannot determine a safe fix
3. **Requires human judgment**: The fix requires decisions that need human input, such as:
   - Choosing between multiple valid approaches
   - Breaking changes that affect public API
   - Deprecation strategies
   - Architectural decisions about module organization
4. **Circular issues**: Fix A causes error B, fix B causes error A
5. **Complexity escalation**: Each fix attempt reveals more issues, suggesting deeper problems

When stopping, you MUST report:
1. The error(s) encountered
2. What fixes were attempted (with file paths and changes)
3. Why you believe human intervention is needed
4. Any partial progress that was made

## Post-run Tasks

The tool creates a PR when the upgrade completes successfully.

1. MUST fetch the PR URL for the current branch using read-only commands:

```console
gh pr view --json url --jq .url || gh pr list --head "$(git branch --show-current)" --json url --jq '.[0].url'
```

2. MUST append a "Fixes applied to unblock upgrade" section to the existing PR body if any fixes were applied (do not overwrite):

```console
repo=$(gh repo view --json nameWithOwner --jq .nameWithOwner)
pr_number=$(gh pr view --json number --jq .number)
gh pr view --json body --jq .body > /tmp/pr_body.txt

cat <<'EOF' >> /tmp/pr_body.txt

---

### Fixes applied to unblock upgrade

- <list concrete unblocker edits here, with file paths and intent>
EOF

gh api -X PATCH "repos/$repo/pulls/$pr_number" --raw-field body="$(cat /tmp/pr_body.txt)"
```

Use REST (`gh api`) instead of `gh pr edit` to avoid GraphQL project-card errors. Keep the original content intact; only append the new section.

## Notes

- `git rebase --continue --no-edit` is not supported in older git versions. Use `git rebase --continue` and accept the existing commit message when prompted.
- To avoid the editor prompt during `git rebase --continue`, run it with `GIT_EDITOR=true` (or `GIT_EDITOR=:`).

## Working Directory

**IMPORTANT: Always run commands from the repository root.** Do NOT use `cd` to change directories - it causes state confusion and is not allowed.

### Working with the `upstream` submodule

The `upstream/` directory is a git submodule containing the Terraform provider source. Use these patterns:

**Git commands** - use `-C upstream`:
```bash
# Check status
git -C upstream status

# View log
git -C upstream log --oneline -10

# Check current branch
git -C upstream branch --show-current

# Continue a rebase (with auto-accept message)
GIT_EDITOR=: git -C upstream rebase --continue

# Stage files after resolving conflicts
git -C upstream add <file>
```

**Reading files** - use the Read tool with path from repo root:
```
Read upstream/docs/resources/droplet.md
Read upstream/go.mod
```

**Editing files** - use the Edit tool with path from repo root:
```
Edit upstream/docs/resources/droplet.md
```

**Listing files** - use full paths:
```bash
ls -la upstream/
ls -la upstream/vendor/github.com/digitalocean/godo/
```

**Scripts** - run from repo root:
```bash
./scripts/upstream.sh checkout
./scripts/upstream.sh rebase -o refs/tags/v2.75.0
./scripts/upstream.sh check_in
```

## Guardrails

- Never commit, push, or create branches manually; only run read-only git commands.
- `./scripts/upstream.sh checkout|rebase|check_in` are allowed because the tool manages git state.
- Do not stash changes; the tool manages git state.
- **Do not use `cd`** - always work from the repository root.

## References

- Use this skill's `references/upgrade-provider-errors.md` for patch conflict and new module mapping fixes.

## Final Reminder

Before ending this session, verify:
- [ ] You ran `upgrade-provider` and waited for it to complete
- [ ] If it failed, you attempted fixes per the error reference guide
- [ ] If it succeeded, you retrieved and reported the PR URL
- [ ] If stopping due to failure, you documented the error, attempted fixes, and why human intervention is needed

**Do not end the session without completing one of the outcomes above.**
