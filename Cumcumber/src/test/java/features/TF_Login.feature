@Login
Feature: Techfios login functionality validation 


@TFScenario
Scenario Outline: User should be able to login with valid credentials 
	Given User is on Techfios login page
	When User enters username as "<userName>"
	When User enters password as "<password>"
	And USer clicks on SignIn button  
	Then User should land on dashboard page
	Examples:
	|userName|password|
	|demo@techfios.com|abc123|
	