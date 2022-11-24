pipeline{
    agent any
      tools {
        maven 'Maven'
    }


    stages{
        stage("Build"){
            steps{
                sh 'mvn compile'
                echo "========executing Build========"
            }
            post{
                always{
                    echo "========always========"
                }
                success{
                    echo "========Build executed successfully========"
                }
                failure{
                    echo "========Build execution failed========"
                }
            }
        }

        stage("Test"){
            steps{
                sh 'mvn test'
                echo "========executing Test========"
            }
            post{
                always{
                    echo "========always========"
                }
                success{
                    echo "========Test executed successfully========"
                }
                failure{
                    echo "========Testexecution failed========"
                }
            }
        }
    }



    post{
        always{
            echo "========always========"
        }
        success{
            echo "========pipeline executed successfully ========"
        }
        failure{
            echo "========pipeline execution failed========"
        }
    }
}
