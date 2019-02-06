folder('pruebasSeed') {
  description('Folder containing all jobs for folder-a')
}
job('Hello World') {
  steps {
    shell('echo "Hello World!"')
  }
}
