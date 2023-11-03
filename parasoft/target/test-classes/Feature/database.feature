Feature: Login to HRM application using valid and invalid Credentials
  
 
  @ValidCredentials
  Scenario: Login with Valid credentials
    Given User is on HRMLogin Webpage
    When User provides valid credentials
    | Username | Password |
    | Admin    | admin123 |
    
    Then User should be able to login successfully and see homePage
   
 
  @InvalidCredentials
  Scenario Outline: Login with InValid credentials
    Given User is on HRMLogin Webpage
    When User provides valid credentials
    | Username | Password |
    | Admin1   | admin123 |
    | Admin123    | admin123 |
    Then User able to see unsuccessfull with error message