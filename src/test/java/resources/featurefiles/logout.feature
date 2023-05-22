Feature:Logout Test

  @regression
  Scenario: As a user, I should be able to verify that I should be able to logout successfully
    When I enter username for login
    And I enter password for login
    And I click on login button
    And I click on user profile logo
    And I mouse hover on logout and click
    Then I verify the text login panel is displayed
