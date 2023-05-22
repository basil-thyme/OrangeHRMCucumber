package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginStepDef {
    @When("^I enter username for login$")
    public void i_enter_username_for_login()  {
        new LoginPage().enterUsername("Admin");

    }

    @When("^I enter password for login$")
    public void i_enter_password_for_login()  {
        new LoginPage().enterPassword("admin123");
    }

    @When("^I click on login button$")
    public void i_click_on_login_button()  {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I verify \"([^\"]*)\" message$")
    public void i_verify_message(String arg1)  {
        Assert.assertEquals(new DashboardPage().getDashboardText(), "Dashboard", "Error message found");
    }

    @Then("^I verify logo is displayed$")
    public void iVerifyLogoIsDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        new LoginPage().verifyLogoIsDisplayed();

    }
}
