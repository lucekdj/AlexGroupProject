Feature: Testing the login functionality

  Background:
    Given user opens the website
    And verify user is in login page
    Then verify user cen see Sign Up Here button

  Scenario: verify user can login with valid credentials

    When user enters username "usernameJulius" and password "password2011"
    And user click in the sign in button
    Then homepage should be displayed

  Scenario Outline: verify user can not login with valid credentials



    When user enters username "<username>" and password "<password>"
    And user click in the sign in button
    Then verify error message will displayed

    Examples:
      | username       | password     |
      | usernameJuliu  | password2011 |
      | usernameJulius | password2011 |
      | usernameJulius |              |
      |                | password2011 |
      |                |              |