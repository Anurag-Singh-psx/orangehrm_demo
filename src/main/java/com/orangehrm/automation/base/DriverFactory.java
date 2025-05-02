package com.orangehrm.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    private static WebDriver driver;

    public static void initDriver(String browserName){
        if (browserName.equalsIgnoreCase("Chrome")){
            ChromeOptions chromeOptions=new ChromeOptions();
            chromeOptions.addArguments("--incognito");
            chromeOptions.setAcceptInsecureCerts(true);
            driver=new ChromeDriver(chromeOptions);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
        }
    }

    public static WebDriver getWebDriver(){
        return  driver;
    }
}
