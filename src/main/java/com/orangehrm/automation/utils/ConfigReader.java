package com.orangehrm.automation.utils;

import com.orangehrm.automation.constants.Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
    private Properties properties;

    public void initConfigReader() {
        try{
            FileInputStream  fileInputStream=new FileInputStream(Framework.Paths.PROJECT_PATH+Framework.Paths.CONFIG_READER);
            properties=new Properties();
            properties.load(fileInputStream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getConfigValue(String key){
        return properties.getProperty(key);
    }

}
