pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Clean and compile the project
                sh 'mvn clean compile'
            }
        }
        stage('Run Main Class') {
            steps {
                // Run the main class using the exec-maven-plugin
                sh 'mvn exec:java'
            }
        }
    }
}