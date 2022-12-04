pipeline {

    agent any

    stages {

        stage("build") {

            steps {
                echo "Building "
                withMaven(maven: "Maven_3_8_6") {
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