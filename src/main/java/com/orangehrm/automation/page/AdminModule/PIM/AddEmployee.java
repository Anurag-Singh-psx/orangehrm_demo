package com.orangehrm.automation.page.AdminModule.PIM;

import com.orangehrm.automation.constants.Framework;
import com.orangehrm.automation.keywords.KeywordEngine;
import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class AddEmployee extends KeywordEngine {
     private WebDriver driver;
     JavascriptExecutor javascriptExecutor;
     public AddEmployee(WebDriver driver){
         this.driver=driver;
         PageFactory.initElements(driver,this);
     }
     @FindBy(xpath = "//*[contains(@class,'"+ Framework.Classes.ORANGE_HRM_FIRST_NAME +"')]")
     WebElement firstNameField;

     @FindBy(xpath = "//*[contains(@class,'"+Framework.Classes.ORANGE_HRM_LAST_NAME+"')]")
     WebElement lastNameField;

     @FindBy(xpath = "//*[contains(@class,'"+Framework.Classes.ORANGE_HRM_MIDDLE_NAME+"')]")
     WebElement middleNameField;

     @FindBy(css = "input[type='checkbox']")
     WebElement employeeIdField;

    @FindBy(xpath = "//*[@class='"+Framework.Classes.ORANGE_HRM_EMPLOYEE_FORM+"']/*[contains(@class,'"+Framework.Classes.USER_FORM_HEADER+"')]/following-sibling::div[1]//input[contains(@class,'"+Framework.Classes.OXD_INPUT+"')]")
    WebElement userNameField;

    @FindBy(xpath = "//*[@class='"+Framework.Classes.ORANGE_HRM_EMPLOYEE_FORM+"']/*[contains(@class,'"+Framework.Classes.USER_FORM_HEADER+"')]/following-sibling::*[contains(@class,'"+Framework.Classes.USER_PASSWORD_ROW+"')]//input[@type='password'][1]")
    WebElement passwordField;

    @FindBy(xpath = "//*[@class='"+Framework.Classes.ORANGE_HRM_EMPLOYEE_FORM+"']/*[contains(@class,'"+Framework.Classes.USER_FORM_HEADER+"')]/following-sibling::*[contains(@class,'"+Framework.Classes.USER_PASSWORD_ROW+"')]//input[@type='password'][2]")
    WebElement confirmPasswordField;


     public void addEmployeeDetails(Map<String,String> data){
         if (hasValidValues(data,Framework.Keys.FIRST_NAME)){
            setElement(firstNameField,data.get(Framework.Keys.FIRST_NAME));
         }
         if (hasValidValues(data,Framework.Keys.LAST_NAME)){
             setElement(lastNameField,data.get(Framework.Keys.LAST_NAME));
         }
         if (hasValidValues(data,Framework.Keys.MIDDLE_NAME)){
             setElement(middleNameField,data.get(Framework.Keys.MIDDLE_NAME));
         }
    }

    public void addLoginDetails(Map<String,String> data){
        if (!(employeeIdField.isSelected())){
            javascriptExecutor=(JavascriptExecutor) driver;
            javascriptExecutor.executeScript("arguments[0].click()",employeeIdField);
        }
        if (hasValidValues(data,Framework.Keys.USER_NAME)){
            setElement(userNameField,data.get(Framework.Keys.USER_NAME));
        }
        if (hasValidValues(data,Framework.Keys.ENABLED)){
            WebElement enableRadio= driver.findElement(By.xpath(
                    "//*[@class='"+Framework.Classes.ORANGE_HRM_EMPLOYEE_FORM+"']" +
                            "/*[contains(@class,'"+Framework.Classes.USER_FORM_HEADER+"')]/following-sibling::div[1]" +
                            "//*[@class='"+Framework.Classes.STATUS_GROUPED_FIELD+"']//" +
                            "input[@type=\"radio\" and @value='"+data.get(Framework.Keys.ENABLED)+"']"));
            javascriptExecutor=(JavascriptExecutor) driver;
            javascriptExecutor.executeScript("arguments[0].click()",enableRadio);
        }
        if (hasValidValues(data,Framework.Keys.DISABLED)){
            WebElement enableRadio= driver.findElement(By.xpath(
                    "//*[@class='"+Framework.Classes.ORANGE_HRM_EMPLOYEE_FORM+"']" +
                            "/*[contains(@class,'"+Framework.Classes.USER_FORM_HEADER+"')]/following-sibling::div[1]" +
                            "//*[@class='"+Framework.Classes.STATUS_GROUPED_FIELD+"']//" +
                            "input[@type=\"radio\" and  @value='"+data.get(Framework.Keys.DISABLED)+"']"));
            javascriptExecutor=(JavascriptExecutor) driver;
            javascriptExecutor.executeScript("arguments[0].click()",enableRadio);
        }

        if (hasValidValues(data,Framework.Keys.PASSWORD)){
            setElement(passwordField,data.get(Framework.Keys.PASSWORD));
        }

        if (hasValidValues(data,Framework.Keys.CONFIRM_PASSWORD)){
            setElement(confirmPasswordField,data.get(Framework.Keys.CONFIRM_PASSWORD));
        }
    }

}
