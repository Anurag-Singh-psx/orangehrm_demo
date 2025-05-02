package com.orangehrm.automation.constants;

public enum AppLayouts {

    ORANGE_HRM_LOGIN_BUTTON("orangehrm-login-button");

    private final String values;

    AppLayouts(String values) {
        this.values=values;
    }

    public String getValue(){
        return values;
    }
}
