pipeline {

    agent any

    stages {

        stage("build") {

            steps {
                echo "Building "
                maven("maven 3") {
                    sh 'mvn clean install'
                }
            }
        }

        stage("test") {

            steps {
                echo "Testing "
            }
        }

        stage("delpoy") {

             steps {
                echo "Deploying "
             }
        }
    }
}