pipeline {
    agent any
    tools {
        maven 'Maven 3.6.1'
    }
    stages {
        stage ('Build') {
            git url: 'https://github.com/uchachaduneli/mySpBootDockerApp'
            withMaven {
              sh "mvn clean install"
            }
          }
    }
}