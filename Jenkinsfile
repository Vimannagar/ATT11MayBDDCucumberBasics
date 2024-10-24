pipeline {
    agent any

    stages {
        stage('Fetch the code') {
            steps {
                git credentialsId: 'd8c2dfa6-d36a-4e82-bcad-ceac0d063dde', url: 'https://github.com/gouravjawale100/ATT11MayBDD.git'
            }
        }
        stage('Executing the projecton chrome') {
            steps {
                bat "mvn -Dmaven.test.failure.ignore=true clean test -DcliBrowser=Chrome"
            }
            post
            {
            always{
            emailext attachLog: true, attachmentsPattern: 'target/amazontestreport/reports.html', body: '''Hi Team,
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

        stage('Executing the project on firefox') {
            steps {
                bat "mvn -Dmaven.test.failure.ignore=true clean test -DcliBrowser=Firefox"
            }
            post
            {
            always{
            emailext attachLog: true, attachmentsPattern: 'target/amazontestreport/reports.html', body: '''Hi Team,
<h1> Please find the attachment for the latest execution of the Automation test scenarios.</h1>
<p>Here are the details of execution:<br>
$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:<br>
Check console output at $BUILD_URL to view the results.<br>

Please contact to ATT 11 May team for any queries,<br>

Thanks & Regards,<br>
ATT11May''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Customized email report from Jenkins for Firefox ', to: 'gouravatttest@gmail.com gouravjawale28@gmail.com'
            }
            }
        }
    }
}
