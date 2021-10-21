def call() {
  shagent(credentials : ['3dfc7ab3-ca16-4a72-acdd-234af2acc0d9']) {
    def sshCmd = sh returnStdout: true, script: "ssh -o StrictHostKeyChecking=no remote_user@remote_host 'cat /etc/os-release'"
    sh(sshCmd)
  }
}
