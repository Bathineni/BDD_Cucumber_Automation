Feature: Makemy trip Login functionality

Background:
Given Launch the application
When Verify home page title
Then Click on login button

Scenario Outline: Login to Makemy trip with valid functionality

Then I enter user name "<username>"and password "<password>"

Examples:
|username|password|
|bsiva.kumar070@gmail.com|siva@123B|




