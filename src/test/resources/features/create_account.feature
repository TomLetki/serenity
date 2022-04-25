Feature: Create account

  Scenario: Create account with unique email
    Given user on Selenium demo page
    When user open account page
    And register with unique email and valid password
    Then should see logout link