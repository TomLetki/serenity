Feature: Create account

  Scenario Outline: Create account with unique email
    Given user on Selenium demo page
    When user open account page
    And registers with unique <email> and valid <password>
    Then should see logout link
    Examples:
      |email|password|
      |firstEmail6@gmail.com|12w%%g7hds7@gool.de|
      |secondEmail6@gmail.com|12w%%g7hds7@gool.de|
