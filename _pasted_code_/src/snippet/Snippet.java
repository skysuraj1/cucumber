package snippet;

public class Snippet {
	Feature: Techfios login functionality validation 
	
	
	
	Scenario: User should be able to login with valid credentials 
		Given User is on Techfios login page
		When User enters username as "demo@techfios.com" 
		When User enters password as "abc123" 
		And USer clicks on SignIn button  
		Then User should land on dashboard page
}

