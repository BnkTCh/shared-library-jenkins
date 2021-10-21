def sshconnect = sh returnStdout: true, script: "ssh -o StrictHostKeyChecking=no remote_user@remote_host 'cat /etc/os-release'"
sh(sshconnect)
