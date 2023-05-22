package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends Utilities {

    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    WebElement dashboard;

    public String getDashboardText() {
        return getTextFromElement(dashboard);
    }
}
