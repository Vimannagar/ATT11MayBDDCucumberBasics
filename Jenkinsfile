pipeline {
    agent any

    stages {
        stage('Build the image') {
            steps {
                bat "docker build -t=cucumbertestcaseimage ."
            }
        }

        stage('Making infra up for execution') {
            steps {
                bat "docker-compose up -d hub chrome"
            }
        }
        stage('Executing the project on chrome') {
            steps {
                bat "docker-compose up cucumber-testcases"
            }
            post
            {
            always{
            
            emailext attachLog: true, attachmentsPattern: 'executionreport/amazontestreport/reports.html', body: '''Hi Team,
<h1> Please find the attachment for the latest execution of the Automation test scenarios.</h1>
<p>Here are the details of execution:<br>
$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:<br>
Check console output at $BUILD_URL to view the results.<br>

Please contact to ATT 11 May team for any queries,<br>

Thanks & Regards,<br>
ATT11May''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Customized email report from Jenkins for Chrome', to: 'gouravatttest@gmail.com gouravjawale28@gmail.com'
            }
            }
        }

       
    }
}
