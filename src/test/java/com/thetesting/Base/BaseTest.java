package com.thetesting.Base;

import com.thetesting.DriverManager.DriverMan;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

@BeforeMethod
    public void startDriver()
{
    driver = new DriverMan().initializeDriver();
    driver.manage().window().maximize();
}

@AfterMethod
    public void quitDriver()
{
    driver.quit();
}

}
