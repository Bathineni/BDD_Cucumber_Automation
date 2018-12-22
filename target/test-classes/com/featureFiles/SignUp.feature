Feature: Creating Make my trip account

Scenario Outline: SignUp into Make my trip account
Given Launch the application
Then Click on signup link
Then User enter email into Email text filed "<Email>"
And User enter phone number into Mobile number text field "<Mobile>"
And User enter password into Password text field "<Password>"
Then Click on signUp button

Examples:
|Email|Mobile|Password|
|sivakumarb070@gmail.com|9606653856|Siva@123|
