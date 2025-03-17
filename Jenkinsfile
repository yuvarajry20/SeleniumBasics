pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Clean and compile the project
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                // Run tests
                sh 'mvn test'
            }
        }
    }
}