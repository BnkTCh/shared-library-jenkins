def call() {
  sshagent(credentials : ['3dfc7ab3-ca16-4a72-acdd-234af2acc0d9']) {
    def sshCmd = sh returnStdout: true, script: "
      '''
       ssh -o StrictHostKeyChecking=no remote_user@remote_host 'bash -s << 'ENDSSH'
       echo "hola como estas" > /tmp/archivo
       echo "bianca" > /tmp/biancafile
       ENDSSH'
       '''.stripIndent()"
    sh(sshCmd)
    }
  }
}

def sshCmd = steps.sh script: "ssh -o StrictHostKeyChecking=no remote_user@remote_host ${command1} ${command2}"
sh(sshCmd)
