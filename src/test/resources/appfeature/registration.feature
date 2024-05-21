Feature: Opening bank account
Scenario: Opening bank account with nominee
Given user should be at accounts page
When user enters the following data
| Erin | smith | erinsmith@gmail.com | 9988776655 |
| Robert | Jackson | robertjackson@gmail.com | 9876543210 |
And user clicks on submit button
Then user should get app id