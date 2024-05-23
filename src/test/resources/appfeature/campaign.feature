Feature: Sending email campaign
Scenario: Create campaign
Given user should be at campaigns page
When user clicks on create campaign button
And user enters the information
Then campaign should get created

Scenario: Schedule campaign
Given user should be at campaigns page
When user click on edit campaign
And user enter the schedule time
Then campaign get scheduled

Scenario: Send campaign
Given user should be at campaigns page
When user click on the send campaign
Then campaign should get triggered