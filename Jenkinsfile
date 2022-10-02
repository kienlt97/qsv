pipeline{
    agent any
    tools{
        maven 'Maven 3.8.4'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/kienlt97/qsv']]])
                sh 'mvn clean install'
            }
        }
        stage('Build Image Docker'){
                    steps{
                        withDockerRegistry(credentialsId: 'docker-hub', url: '192.168.40.101:5000') {
                            sh 'docker build -t 192.168.40.104:5000/qsv --force-rm -f Dockerfile .'
                            sh 'docker push 192.168.40.104:5000/qsv'
                        }
                    }
                }
    }
}