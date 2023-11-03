Feature: Register to ParaBank App
 
Scenario: Register with some personal information
 
Given User is on Parabank Register page
When User enters First Name and Last Name
And User enters Address
And User enters City and State
And User enters Zip Code
And User enters Phone Number
And User enters SSN
And User enters Username
And User enters Password and Confirm Password
And User clicks Register
Then User should be able to Register sucessfully