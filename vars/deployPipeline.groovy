def call(String imageName) {
    pipeline {
        agent any
        stages {
            stage('Deploy') {
                steps {
                    sh "docker run -d -p 5000:5000 ${imageName}"
                }
            }
        }
    }
}