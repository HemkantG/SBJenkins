pipeline {
  agent any
  stages {
    stage('Build') {
      agent{
        docker{
          image: 'maven:3-alpine'
          args: '-v /home/hemkant/docker/.m2:/root/.m2'
        }
      }

       steps {
        sh 'mvn clean package'
      }
    }
    stage('Compile, Test and Package') {
      steps {
        sh 'echo "Compilation testing and packaging"'
      }
    }
    stage('Deployment') {
      steps {
        sh 'echo "Deployment"'
      }
    }
  }
}