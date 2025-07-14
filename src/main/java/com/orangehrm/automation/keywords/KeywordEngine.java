package com.orangehrm.automation.keywords;

import com.orangehrm.automation.base.DriverFactory;
import com.orangehrm.automation.constants.Framework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;

public class KeywordEngine extends DriverFactory {

    public void clickOnElement(WebElement webElement){
        if (webElement==null){
            throw new IllegalArgumentException("WebElement passed is null.");
        }
        WebDriverWait webDriverWait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(90));
        try{
            webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
            webElement.click();
            System.out.println("WebElement clicked.");
        }catch (Exception e){
            System.out.println("Failed to click on element."+e);
        }

    }

    public void setElement(WebElement webElement,String data){
        if (webElement==null){
            throw new IllegalArgumentException("WebElement passed is null.");
        }
        WebDriverWait webDriverWait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(90));
        try{
            webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
            webElement.clear();
            webElement.sendKeys(data);
        }catch (Exception e){
            System.out.println("Failed to set element."+e.toString());
        }

    }

    public boolean hasValidValues(Map<String,String> map,String key){
            if (map.containsKey(key) && map.get(key) != null && !map.get(key).trim().isEmpty()){
                return true;
            }
            else {
                return false;
            }
    }
}
