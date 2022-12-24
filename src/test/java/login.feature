Feature: cydeo web test

  Scenario:
  Login should be success

    Given user navigate
    Given user clicks
    Given user enter the username
    Given user enter the password
    When user click on the login but
    Then login should be success
