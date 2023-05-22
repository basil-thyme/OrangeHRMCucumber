package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ViewSystemUsersPage extends Utilities {

    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement username;

    @FindBy(xpath = "(//span[contains(text(),'Admin')])[1]")
   WebElement admin;

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[1]")
    WebElement searchText;

    @FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
    WebElement searchButton;

    @FindBy(xpath = "//div[contains(text(),'Will Smith')]")
    WebElement name;

    @FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[2]")
    WebElement checkBox;

    @FindBy(xpath = "(//button[normalize-space()='Delete Selected'])[1]")
    WebElement deleteButton;

    @FindBy(xpath = "(//button[normalize-space()='Yes, Delete'])[1]")
    WebElement yesDelete;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement deleted;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement noRecordFound;


    public void enterUsername(String name) {
        sendTextToElement(username, name);
    }

    public void selectUserRoleFromDropDown() {
        sendTextToElement(searchText, "Admin");

        List<WebElement> suggList = driver.findElements(By.xpath("(//span[contains(text(),'Admin')])[1]"));
        for (WebElement element : suggList) {
            System.out.println(element.getText());
        }
        mouseHoverToElementAndClick(admin);
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
    }

    public String getUserShouldBeInListText() {
        return getTextFromElement(name);
    }

    public void clickOnCheckBox() {
        clickOnElement(checkBox);
    }

    public void clickOnDeleteButton() {
        clickOnElement(deleteButton);
    }

    public void clickOnYesDeleteButton() {
        clickOnElement(yesDelete);
    }

    public String getSuccessfullyDeletedText() {
        return getTextFromElement(deleted);
    }

    public String getNoRecordFoundText() {
        return getTextFromElement(noRecordFound);
    }
}

