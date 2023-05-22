package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class DeleteUserStepDef {
    @When("^I click on check box$")
    public void i_click_on_check_box() {
        new ViewSystemUsersPage().clickOnCheckBox();
    }

    @When("^I click on delete button$")
    public void i_click_on_delete_button()  {
        new ViewSystemUsersPage().clickOnDeleteButton();
    }

    @When("^Popup will display$")
    public void popup_will_display()  {

    }

    @When("^I click on ok button on popup$")
    public void i_click_on_ok_button_on_popup()  {
        new ViewSystemUsersPage().clickOnYesDeleteButton();

    }

    @Then("^I verify \"([^\"]*)\" message afterwards$")
    public void i_verify_message_afterwards(String arg1) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals( new ViewSystemUsersPage().getSuccessfullyDeletedText(), "Successfully Deleted", "Error message displayed");
    }


    @And("^I enter username for delete user test$")
    public void iEnterUsernameForDeleteUserTest() {
        new ViewSystemUsersPage().enterUsername("Will Smith");

    }

    @And("^I select user role for delete user test$")
    public void iSelectUserRoleForDeleteUserTest() {
        new ViewSystemUsersPage().selectUserRoleFromDropDown();
    }

    @And("^I select status for delete user test$")
    public void iSelectStatusForDeleteUserTest() {
        new AddUserPage().clickOnStatusSelect();
        new AddUserPage().clickOnDisable();
    }

    @And("^I click on search button for delete user test$")
    public void iClickOnSearchButtonForDeleteUserTest() {
        new ViewSystemUsersPage().clickOnSearchButton();
    }

    @And("^I verify the User should be in Result list in delete user test$")
    public void iVerifyTheUserShouldBeInResultListInDeleteUserTest() throws InterruptedException {
        Assert.assertEquals(new ViewSystemUsersPage().getUserShouldBeInListText(), "Will Smith", "Error message displayed");
    }

    @Then("^I verify the message \"([^\"]*)\"$")
    public void iVerifyTheMessage(String arg0) throws Throwable {
        Thread.sleep(2000);
        Assert.assertEquals(new ViewSystemUsersPage().getNoRecordFoundText(), "No Records Found", "Error message displayed");
    }
}
