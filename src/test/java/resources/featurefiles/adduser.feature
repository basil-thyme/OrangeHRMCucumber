Feature:UsersTest-Add user

  @sanity
  Scenario: As an admin, I should add user successfully
    When I login to application
    And I click on Admin tab
    And I verify "System Users" text
    And I click on Add button
    And I verify "Add User" text next
    And I select user role Admin
    And I enter employee name
    And I enter username
    And I select status "Disable"
    And I enter password
    And I enter confirm password
    And I click on save button
    Then I verify message "Successfully saved"





