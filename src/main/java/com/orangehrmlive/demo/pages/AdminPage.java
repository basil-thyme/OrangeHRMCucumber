package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Utilities {

    @FindBy(xpath = "//h5[normalize-space()='System Users']")
    WebElement systemUser;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement add;

    @FindBy(xpath = "//h6[normalize-space()='Add User']")
    WebElement addUser;

    public String getSystemUserText() {
        return getTextFromElement(systemUser);
    }

    public void clickOnAddButton() {
        clickOnElement(add);
    }

    public String getAddUserText() {
        return getTextFromElement(addUser);
    }

}
