Feature: Log in
  Scenario:  User should be able to log in with valid credentials
    Given: User is on log in page
    When User enters valid username
    And User enters valid password
    Then User should be logged in successfully




  Scenario:  User should not be able to log in with invalid credentials
    Given User is on log in page
    When User  enters invalid username
    And User enters valid password
    Then user should not be able to logged in
