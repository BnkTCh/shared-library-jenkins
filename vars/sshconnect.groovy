def call() {
  sshagent(credentials : ['3dfc7ab3-ca16-4a72-acdd-234af2acc0d9']) {
    def sshCmd = sh returnStdout: true, script: "\n
      '''\n
       ssh -o StrictHostKeyChecking=no remote_user@remote_host 'bash -s << 'ENDSSH'\n
       echo "hola como estas" > /tmp/archivo\n
       echo "bianca" > /tmp/biancafile\n
       ENDSSH'\n
       '''.stripIndent()"
    }
  }
}
