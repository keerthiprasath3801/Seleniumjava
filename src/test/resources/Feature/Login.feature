#Author: keerthiprasath.srinivasan@expleogroup.com
Feature: Login an account in Demo.opencart
 
Background:
	
	Given User landed at demo.opencart HomePage
	
	@ValidCredentials
	Scenario: Login with valid credentials
	
	When User clicks login link
	And User enter the username and password
	And User clicks login button
	Then User see the login succesfull message
	
	@InvalidCredentials
	Scenario: Login with Invalid Credentials
	
	When User clicks login link
	And User enter the invalid username and password
	And User clicks login button
	Then User see the error message
