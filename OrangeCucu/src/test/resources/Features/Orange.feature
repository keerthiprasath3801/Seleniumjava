
Feature: Login into OrangeHRM Application
 
  Scenario: User login with valid credentials
   
    Given User logins to application using url
    When User provides valid username and password
    And User clicks login
    Then User should be able to successfully login and  HomePage is opened