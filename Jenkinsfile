pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                // Checkout the code from GitHub
                git 'https://github.com/chavesef/DesignPatterns'
            }
        }
        stage('Build') {
            steps {
                // Run the build
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                // Run tests
                sh './gradlew test'
            }
        }
        stage('Report') {
            steps {
                // Generate report
                sh './gradlew jacocoTestReport'
            }
        }
    }

    post {
        always {
            // Archive the test results
            junit '**/build/test-results/test/*.xml'

            // Archive the coverage report
            archiveArtifacts 'build/reports/jacoco/test/html/**/*'
        }
    }
}
