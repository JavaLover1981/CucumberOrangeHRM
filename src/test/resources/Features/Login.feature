Feature: OrangeHRM website Login functionality 

@smokeTest @regression
Scenario: Testing Login with Valid credentials 
	Given User Launch Chrome browser 
	When User opens URL "https://opensource-demo.orangehrmlive.com/" 
	And user enter username as "Admin" and password as "admin123" 
	And click on Login 
	Then Page title should be "OrangeHRM" 
	When User click on "Welcome Paul" 
	Then user click on log out link 
	
	@smokeTest
Scenario Outline: Login Data Driven 
	Given User Launch Chrome browser 
	When User opens URL "https://opensource-demo.orangehrmlive.com/" 
	And user enter username as "<username>" and password as "<password>" 
	And click on Login
	And Login page opens 
	Then Page title should be "OrangeHRM" 
	When User click on "Welcome Paul" 
	Then user click on log out link 
	
	Examples: 
	
		| username|password |        | Admin | admin123 |        | admin | Admin123 |
        | Adminw | Admin123t |
      
      @regression   Scenario: Testing Login with inValid credentials 
	Given User Launch Chrome browser 
	When User opens URL "https://opensource-demo.orangehrmlive.com/" 
	And user enter username as "admin" and password as "Admin123" 
	And click on Login 
	Then Page title should be "OrangeHRM" 
	When User click on "Welcome Paul" 
	Then user click on log out link 
	
	@important  
 Scenario: Testing Login with inValid credentials 
	Given User Launch Chrome browser 
	When User opens URL "https://opensource-demo.orangehrmlive.com/" 
	And user enter username as "admin" and password as "Admin123" 
	And click on Login 
	Then Page title should be "OrangeHRM" 
	When User click on "Welcome Paul" 
	Then user click on log out link 
 
