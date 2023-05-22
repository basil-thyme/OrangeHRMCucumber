package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utilities {

    @FindBy(xpath = "//span[normalize-space()='Admin']")
    WebElement admin;

    public void clickOnAdminTab() {
        clickOnElement(admin);
    }



}
