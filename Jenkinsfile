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
}
