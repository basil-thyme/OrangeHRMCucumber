package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddUserPage extends Utilities {
    @FindBy(xpath = "//div[contains(text(),'Admin')]")
    WebElement userRoleAdmin;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;

    @FindBy(xpath = "//span[contains(text(),'Lisa')]")
    WebElement lisa;

    @FindBy(css = "div[class='oxd-form-row'] div[class='oxd-grid-2 orangehrm-full-width-grid'] div[class='oxd-grid-item oxd-grid-item--gutters'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']")
    WebElement username;

    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
    WebElement searchText;

    @FindBy(xpath = "(//span[normalize-space()='Disabled'])[1]")
    WebElement disable;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement password;

    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement confirmPassword;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]")
    WebElement saveButton;

    @FindBy(xpath = "//span[contains(text(),'Enabled')]")
    WebElement enable;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement successfullySaved;

    public void selectUserRoleAdmin(String text) {
        selectByVisibleTextFromDropDown(userRoleAdmin, text);
    }

    public void enterEmployeeName(String name) {
        sendTextToElement(employeeName, name);
        List<WebElement> suggList = driver.findElements(By.xpath("//span[contains(text(),'Lisa')]"));
        for (WebElement element : suggList) {
            System.out.println(element.getText());
        }
        mouseHoverToElementAndClick(lisa);
    }

    public void enterUsername(String name) {
        sendTextToElement(username, name);
    }

    public void clickOnStatusSelect() {
        clickOnElement(searchText);
    }

    public void clickOnDisable() {
        clickOnElement(disable);
    }

    public void enterPassword(String passWord) {
        sendTextToElement(password, passWord);
    }

    public void enterConfirmPassword(String conPassword) {
        sendTextToElement(confirmPassword, conPassword);
    }

    public void clickOnSave() {
        clickOnElement(saveButton);
    }

    public void clickOnEnable() {
        clickOnElement(enable);
    }

    public String getSuccessfullySavedText() {
        return getTextFromElement(successfullySaved);
    }


}

