Feature: Login functionality
Scenario: Login to application
Given user is at login page
When user enter username as "testuser"
And user enters "Test@1234" as password
And user click on login 1 button
Then user should get logged into application