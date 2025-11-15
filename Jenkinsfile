pipeline {
    agent any

    tools {
        jdk 'jdk-17'
        maven 'maven-3.9'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/psravya-10/employee-service.git'
            }
        }

        stage('Build Maven Project') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t employee-service:1.0 .'
            }
        }

        stage('Run Docker Container') {
            steps {
                sh 'docker stop employee-service || true'
                sh 'docker rm employee-service || true'
                sh 'docker run -d --name employee-service -p 9090:9090 employee-service:1.0'
            }
        }
    }
}
