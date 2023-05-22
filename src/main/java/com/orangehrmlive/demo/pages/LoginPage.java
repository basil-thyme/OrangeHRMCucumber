package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utilities {

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    @FindBy(xpath = "//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']")
    WebElement HRLogo;

    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement orangeHrmLogo;

   // @FindBy(xpath = "//p[contains(text(),'Updated Collings')]")
    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement profileLogo;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logout;

    @FindBy(tagName ="h5" )
    WebElement login;

    public void enterUsername(String name) {
        sendTextToElement(username, name);
    }

    public void enterPassword(String passWord) {
        sendTextToElement(password, passWord);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public void verifyLogoIsDisplayed() {
        //WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']"));
        WebElement hrmLogo = driver.findElement(By.xpath("//img[@alt='client brand banner']"));
        if (hrmLogo.isDisplayed()) {
            System.out.println("Logo is displayed on the login page");
        } else {
            System.out.println("Logo is not displayed on the login page");
        }
    }

    public void clickOnUserProfileLogo() {
        clickOnElement(profileLogo);
    }

    public void mouseHoverAndClickOnLogout() {
        mouseHoverToElementAndClick(logout);
    }

    public String getLoginText() {
        return getTextFromElement(login);
    }


}
