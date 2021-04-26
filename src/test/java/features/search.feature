@search
Feature: Search Feature
	
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
   
   
   Scenario Outline:: Search with empty data
   Given Open "<Page>" footer page
   When Input to "q" textbox with value "<Search keyword>"
   And Click to "Search" button
   Then Verify search product warning with message "<Message>"
   
   Examples: Search info
      | Page   | Search keyword  | Message                                    | 
      | Search |     1           | Search term minimum length is 3 characters | 
   
   Scenario Outline: Search with data not exist
   When Input to "q" textbox with value "<Search keyword>"
   And Click to "Search" button
   Then Verify search product warning with message "<Message>"
   
    Examples: Search info
      | Search keyword   | Message                                            | 
      | MACBOOK PRO 2050 | No products were found that matched your criteria. | 
      
   
   Scenario Outline: Search with relative product name 
   When Input to "q" textbox with value "<Search keyword>"
   And Click to "Search" button
   Then Verify search result display with "<Number Product>" products
   
    Examples: Search info
      | Search keyword | Number Product | 
      | lenovo         | 2              |    
   
   Scenario Outline: Search with absolute product name 
   When Input to "q" textbox with value "<Search keyword>"
   And Click to "Search" button
   Then Verify search result display with "<Number Product>" products
   
    Examples: Search info
      | Search keyword | Number Product | 
      | thinkpad x1         | 1              |    
   
   Scenario Outline: Advanced Search with parent categories 
   When Input to "q" textbox with value "<Search keyword>"
   And Check to "Advanced search" checkbox
   And Select "cid" dropdown with value "<Category>"
   And Click to "Search" button
   Then Verify search product warning with message "<Message>"

    Examples: Search info
      | Search keyword    | Category  | Message                                            | 
      | apple macbook pro | Computers | No products were found that matched your criteria. | 
      
   Scenario Outline: Advanced Search with sub categories 
   When Input to "q" textbox with value "<Search keyword>"
   And Check to "Advanced search" checkbox
   And Select "cid" dropdown with value "<Category>"
   And Check to "Automatically search sub categories" checkbox
   And Click to "Search" button
   Then Verify search result display with "<Number Product>" products

    Examples: Search info
      | Search keyword    | Category  | Number Product | 
      | apple macbook pro | Computers | 1              | 
      


   Scenario Outline: Advanced Search with incorect manufacturer 
   When Input to "q" textbox with value "<Search keyword>"
   And Check to "Advanced search" checkbox
   And Select "cid" dropdown with value "<Category>"
   And Check to "Automatically search sub categories" checkbox
   And Select "mid" dropdown with value "<Manufacturer>"
   And Click to "Search" button
   Then Verify search product warning with message "<Message>"

    Examples: Search info
      | Search keyword    | Category  | Manufacturer | Message                                            | 
      | apple macbook pro | Computers | HP           | No products were found that matched your criteria. | 
  
  
   Scenario Outline: Advanced Search with valid manufacturer 
   When Input to "q" textbox with value "<Search keyword>"
   And Check to "Advanced search" checkbox
   And Select "cid" dropdown with value "<Category>"
   And Check to "Automatically search sub categories" checkbox
   And Select "mid" dropdown with value "<Manufacturer>"
   And Click to "Search" button
   Then Verify search result display with "<Number Product>" products

    Examples: Search info
      | Search keyword    | Category  | Manufacturer | Number Product | 
      | apple macbook pro | Computers | Apple        | 1              | 
      
      
    
      
   