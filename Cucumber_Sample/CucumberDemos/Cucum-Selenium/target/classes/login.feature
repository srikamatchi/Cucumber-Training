Feature: Mercury Login
  
  Scenario: Login
    Given Login must be done only by registered user
    When Enter the valid credentials
    Then display logged in successfully
