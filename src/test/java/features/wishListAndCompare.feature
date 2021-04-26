@wishlistComapare
Feature: Wishlist, Compare and Recent Reivew Feature
	
	Scenario Outline: Register User With Valid Data
		#Link 
		Given Click to "Register" link text
		
		#Radio button
		When Select to Gender raido button with value "<Gender>"
		
		#Textbox
		And Input to "FirstName" textbox with value "<FirstName>"
		And Input to "LastName" textbox with value "<LastName>"
		
		#Dropdown
		And Select "DateOfBirthDay" dropdown with value "<DateOfBirthDay>"
		And Select "DateOfBirthMonth" dropdown with value "<DateOfBirthMonth>"
		And Select "DateOfBirthYear" dropdown with value "<DateOfBirthYear>"
		
		#Textbox
		And Input to "Email" textbox with value "<Email>"
		And Input to "Company" textbox with value "<Company>"
		And Input to "Password" textbox with value "<Password>"
		And Input to "ConfirmPassword" textbox with value "<ConfirmPassword>"
		
		#Buton
		And Click to "Register" button 
		
		#Text
		Then Success message displayed "Your registration completed"
		
		#Button
		Then Click to "Log out" link text
		
		
	 Examples: Register info
	 | Gender | FirstName | LastName | DateOfBirthDay | DateOfBirthMonth | DateOfBirthYear | Email              | Company | Password | ConfirmPassword |Message| 
   | Male   | tuan      | le       | 29         		| March      		 | 1993        		   | tuanla15@gmail.com | ABC     | 123123   | 123123          |Your registration completed| 
   
  
  @login
  Scenario Outline: Login With Valid Data
  	#Link
    Given Click to "Log in" link text
    
    #Textbox 
    When Input to "Email" textbox with value "<Email>"
    And Input to "Password" textbox with value "<Password>"
    
    #Button
    And Click to "Log in" button
    
    #Link
    Then Verify "Log out" link text is displayed 
    
   Examples: Login info
	 | Email             | Password |
   | tuanla15@gmail.com| 123123   |
   
   
   Scenario Outline:: Add to wishlist
    Given Click to "<Category>" in Top Menu
  	When Click to sub list with data "<List>"
  	When Click to product name "<Product Name>"
  	And Click to product "<Add to wishlist>"
  
  	
  	
   
   Examples: Add to wishlist
      | Category  | List     | Product Name            						 | Add to wishlist | Review Content | Rating | 
      | Computers | Desktops | Lenovo IdeaCentre 600 All-in-One PC | The first    | it's OK        | 4      | 
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      