Feature: Register with email, name and password

  Scenario: Register for a user
    Given kemal is on the register page
    When he enter name field in register page for "kemal demir"
    And email field in register page for "generate random email"
    And enter password field in register page for "kemal111"
  	And click the privacy check box
  	And click the register button
    Then he logged in
    And should be on the home page

  Scenario: Try register for an existing user
    Given kemal is on the register page
    When he enter name field in register page for "kemal demir"
    And email field in register page for "k.demir@hymnai.com"
    And enter password field in register page for "kemal111"
  	And click the privacy check box
  	And click the register button
    Then he stay on the register page
