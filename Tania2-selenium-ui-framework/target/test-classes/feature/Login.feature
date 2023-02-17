Feature: Login feature


  Scenario: Verify user is able to login with valid credential
    Given user enters valid "valid.username" and "valid.password"
    When user click on Sing In button
    Then verify user id successfully logged in to the account


  Scenario: Verify user is unable to login with invalid credential
    Given user enters invalid "invalid.username" and "invalid.password"
    When user click on Sing In button after he put invalid credential
    Then verify user id unsuccessfully logged in to the account