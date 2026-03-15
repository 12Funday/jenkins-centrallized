@Library('shared-pipelines') _

pipeline {
    agent any

    parameters {
        string(name: 'REPO_URL', defaultValue: 'https://github.com/12funday/test-py-pipeline.git', description: 'URL repo project')
        string(name: 'IMAGE_NAME', defaultValue: '12funday/test-py-pipeline', description: 'Docker image name')
    }

    stages {
        stage('Build') {
            steps {
                script {
                    buildPipeline(params.REPO_URL, params.IMAGE_NAME)
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    deployPipeline(params.IMAGE_NAME)
                }
            }
        }
    }

    post {
        always {
            echo "Pipeline finished"
        }
    }
}