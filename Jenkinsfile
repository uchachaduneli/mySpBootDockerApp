node {
   stage ('git checkout stage') {
       git url: 'https://github.com/uchachaduneli/mySpBootDockerApp'
   }
   stage ('building with maven') {
       def mvnHome = tool name: 'maven-3.6', type: 'maven'
       sh "${mvnHome}/bin/mvn clean install"
//       sh "${mvnHome}/bin/mvn test"
   }
}

