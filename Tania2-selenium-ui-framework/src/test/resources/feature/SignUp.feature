Feature: Sign up feature

  Scenario Outline: Verify user is able to sign up with valid information
    Given user click on Sign Up button
    Then verify user is on first Sign Up page
    When user enters valid information for gender "<title>"
    And user click on Next button
    Then verify user is on a second page
    When user enters valid information on a second page
    And user clicks Register button
    Then verify user is back to a login page and successful message is displayed

    Examples:
      | title |
      | Mr.   |
      | Ms.   |
      | Mrs.  |




