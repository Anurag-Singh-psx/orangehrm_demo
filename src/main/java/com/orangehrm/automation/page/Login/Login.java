package com.orangehrm.automation.page.Login;

import com.orangehrm.automation.constants.Framework;
import com.orangehrm.automation.keywords.KeywordEngine;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class Login extends KeywordEngine {
    private WebDriver driver;

    public Login(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = Framework.Constants.USER_NAME)
    WebElement userNameField;

    @FindBy(name = Framework.Constants.PASSWORD)
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(@class,'"+ Framework.Classes.ORANGE_HRM_LOGIN_BUTTON +"')]")
    WebElement loginButton;

    @Step("Enter admin login details")
    public void enterLoginDetails(Map<String,String> dataCells){
        if (dataCells.containsKey(Framework.Constants.USER_NAME)){
            setElement(userNameField,dataCells.get(Framework.Constants.USER_NAME));
        }
        if (dataCells.containsKey(Framework.Constants.PASSWORD)){
            setElement(passwordField,dataCells.get(Framework.Constants.PASSWORD));
        }
    }

    @Step("Click on login button")
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
}
