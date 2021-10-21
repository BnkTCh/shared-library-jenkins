def call() {
  command1 = 'echo "hola como estas" > /tmp/archivo'
  command2 = 'echo bianca > /tmp/biancafile'
  sshagent(credentials : ['3dfc7ab3-ca16-4a72-acdd-234af2acc0d9']) {
    def sshCmd = steps.sh script: "ssh -o StrictHostKeyChecking=no remote_user@remote_host ${command1}; ${command2};"
    sh(sshCmd)
  }
}
