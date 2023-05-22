Feature:UsersTest-Delete user

#  @regression
  Scenario: As an admin, I should be able verify that admin delete the user successfully
    When I login to application
    And I click on Admin tab
    And I verify "System Users" text
    And I enter username for delete user test
    And I select user role for delete user test
    And I select status for delete user test
    And I click on search button for delete user test
    And I verify the User should be in Result list in delete user test
    And I click on check box
    And I click on delete button
    And Popup will display
    And I click on ok button on popup
    Then I verify "Successfully Deleted" message afterwards
    Then I verify the message "No records found"

