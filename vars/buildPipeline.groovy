def call(String repoUrl, String imageName) {
    pipeline {
        agent any
        stages {
            stage('Checkout') {
                steps {
                    git repoUrl
                }
            }
            stage('Build Docker') {
                steps {
                    sh "docker build -t ${imageName} ."
                }
            }
            stage('Test') {
                steps {
                    sh "echo 'Running tests...'"
                }
            }
        }
    }
}