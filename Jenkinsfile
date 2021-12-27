pipeline {
  environment {
    registry = "foundational/search"
    registryCredential = 'docker-details'
    dockerImage = ''
  }
  agent any
  stages {
    stage('Git Checkout') {
      steps {
               checkout scm 
            }
    }
    
    	stage('Build') { 
            steps {
                sh 'mvn clean package -DskipTests' 
            }
        }
        
    stage('Building image') {
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('Deploy Image') {
      steps{
        script {
          docker.withRegistry( '', registryCredential ) {
            dockerImage.push()
          }
        }
      }
    }
   
  }
}