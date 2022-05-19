Feature: Create account

  Scenario: Create account with unique email
    Given user on Selenium demo page
    When user opens account page
    And registers with data
   |email|tests@onet.pl|
    |password|t3hJid8@j&%hheGG|
    Then should see logout link

