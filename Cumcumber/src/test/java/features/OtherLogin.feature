Feature: Techfios ivalid login functionality validation 


@OtherScenario
Scenario: User should be able to not login with valid credentials 
	Given User is on Techfios login page
	When User enters username as "demo1@techfios.com" 
	When User enters password as "abc123" 
	And USer clicks on SignIn button  
	Then User should land on dashboard page