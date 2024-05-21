Feature: Signup functionality
Scenario Outline: Signup to application
Given user is at signup
When user enters name as "<name>" in form
And user enters age as <age>
And user confirms "<gender>" radio button
Then user gets created

Examples:
| name | age | gender |
| Eder | 23 | Male |
| Ron | 40 | Male |
| Daniel | 45 | Male |
| Diana | 32 | Female |