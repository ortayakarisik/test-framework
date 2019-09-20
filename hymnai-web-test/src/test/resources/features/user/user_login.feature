Feature: Login with email and password

  Scenario: Login for a user
    Given kemal is on the login page
    When he enter email field in login page for "k.demir@hymnai.com"
    And enter password field in login page for "kemal111"
  	And click the login button
    Then he logged in
    And should be on the home page


  Scenario: Login for a user with wrong credentials
    Given kemal is on the login page
    When he enter email field in login page for "k.demir@hymnai.com"
    And enter password field in login page for "kemal112"
  	And click the login button
    Then he stay on the login page
