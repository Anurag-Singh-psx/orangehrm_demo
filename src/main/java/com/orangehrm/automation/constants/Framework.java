package com.orangehrm.automation.constants;

public final class Framework {
    private Framework() {
        // private constructor to prevent instantiation
    }

    public static final class Paths {
        public static final String PROJECT_PATH =System.getProperty("user.dir");
        public static final String CONFIG_READER="/src/main/resources/config.properties";
        public static final String EXCEL_UTILS="com/orangehrm/automation/utils/ExcelUtils.java";
    }

    public static final class Constants {
        public static final String CONFIG_PROPERTIES_URL="URL";
        public static final String CONFIG_PROPERTIES_BROWSER="Browser";
        public static final String USER_NAME="username";
        public static final String PASSWORD="password";
    }

    public static final class Classes {
        public static final String ORANGE_HRM_LOGIN_BUTTON="orangehrm-login-button";
        public static final String OXD_USER_DROPDOWN_NAME="oxd-userdropdown-name";
    }

    public static final class TestDataPaths {
        public static final String LOGIN_JSON="/src/main/resources/testdata/Login.json";


    }
}


