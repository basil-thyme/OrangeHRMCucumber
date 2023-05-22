package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AddUserStepDef {
    @When("^I login to application$")
    public void i_login_to_application() throws InterruptedException {
        new LoginPage().enterUsername("Admin");
        new LoginPage().enterPassword("admin123");
        Thread.sleep(2000);
        new LoginPage().clickOnLoginButton();

    }

    @When("^I click on Admin tab$")
    public void i_click_on_Admin_tab() {
        new HomePage().clickOnAdminTab();
    }


    @When("^I verify \"([^\"]*)\" text$")
    public void i_verify_text(String arg1) {
         Assert.assertEquals(new AdminPage().getSystemUserText(),"System Users", "Error message");
    }

    @When("^I click on Add button$")
    public void i_click_on_Add_button() {
        new AdminPage().clickOnAddButton();

    }

    @When("^I select user role Admin$")
    public void i_select_user_role_Admin() {
        new ViewSystemUsersPage().selectUserRoleFromDropDown();

    }

    @When("^I enter employee name$")
    public void i_enter_employee_name() {
        new AddUserPage().enterEmployeeName("Lisa");

    }

    @When("^I enter username$")
    public void i_enter_username() {
        new AddUserPage().enterUsername("Will Smith");

    }

    @When("^I select status \"([^\"]*)\"$")
    public void i_select_status(String arg1) {
        new AddUserPage().clickOnStatusSelect();
        new AddUserPage().clickOnDisable();

    }

    @When("^I enter password$")
    public void i_enter_password() {
        new AddUserPage().enterPassword("Smith@123456");

    }

    @When("^I enter confirm password$")
    public void i_enter_confirm_password() {
        new AddUserPage().enterConfirmPassword("Smith@123456");

    }

    @When("^I click on save button$")
    public void i_click_on_save_button() throws InterruptedException {
        Thread.sleep(2000);
        new AddUserPage().clickOnSave();

    }

    @Then("^I verify message \"([^\"]*)\"$")
    public void i_verify_message(String arg1) {
       Assert.assertEquals(new AddUserPage().getSuccessfullySavedText(), "Successfully Saved", "Error message found");
    }


    @And("^I verify \"([^\"]*)\" text next$")
    public void iVerifyTextNext(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals( new AdminPage().getAddUserText(),"Add User", "Error message");

    }
}
