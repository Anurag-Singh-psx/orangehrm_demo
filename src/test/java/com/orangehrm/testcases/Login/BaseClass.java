package com.orangehrm.testcases.Login;

import com.orangehrm.automation.base.DriverFactory;
import com.orangehrm.automation.constants.Framework;
import com.orangehrm.automation.utils.ConfigReader;
import com.orangehrm.automation.utils.JsonReader;
import com.orangehrm.automation.utils.ProjectObjectManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

public class BaseClass extends DriverFactory {
    ProjectObjectManager projectObjectManager;
    JsonReader jsonReader;
    @BeforeTest
    public void setUp() throws IOException {
        ConfigReader configReader = new ConfigReader();
        configReader.initConfigReader();

        System.out.println(configReader.getConfigValue("Browser")+": "+configReader.getConfigValue(Framework.Constants.CONFIG_PROPERTIES_BROWSER));
        initDriver(configReader.getConfigValue(Framework.Constants.CONFIG_PROPERTIES_BROWSER));
        getWebDriver().get(configReader.getConfigValue(Framework.Constants.CONFIG_PROPERTIES_URL));
        projectObjectManager=new ProjectObjectManager();
        jsonReader=new JsonReader();
    }

    @AfterClass
    public void tearDown(){
       //getWebDriver().quit();
    }
}
