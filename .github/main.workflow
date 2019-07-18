workflow "Issue Management" {
  on = "check_run"
  resolves = ["Update Label"]
}

action "Update Label" {
  uses = "lannonbr/issue-label-manager-action@master"
  secrets = ["GITHUB_TOKEN"]
}
