package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LogoutStepDef {
    @When("^I mouse hover on logout and click$")
    public void i_mouse_hover_on_logout_and_click() throws InterruptedException {
        Thread.sleep(2000);
      new LoginPage().mouseHoverAndClickOnLogout();
    }

    @Then("^I verify the text login panel is displayed$")
    public void i_verify_the_text_login_panel_is_displayed() {
        Assert.assertEquals(new LoginPage().getLoginText(), "Login", "Error message displayed");
    }

    @And("^I click on user profile logo$")
    public void iClickOnUserProfileLogo() throws InterruptedException {
        Thread.sleep(2000);
        new LoginPage().clickOnUserProfileLogo();
    }
}