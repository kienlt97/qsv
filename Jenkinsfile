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
    }
}