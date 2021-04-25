@myaccount
Feature: My Account Feature

	
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
   | Male   | tuan      | le       | 29         		| March      		 | 1993        		   | tuanla02@gmail.com | ABC     | 123123   | 123123          |Your registration completed| 
   
  
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
   | tuanla02@gmail.com| 123123   |
   
   
	@editMyAccount
  Scenario Outline: Edit My Account info
  	Given Click to "My account" link text
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
  
    #Button
    And Click to "Save" button
    
    #Verify
    Then Verify "FirstName" textbox displayed with value "<FirstName>"
    And Verify "LastName" textbox displayed with value "<LastName>"
     
    And Verify "DateOfBirthDay" dropdown displayed with value "<DateOfBirthDay>"
    And Verify "DateOfBirthMonth" dropdown displayed with value "<DateOfBirthMonth>"
    And Verify "DateOfBirthYear" dropdown displayed with value "<DateOfBirthYear>"
    
		And Verify "Email" textbox displayed with value "<Email>"
		And Verify "Company" textbox displayed with value "<Company>"
    
   Examples: My Account info
	 | Gender | FirstName | LastName | DateOfBirthDay | DateOfBirthMonth | DateOfBirthYear | Email              	 | Company |
   | Female | diem      | trang    | 13         		| February      	 | 1998        		 | diemtrang04@gmail.com | DEF     |
   
   @address
    Scenario Outline: Add Address Info
    #Navi Menu
    Given Click to "Addresses" navigation menu
    
    #Button
    And Click to "Add new" button
    
    #Textbox
    When Input to "Address.FirstName" textbox with value "<FirstName>"
    And Input to "Address.LastName" textbox with value "<LastName>"
    And Input to "Address.Email" textbox with value "<Email>"
    And Input to "Address.Company" textbox with value "<Company>"

		#Dropdown
		And Select "Address.CountryId" dropdown with value "<Country>"
		And Select "Address.StateProvinceId" dropdown with value "<State>"
		
		#Textbox
		And Input to "Address.City" textbox with value "<City>"
    And Input to "Address.Address1" textbox with value "<Address1>"
    And Input to "Address.Address1" textbox with value "<Address1>"
    And Input to "Address.Address2" textbox with value "<Address2>"
    And Input to "Address.ZipPostalCode" textbox with value "<Zip>"
    And Input to "Address.PhoneNumber" textbox with value "<Phone>"
    And Input to "Address.FaxNumber" textbox with value "<Fax>"
    
    #Button
    And Click to "Save" button
    
    #Verify
    Then Verify "email" address displayed with value "<Email>"
    Then Verify "phone" address displayed with value "<Phone>"
    Then Verify "fax" address displayed with value "<Fax>"
    Then Verify "company" address displayed with value "<Company>"
    Then Verify "address1" address displayed with value "<Address1>"
    Then Verify "address2" address displayed with value "<Address2>"
    Then Verify "country" address displayed with value "<Country>"
    
    Then Verify "name" address displayed with value "<FirstName>""<LastName>"
    Then Verify "city-state-zip" address displayed with value "<City>""<State>""<Zip>"
     

 	Examples: Address info
      | FirstName | LastName | Email                 | Company | Country       | State | City | Address1   | Address2         | Zip    | Phone      | Fax        | 
      | diem      | trang    | diemtrang03@gmail.com | DEF     | United States | Guam  | HCM  | le duc tho | nguyen van luong | 880000 | 0909090909 | 1234567890 | 
  
  
  @changePassowrd
  Scenario Outline: Change Password
  #Navi Menu
    Given Click to "Change password" navigation menu
    When Input to "OldPassword" textbox with value "<Old Passwrod>"
    And Input to "NewPassword" textbox with value "<New Password>"
    And Input to "ConfirmNewPassword" textbox with value "<New Password>"
    
    #Button
    And Click to "Change password" button
    Then Change Password success message "Password was changed" displayed
    When Click to close button in success notification
    Given Click to "Log out" link text
    #Link
    And Click to "Log in" link text
    
    #Textbox 
    When Input to "Email" textbox with value "<Email>"
    And Input to "Password" textbox with value "<New Password>"
    
    #Button
    And Click to "Log in" button
    
    #Link
    Then Verify "Log out" link text is displayed  
     
    Examples: Change Passwort info
      | Old Passwrod | New Password | Email              		| 
      | 123123       | 123321       | diemtrang04@gmail.com | 
  
  @productReivew
  Scenario Outline: My Product Review
  	Given Click to "<Category>" in Top Menu
  	When Click to sub list with data "<List>"
  	When Click to Add To Cart with product name "<Product Name>"
  	And Click to Add Your Review link text
  
   	And Input to "AddProductReview.Title" textbox with value "<Review Title>"
   	And Input to "AddProductReview.ReviewText" textbox with value "<Review Content>"
   	And Click to Rating radio button with value "<Rating>"
   
   	And Click to "Submit review" button
  	Then Success message displayed "Product review is successfully added."
  	And Click to "My account" link text
  	And Click to "My product reviews" navigation menu
  	And Verify Product Review Title diplayed with "<Review Title>"
  	And Verify Product Review Content diplayed with "<Review Content>"
  	
    Examples: Change Passwort info
      | Category  | List     | Product Name            | Review Title | Review Content | Rating | 
      | Computers | Desktops | Build your own computer | The first    | it's OK        | 4      | 
  
  	
  