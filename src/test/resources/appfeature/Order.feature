Feature: Order information
Background:
Given user should be logged into application
When user click on orders button
Then user redirects to orders page

Scenario: Fetch currently placed order details
When user click on current order
Then user should see current order information

Scenario: Fetch previously placed order details
When user click on previous order
Then user should see previous order information

Scenario: Fetch cancelled order details
When user click on cancelled order
Then user should see cancelled order information