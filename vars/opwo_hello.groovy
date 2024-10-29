def call(Map cicdParams = [:]) {
    pipeline {
        agent any

        stages {
            stage('hello') {
                steps {
                    script {
                        echo "[notice] hello"
                    }
                }
            } 
        }

        post {
            failure {
                script {
                    echo "[notice] error"
                }
            }
        }
    }
}
