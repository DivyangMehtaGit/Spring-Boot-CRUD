pipeline {
    agent any
    stages {
        stage ('Clean Stage') {
            steps {
                withMaven(maven : 'maven') {
                    sh 'mvn clean'
                }
            }
        }

        stage ('build stage') {
            steps {
                withMaven(maven : 'maven') {
                    sh 'mvn install'
                }
            }
        }

        stage ('Deploy stage') {
            steps {
                withMaven(maven : 'maven') {
                    sh 'mvn deploy'
                }
            }
        }
    }
}