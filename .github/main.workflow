workflow "Issue triage" {
  on = "issues"
  resolves = "Apply Triage Label"
}

action "Apply Triage Label" {
  uses = "actions/github@v1.0.0"
  args = "label needs-triage --action=opened"
  secrets = ["GITHUB_TOKEN"]
}

action "Update Label" {
  uses = "lannonbr/issue-label-manager-action@master"
  secrets = ["GITHUB_TOKEN"]
}