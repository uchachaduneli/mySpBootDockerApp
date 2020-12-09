node{
  stage('checkout'){
    git 'https://github.com/uchachaduneli/mySpBootDockerApp'
  }
  stage('compile stage'){
    sh 'mvn clean install'
  }
}
