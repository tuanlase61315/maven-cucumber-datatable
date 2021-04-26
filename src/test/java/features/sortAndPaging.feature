@sortAndPaging
Feature: Sort And Paging Feature
	
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
		
		
    Examples: Register info
      | Gender | FirstName | LastName | DateOfBirthDay | DateOfBirthMonth | DateOfBirthYear | Email              | Company | Password | ConfirmPassword | Message                     | 
      | Male   | tuan      | le       | 29             | March            | 1993            | tuanla01@gmail.com | ABC     | 123123   | 123123          | Your registration completed | 
  
  
  Scenario Outline: Sort Product By Name: A to Z
    Given Click to "<Category>" in Top Menu
  	When Click to sub list with data "<List>"
  	And Select "products-orderby" dropdown with value "<Sort By>"
  	Then Verify product sorted "<Sort By>"
  	
    Examples: Sort info
      | Category  | List     | Sort By      | 
      | Computers | Desktops | Name: A to Z | 
  	
  	
  Scenario Outline: Sort Product By Name: Z to A
    Given Click to "<Category>" in Top Menu
  	When Click to sub list with data "<List>"
  	And Select "products-orderby" dropdown with value "<Sort By>"
  	Then Verify product sorted "<Sort By>"
  	
    Examples: Sort info
      | Category  | List     | Sort By      | 
      | Computers | Desktops | Name: Z to A | 
      
      
  Scenario Outline: Sort Product Price: Low to High
    Given Click to "<Category>" in Top Menu
  	When Click to sub list with data "<List>"
  	And Select "products-orderby" dropdown with value "<Sort By>"
  	Then Verify product sorted "<Sort By>"
  	
    Examples: Sort info
      | Category  | List     | Sort By      	  | 
      | Computers | Desktops | Price: Low to High | 
      
         
  Scenario Outline: Sort Product Price: High to Low
    Given Click to "<Category>" in Top Menu
  	When Click to sub list with data "<List>"
  	And Select "products-orderby" dropdown with value "<Sort By>"
  	Then Verify product sorted "<Sort By>"
  	
    Examples: Sort info
      | Category  | List     | Sort By      	  | 
      | Computers | Desktops | Price: High to Low |   