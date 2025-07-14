package com.orangehrm.automation.Listeners;

import com.orangehrm.automation.base.DriverFactory;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AllureTestListeners extends DriverFactory implements ITestListener {

    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] saveScreenshot(WebDriver driver){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + getTestMethodName(result));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        if (getWebDriver() != null) {
            saveScreenshot(getWebDriver());
        }
        System.out.println("Test Passed: " + getTestMethodName(result));
    }

    @Override
    public void onTestFailure(ITestResult result) {
        if (getWebDriver() != null) {
            saveScreenshot(getWebDriver());
        }
        System.out.println("Test Failed: " + getTestMethodName(result));
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + getTestMethodName(result));
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test Failed But Within Success Percentage: " + getTestMethodName(result));
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        onTestFailure(result);
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("I am in onStart method " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("I am in onFinish method " + context.getName());
    }
}
