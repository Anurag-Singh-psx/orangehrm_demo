package com.orangehrm.testcases.Login;

import com.orangehrm.automation.base.DriverFactory;
import com.orangehrm.automation.constants.Framework;
import com.orangehrm.automation.utils.ConfigReader;
import com.orangehrm.automation.utils.JsonReader;
import com.orangehrm.automation.utils.ProjectObjectManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseClass extends DriverFactory {
    protected ProjectObjectManager projectObjectManager;
    protected JsonReader jsonReader;

    @BeforeClass
    public void setUp() throws IOException {
        ConfigReader configReader = new ConfigReader();
        configReader.initConfigReader();

        System.out.println(configReader.getConfigValue("Browser")+": "+configReader.getConfigValue(Framework.Constants.CONFIG_PROPERTIES_BROWSER));
        initDriver(configReader.getConfigValue(Framework.Constants.CONFIG_PROPERTIES_BROWSER));
        getWebDriver().get(configReader.getConfigValue(Framework.Constants.CONFIG_PROPERTIES_URL));
        getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        projectObjectManager=new ProjectObjectManager(getWebDriver());
        jsonReader=new JsonReader();

        System.out.println("Setup completed");
    }

    @AfterTest
    public void tearDown(){
       //getWebDriver().quit();
    }
}
