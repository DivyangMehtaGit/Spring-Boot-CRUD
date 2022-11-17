pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
            steps {
                echo 'compiling start'
                withMaven(maven : 'maven_3.8.6') {
                    sh 'mvn clean compile'
                }
                echo 'compiling done'
            }
        }

        stage ('Testing Stage') {
            steps {
                withMaven(maven : 'maven_3.8.6') {
                    sh 'mvn test'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven_3.8.6') {
                    sh 'mvn deploy'
                }
            }
        }
    }
}
