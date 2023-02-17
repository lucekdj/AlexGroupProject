Feature: New Saving Account feature

  Background: Verify user is able to login with valid credential
    Given user enters valid "valid.username" and "valid.password"
    When user click on Sing In button
    Then verify user id successfully logged in to the account

  Scenario:
    Given user is on a Home page
    And click on Savings button
    Then click on New Savings
    And verify user is on New Savings Account page
    When user enters valid information on New Savings Account page
    And click Submit button
    Then verify user is on a View Savings Accounts page
    And make sure balance is correct