package com.orangehrm.automation.page.extras;

import com.orangehrm.automation.constants.Framework;
import com.orangehrm.automation.keywords.KeywordEngine;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Sidebar extends KeywordEngine {
    private WebDriver driver;

    public Sidebar(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[contains(@class,'"+ Framework.Classes.OXD_MAIN_MENU_ITEM_NAME +"')]")
    WebElement menuItems;

    //@FindBy(xpath = "//*[contains(@class,'"+Framework.Classes.OXD_MAIN_MENU_BUTTON+"')]//*[contains(@class,'"+Framework.Classes.BI_CHEVRON_RIGHT+"')]")
    //WebElement sidebarClose;

    //@FindBy(xpath = "//*[contains(@class,'"+Framework.Classes.OXD_MAIN_MENU_BUTTON+"')]//*[contains(@class,'"+Framework.Classes.BI_CHEVRON_LEFT+"')]")
    //WebElement sidebarOpen;

    public void clickOnMenuItem(String menuTitle){
        WebElement menu= driver.findElement(By.xpath("//*[contains(@class,'"+ Framework.Classes.OXD_MAIN_MENU_ITEM_NAME +"') and contains(normalize-space(.),'"+menuTitle+"')]"));
        clickOnElement(menu);
    }
}
