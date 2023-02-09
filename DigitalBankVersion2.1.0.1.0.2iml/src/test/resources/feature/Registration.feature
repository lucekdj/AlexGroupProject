Feature: Verify a registration page functionality

  Background:
    Given user opens the website
    And verify user is in login page
    Then verify user cen see -Sign Up Here- button
    When  user click on -Sign Up- button
    Then verify user is in registration page

  Scenario Outline: verify user can choose proper title from drop down

    When user click on drop down Title bar
    Then verify options displayed
    When  user select "<option>"
    Then verify selected "<Title>" displayed

    Examples:
      | option        | Title         |
      | Please select | Please select |
      | Mr.           | Mr.           |
      | Ms.           | Ms.           |
      | Mrs.          | Mrs.          |

    Scenario: verify user can input first name

      When user entered the first name
      Then verify name is displayed

  Scenario: verify user can input last name

    When user entered the last name
    Then verify name is displayed

  Scenario Outline: verify user can select Gender
    When  user clicks radio button "<option>"
    Then  verify radio button displayed "<displayed gender>"

    Examples:

      | option | displayed gender |
      | M      | M                |
      | F      | F                |

    Scenario: verify user can enter date of birth

      When user enters MM/DD/YYYY
      Then verify date of birth is displayed

      Scenario Outline:




