Feature: New Savings feature

  Scenario Outline: Verify user can create a new savings account with valid information
    Given user enters valid "valid.username" and "valid.password"
    When user click on Sing In button
    And verify user id successfully logged in to the account
    When  user clicks on savings menu
    Then  verify new savings button is displayed
    When user clicks on new savings button
    Then verify user is on Create Savings page
    When user selects Savings Account Type "<option>"
    And user selects the account ownership "<ownership>"
    And user enters the account name "testAccount" and the initial deposit 3000
    And user clicks on submit button to create the savings account
    Then verify Successfully Created message for the savings account is displayed
    And verify that the amount displayed is the same as the amount entered by the user


    Examples:
      | option       | ownership  |
      | Savings      | Individual |
      | Money Market | Joint      |
      | Savings      | Joint      |
      | Money Market | Individual |
