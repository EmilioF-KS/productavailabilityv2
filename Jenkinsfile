pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'spring-boot-gradle-app'
        DOCKER_TAG = 'latest'
    }

    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/EmilioF-KS/productavailabilityv2.git'
            }
        }

        stage('Build') {
            steps {
                bat 'gradlew.bat build -x test'
            }
        }

        stage('Docker Build') {
            steps {
                script {
                    docker.build("${DOCKER_IMAGE}:${DOCKER_TAG}")
                }
            }
        }

        stage('Docker Run') {
            steps {
                script {
                    docker.image("${DOCKER_IMAGE}:${DOCKER_TAG}").run('-p 8080:8080')
                }
            }
        }
    }
}
