
    node {
        stage ('git checkout stage') {
                git url: 'https://github.com/uchachaduneli/mySpBootDockerApp'
          }
        stage ('git checkout stage') {
        def mvnHome = tool name: 'maven-3.6', type: 'maven'
              sh '${mvnHome}/bin/mvn clean install'
         }
    }

