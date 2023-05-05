pipeline {
    environment {
        registry = "nagasumukh/backend"
        registryCredential = 'Dockerhub'
        DOCKERHUB_PASS = credentials('Dockerhub')
        TIMESTAMP = new Date().format("yyyyMMdd_HHmmss")
    }
    agent any

    stages{

            stage('Build survey page') {
                steps {
                    script {
                        sh 'rm -rf *.war'
                        sh 'jar -cvf backend.war .'
                        sh 'echo ${BUILD_TIMESTAMP}'
                        
                        sh "docker login -u nagasumukh -p ${DOCKERHUB_PASS}"
                        sh 'docker build -t nagasumukh/backend:${env.TIMESTAMP} .'
                 

                        sh 'echo ${BUILD_TIMESTAMP}'

//                         sh "docker login -u Nagasumukh -p ${DOCKERHUB_PASS}"
//                         def customImage = docker.build("nagasumukh/newestimg:${env.TIMESTAMP}")

                   }
                }
            }

            stage('Push to Docker Hub') {
                steps {
                    script {
                        docker.withRegistry('',registryCredential){
                          sh "docker push nagasumukh/backend:${env.TIMESTAMP}"
                       }
//                         sh 'docker push nagasumukh/newestimg:${env.TIMESTAMP}'
                    }
                }
            }

          stage('Deploying Rancher to single node') {
             steps {
                script{
                    sh "kubectl set image deployment/deploynp container-0=nagasumukh/backend:${env.TIMESTAMP}"
//                    sh 'kubectl set image deployment/deploymain container-0=nagasumukh/newestimg:${env.TIMESTAMP}'
                }
             }
          }

        stage('Deploying Rancher to Load Balancer') {
           steps {
              script{
                  sh "kubectl set image deployment/deploylb container-0=nagasumukh/backend:${env.TIMESTAMP}"
//                  sh 'kubectl set image deployment/deploylb container-0=nagasumukh/newestimg:${env.TIMESTAMP}'
              }
           }
        }
    }
}
