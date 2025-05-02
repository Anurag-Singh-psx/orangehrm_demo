package com.orangehrm.testcases.Login;

import com.orangehrm.automation.Listeners.AllureTestListeners;
import com.orangehrm.automation.constants.Framework;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
@Listeners({io.qameta.allure.testng.AllureTestNg.class,AllureTestListeners.class})
@Epic("LOGIN SCRIPT")
@Feature("Admin Login")
@Story("001 | Verify admin login to OrangeHRM")

public class _01_AdminLogin extends BaseClass{

    @Step("TC- Enter admin login details")
    @Description("TC- Enter admin login details")
    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void enterAdminLoginDetails() throws IOException {
        jsonReader.initJsonReader(new File(Framework.Paths.PROJECT_PATH+Framework.TestDataPaths.LOGIN_JSON));
        String username= jsonReader.getValue("ADMIN_LOGIN","USERNAME");
        String password= jsonReader.getValue("ADMIN_LOGIN","PASSWORD");

        Map<String,String> loginDetails=new HashMap<>();
        loginDetails.put(Framework.Constants.USER_NAME,username);
        loginDetails.put(Framework.Constants.PASSWORD,password);
        projectObjectManager.loginPage().enterLoginDetails(loginDetails);
    }

    @Step("TC- Enter admin login details")
    @Test
    @Description("TC- Verify admin login")
    @Severity(SeverityLevel.CRITICAL)
    public void verifyAdminLogin() throws InterruptedException {
        projectObjectManager.loginPage().clickOnLoginButton();
        projectObjectManager.commonUtilsPage().assert_visibilityOfElementLocated_isDisplayed(By.xpath("//*[contains(@class,'"+Framework.Classes.OXD_USER_DROPDOWN_NAME+"')]"));
    }

}
