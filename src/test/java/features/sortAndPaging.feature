@sortAndPaging
Feature: Sort And Paging Feature
	 
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
      
   
  Scenario Outline: Paging display with 3 Product
   Given Click to "<Category>" in Top Menu
   When Click to sub list with data "<List>"
   And Select "products-pagesize" dropdown with value "<Display>"
   Then Verify search result display with "<Number Product>" products
   And Verify "NextPage" icon is displayed
   And Click to "NextPage" icon
   And Verify "PreviousPage" icon is displayed
   And Click to "PreviousPage" icon
   And Verify "NextPage" icon is displayed
   
   
    Examples: Sort info
      | Category  | List      | Display | Number Product | 
      | Computers | Notebooks | 3       | 3              | 
      
      
         
  Scenario Outline: Paging display with 6 Product
   Given Click to "<Category>" in Top Menu
   When Click to sub list with data "<List>"
   And Select "products-pagesize" dropdown with value "<Display>"
   Then Verify search result display with "<Number Product>" products
   And Verify "NextPage" icon is not displayed

    Examples: Sort info
      | Category  | List      | Display | Number Product | 
      | Computers | Notebooks | 6       | 6              | 
   
   
   
  Scenario Outline: Paging display with 9 Product
   Given Click to "<Category>" in Top Menu
   When Click to sub list with data "<List>"
   And Select "products-pagesize" dropdown with value "<Display>"
   Then Verify search result display with "<Number Product>" products
   And Verify "NextPage" icon is not displayed

    Examples: Sort info
      | Category  | List      | Display | Number Product | 
      | Computers | Notebooks | 9       | 6              | 
   
   
   
   
   
   
   