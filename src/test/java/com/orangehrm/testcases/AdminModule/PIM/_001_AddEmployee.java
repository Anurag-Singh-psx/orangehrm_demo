package com.orangehrm.testcases.AdminModule.PIM;

import com.orangehrm.automation.Listeners.AllureTestListeners;
import com.orangehrm.automation.constants.Framework;
import com.orangehrm.testcases.Login.BaseClass;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
@Listeners({io.qameta.allure.testng.AllureTestNg.class,AllureTestListeners.class})
@Epic("Admin Module")
@Feature("PIM")
@Story("001 | Verify add employee")

public class _001_AddEmployee extends BaseClass {

    Map<String,String> data;

    @Test(priority = 0)
    @Description("Add employee details.")
    @Severity(SeverityLevel.CRITICAL)
    public void addEmployeeDetails() throws InterruptedException {
        projectObjectManager.sidebarPage().clickOnMenuItem(Framework.Constants.PIM);
        projectObjectManager.commonUtilsPage().clickOnTopNavbar(Framework.Constants.ADD_EMPLOYEE);
        data=new HashMap<>();
        data.put(Framework.Keys.FIRST_NAME,"firstName");
        data.put(Framework.Keys.LAST_NAME,"lastname");
        projectObjectManager.addEmployeePage().addEmployeeDetails(data);
    }

    @Test(priority = 1)
    @Description("Add login details for employee")
    @Severity(SeverityLevel.CRITICAL)
    public void addEmployeesLoginDetails() throws InterruptedException {
        data=new HashMap<>();
        data.put(Framework.Keys.USER_NAME,"username");
        data.put(Framework.Keys.ENABLED,"1");
        projectObjectManager.addEmployeePage().addLoginDetails(data);
    }
}
