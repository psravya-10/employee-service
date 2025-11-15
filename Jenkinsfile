pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/psravya-10/employee-service.git'
            }
        }

        stage('Build Maven Project') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t employee-service:1.0 .'
            }
        }

        stage('Run Docker Container') {
            steps {
                bat 'docker stop employee-service || exit 0'
                bat 'docker rm employee-service || exit 0'
                bat 'docker run -d --name employee-service -p 9090:9090 employee-service:1.0'
            }
        }
    }
}
