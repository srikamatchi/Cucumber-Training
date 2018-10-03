Feature: Test Background Feature
Description: The purpose of this feature is to test the Background keyword
 
Background: Login functionality
	Given User is in the AUT login page
	When Enter Username & Password
	Then User must be logged in  
 
Scenario: Search a product 
	Given User search for Mobile
	When Adds the mobile to cart
	Then added must be displayed in the cart
 
Scenario: checks for the purchased product
	Given User navigates to the cart
	When Checks for the delivery details
	Then Current status must be displayed