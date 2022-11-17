pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
            steps {
                withMaven(maven : 'maven_3.8.6') {
                    if (isUnix()) --> sh "mvn clean compile"
                    else --> bat "mvn clean compile"
                }
            }
        }

        stage ('Testing Stage') {
            steps {
                withMaven(maven : 'maven_3.8.6') {
                    if (isUnix()) --> sh "mvn test"
                    else --> bat "mvn test"
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven_3.8.6') {
                    if (isUnix()) --> sh "mvn deploy"
                    else --> bat "mvn deploy"
                }
            }
        }
    }
}