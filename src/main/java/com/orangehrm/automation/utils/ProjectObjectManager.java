package com.orangehrm.automation.utils;

import com.orangehrm.automation.base.DriverFactory;
import com.orangehrm.automation.page.AdminModule.PIM.AddEmployee;
import com.orangehrm.automation.page.Login.Login;
import com.orangehrm.automation.page.extras.Sidebar;
import org.openqa.selenium.WebDriver;


public class ProjectObjectManager{
    private Login loginPage;
    private CommonUtils commonUtilsPage;
    private Sidebar sidebar;
    private AddEmployee addEmployee;

    private WebDriver driver;

    public ProjectObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public Login loginPage(){
        if (loginPage==null){
            loginPage=new Login(driver);
        }
        return loginPage;
    }

    public CommonUtils commonUtilsPage(){
        if (commonUtilsPage==null){
            commonUtilsPage=new CommonUtils(driver);
        }
        return commonUtilsPage;
    }

    public Sidebar sidebarPage(){
        if (sidebar==null){
            sidebar=new Sidebar(driver);
        }
        return sidebar;
    }

    public AddEmployee addEmployeePage(){
        if (addEmployee == null){
            addEmployee=new AddEmployee(driver);
        }
        return addEmployee;
    }
}
