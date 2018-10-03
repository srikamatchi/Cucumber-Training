Feature: ECommerce Application
 
@RegressionTest
Scenario: UnSuccessful Login
Given This is a blank test
 
@SmokeTest 
Scenario: Add a product to bag
Given This is a blank test
 
@SmokeTest @RegressionTest
Scenario: Successful Login
Given This is a blank test
 
@SmokeTest @End2End
Scenario: Buy a product with cash payment
Given This is a blank test
 
@RegressionTest @End2End
Scenario: Buy a product with CC payment
Given This is a blank test
 
@End2End
Scenario Outline: Payment declined
Given This is a blank test
Examples:
|PaymentMethod|
|CC Card|
|DC Card|
