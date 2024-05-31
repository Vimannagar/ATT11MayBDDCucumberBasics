Feature: Homepage functionality
@sanity
Scenario: validation of title of page
Given I am at landing page
Then page title should have "Shopping"

@functional
Scenario: verify cart icon
Given I am at landing page
Then cart icon should get display

@regression
Scenario: checkout the deals section
Given I am at landing page
When I click on daily needs section
Then daily need section should open