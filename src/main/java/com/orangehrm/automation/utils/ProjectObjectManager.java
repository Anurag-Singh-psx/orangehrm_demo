package com.orangehrm.automation.utils;

import com.orangehrm.automation.base.DriverFactory;
import com.orangehrm.automation.page.Login.Login;

public class ProjectObjectManager extends DriverFactory {
    private Login loginPage;
    private CommonUtils commonUtilsPage;

    public Login loginPage(){
        if (loginPage==null){
            loginPage=new Login(getWebDriver());
        }
        return loginPage;
    }

    public CommonUtils commonUtilsPage(){
        if (commonUtilsPage==null){
            commonUtilsPage=new CommonUtils(getWebDriver());
        }
        return commonUtilsPage;
    }
}
