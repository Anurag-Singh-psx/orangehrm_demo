package com.orangehrm.automation.utils;

import com.orangehrm.automation.constants.Framework;
import com.orangehrm.automation.keywords.KeywordEngine;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CommonUtils extends KeywordEngine {
    private WebDriver driver;

    public CommonUtils(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @Step("Assert visibility of element")
    public void assert_visibilityOfElementLocated_isDisplayed(By locator) {
        WebDriverWait wait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertTrue(element.isDisplayed());
    }

    public void clickOnTopNavbar(String item){
        String xpath="//*[@class='"+Framework.Classes.OXD_TOPBAR_BODY_NAV+"']//*[@class='"+Framework.Classes.OXD_TOPBAR_BODY_NAV_TAB_ITEM+"' and normalize-space(text())='"+item+"']";
        WebDriverWait webDriverWait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(90));
        try{
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
        }catch (Exception e){
            System.out.println("Failed to click on item under top nav bar.");
        }
    }
}
