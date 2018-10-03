Feature: Regular expression
Scenario: Login Functionality
Given User will login with "abc" and "abc123"
Scenario Outline: Login to the application using credentials
Given Login using <Username>  and <Password>
Examples:
|Username|Password|
|user1|pass2|
|user2|pass2|




