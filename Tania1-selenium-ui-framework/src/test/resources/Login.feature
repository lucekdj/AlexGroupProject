Feature: Login feature
  Scenario: Verify user is able to login with valid credential
    Given user enters valid username and password
    When user click on Sing In button
    Then verify user id successfully logged in to the account