def call(){
  sh '''
      ssh -o StrictHostKeyChecking=no remote_user@remote_host 'bash -s << 'ENDSSH'
      echo "hola como estas" > /tmp/archivo
      echo "bianca" > /tmp/biancafile
  ENDSSH'
     '''.stripIndent()
}
