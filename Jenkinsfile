pipeline {

    agent any

    tools {
        maven 'Maven_3_8_6'
    }

    stages {

        stage("build") {

            steps {
                echo "Building "
                sh 'mvn clean install'
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