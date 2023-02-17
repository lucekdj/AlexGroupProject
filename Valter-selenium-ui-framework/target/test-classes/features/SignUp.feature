Feature: Sign Up feature

 Scenario: Verify user is able to sign up with valid information
  Given user clicks on Sign Up button
  Then user is on the first Sign Up page
  When user enters information
  And user clicks on Next button
  Then verify user is on second Sign Up page
  When user enters additional information
  And user clicks Register button
  Then verify user is back on login page

