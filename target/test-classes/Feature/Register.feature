#Author:Keerthiprasath.srinivasan@expleogroup.com
Feature: Register an account in Demo.opencart
 
 
Scenario: Register account and Get Successful message.
 
Given User lands in Opencart HomePage
When User clicks Register link
And User enters Genter,Firstname,Lastname,E-Mail,Password and CPassword
		|gender|firstname|lastname|email            |password|Cpassword|
		|Male	 |sk      |prasath     |skprasathbabyboy@gmail.com|skprasath@123  |skprasath@123   |
And User click register button
Then User get successfully registerd message and log out