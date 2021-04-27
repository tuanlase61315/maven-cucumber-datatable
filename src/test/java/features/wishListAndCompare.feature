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
		
		
		
    Examples: Register info
      | Gender | FirstName | LastName | DateOfBirthDay | DateOfBirthMonth | DateOfBirthYear | Email              | Company | Password | ConfirmPassword | Message                     | 
      | Male   | tuan      | le       | 29             | March            | 1993            | tuanla26@gmail.com | ABC     | 123123   | 123123          | Your registration completed | 
  
  

	
   Scenario Outline:: Add to wishlist
    Given Click to "<Category>" in Top Menu
  	When Click to sub list with data "<List>"
  	When Click to product name "<Product Name>"
  	And Click to product "<Button>" button
  	Then Verify Add to wishlist success with "<Message>"
  	Given Open "<Page>" footer page
  	Then Verify Column "<Column>" displayed "<Product Name>" in "<Table>" 
  	When Click to Your Wishlist URL
  	Then Verify Page Title displayed with "<WishlistTitle>"
   
    Examples: Add wishlist
      | Category  | List     | Product Name                        | Message                                     | Page     | Table | Column     | Button          | WishlistTitle       | 
      | Computers | Desktops | Lenovo IdeaCentre 600 All-in-One PC | The product has been added to your wishlist | Wishlist | cart  | Product(s) | add-to-wishlist | Wishlist of tuan le | 
  
     
   Scenario Outline:: Add product to Cart from Wishlist Page
   	Given Click to "<Category>" in Top Menu
  	Given Open "<Page>" footer page
  	When Click to Checkbox Row "<Row>" in column "<Column>" of Table "<Table>"
  	And Click to "Add to cart" button
  	Then Verify Page Title displayed with "<ShoppingCartTitle>"
  	Given Open "<Page>" footer page
  	Then Verify No Data Message is displayed with "<Message>"
  	
    Examples: Add to Shopping Cart
     | Category  | Message                | Page     |Row| Table | Column      | ShoppingCartTitle | 
     | Computers | The wishlist is empty! | Wishlist | 1 |cart   | Add to cart | Shopping cart     | 
  
      
      
      
      
      
      
      
      
      
      

      
      
      
      
      
      
      
      
      
      