Feature: Login to ParaBank App
 
Scenario: Login with ParaBank Credentials
 
Given User is on Parabank Login page
When User enters ParaBank Username and Password
And User clicks ParaBank login
Then User should be able to login sucessfully in ParaBank