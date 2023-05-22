package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CreateAndVerifyUserStepDef {

    @When("^I enter username next$")
    public void i_enter_username_next()  {
      new ViewSystemUsersPage().enterUsername("Will Smith");
    }

    @When("^I select user role$")
    public void i_select_user_role() throws InterruptedException {
        Thread.sleep(2000);
        new ViewSystemUsersPage().selectUserRoleFromDropDown();

    }

    @When("^I select status$")
    public void i_select_status()  {
        new AddUserPage().clickOnStatusSelect();
        new AddUserPage().clickOnDisable();
    }

    @When("^I click on search button$")
    public void i_click_on_search_button() throws InterruptedException {
        Thread.sleep(2000);
        new ViewSystemUsersPage().clickOnSearchButton();

    }

    @Then("^I verify the User should be in Result list$")
    public void i_verify_the_User_should_be_in_Result_list() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(new ViewSystemUsersPage().getUserShouldBeInListText(), "Will Smith", "Error message displayed");
    }





}
