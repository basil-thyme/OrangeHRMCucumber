Feature:UsersTest-search the created user and verify it

  @smoke
  Scenario: As an admin, I should be able to search the created user and verify it
    When I login to application
    And I click on Admin tab
    And I verify "System Users" text
    And I enter username next
    And I select user role
    And I select status
    And I click on search button
    Then I verify the User should be in Result list
