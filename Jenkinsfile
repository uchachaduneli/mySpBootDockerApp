pipeline {
    agent any
    tools {
        maven 'Maven 3.6'
    }
    stages {
        stage ('Build') {
            step{
                git url: 'https://github.com/uchachaduneli/mySpBootDockerApp'
            }
            step{
                    sh 'mvn clean install'
            }
          }
    }
}
