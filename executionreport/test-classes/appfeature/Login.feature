Feature: Login functionality
Scenario: Login to application
Given I am at login page
When I enter username
And I enter password
And I click on login button
Then I should get logged into application

Scenario: verifying title
Given I am at login page
Then title of page should get fetched