pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'echo "Build Step"'
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