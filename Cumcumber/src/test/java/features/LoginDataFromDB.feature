@DbLogin
Feature: Techfios other login functionality validation driving the data from mysql database

Background:
	Given User in on Techfios login page
@DbScenario
Scenario: User should be able to login with valid credentials

When User enters "username" from mysql database
	When User enters "password" from mysql database
	And USer clicks on SignIn button  
	Then User should land on dashboard page
	