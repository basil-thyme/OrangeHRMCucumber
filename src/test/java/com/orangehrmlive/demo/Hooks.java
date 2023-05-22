package com.orangehrmlive.demo;

import com.cucumber.listener.Reporter;
import com.orangehrmlive.demo.propertyreader.PropertyReader;
import com.orangehrmlive.demo.utility.Utilities;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends Utilities {
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));

    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed())  {

            String screenShotPath = Utilities.getScreenshot(driver,scenario.getName().replace(" ","_" ));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //closeBrowser();
    }



}
