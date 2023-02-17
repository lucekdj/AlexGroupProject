Feature: Create New Checking Account feature
  Scenario: verify user can create checking account with valid information
    Given user is logged in
    And user is on the homepage
    When  user clicks on checking menu
    Then  verify new checking button is displayed
    When user clicks on new checking button
    Then verify user is on Create Checking page
    When user enters the valid information
    And user clicks on submit button
    Then verify Successfully Created message is displayed






