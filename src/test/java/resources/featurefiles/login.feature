Feature:Login Test

  @regression
  Scenario: As a user, I should be able to login successfully
    When I enter username for login
    And I enter password for login
    And I click on login button
    Then I verify "Dashboard" message
    Then I verify logo is displayed

