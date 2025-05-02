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
}
