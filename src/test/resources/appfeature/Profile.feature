@profile
Feature: Profile functionality
@sanity
Scenario: Add user profile
Given user is on home page
When user clicks on the add  profile button
And user enters the details
Then profile should get created

@regression @sanity
Scenario: Update user profile
Given user is on home page
When user clicks on the edit profile button
And user updates the details
Then profile should get updated

@functional
Scenario: Delete user profile
Given user is on home page
When user clicks on the delete button
Then profile should get deleted
