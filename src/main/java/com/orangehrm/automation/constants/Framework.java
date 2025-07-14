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
        public static final String ADMIN="Admin";
        public static final String PIM="PIM";
        public static final String ADD_EMPLOYEE="Add Employee";
    }

    public static final class Classes {
        public static final String ORANGE_HRM_LOGIN_BUTTON="orangehrm-login-button";
        public static final String OXD_USER_DROPDOWN_NAME="oxd-userdropdown-name";
        public static final String OXD_MAIN_MENU_ITEM_NAME ="oxd-main-menu-item--name";
        public static final String OXD_MAIN_MENU_BUTTON ="oxd-main-menu-button";
        public static final String BI_CHEVRON_RIGHT="bi-chevron-right";
        public static final String BI_CHEVRON_LEFT="bi-chevron-left";
        public static final String ORANGE_HRM_FIRST_NAME="orangehrm-firstname";
        public static final String ORANGE_HRM_LAST_NAME="orangehrm-lastname";
        public static final String ORANGE_HRM_MIDDLE_NAME="orangehrm-middlename";
        public static final String USER_FORM_HEADER="user-form-header";
        public static final String ORANGE_HRM_EMPLOYEE_FORM="orangehrm-employee-form";
        public static final String OXD_INPUT="oxd-input";
        public static final String STATUS_GROUPED_FIELD="--status-grouped-field";
        public static final String USER_PASSWORD_ROW="user-password-row";
        public static final String OXD_TOPBAR_BODY_NAV="oxd-topbar-body-nav";
        public static final String OXD_TOPBAR_BODY_NAV_TAB_ITEM="oxd-topbar-body-nav-tab-item";
    }

    public static final class Keys {
        public static final String FIRST_NAME="First Name";
        public static final String LAST_NAME="Last Name";
        public static final String MIDDLE_NAME="Middle Name";
        public static final String USER_NAME="Username";
        public static final String PASSWORD="Password";
        public static final String CONFIRM_PASSWORD="Confirm Password";
        public static final String DISABLED="Disabled";
        public static final String ENABLED="Enabled";
    }

    public static final class TestDataPaths {
        public static final String LOGIN_JSON="/src/main/resources/testdata/Login.json";


    }
}


