def sshconnect(){
  ssh -o StrictHostKeyChecking=no remote_user@remote_host uptime
  echo "hola" > /tmp/archivo
  scp /tmp/archivo remote_user@remote_host:/tmp/archivo
  rm -rf /tmp/archivo
}
