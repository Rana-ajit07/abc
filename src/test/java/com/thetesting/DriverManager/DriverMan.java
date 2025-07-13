package com.thetesting.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMan {
    WebDriver driver;

    public WebDriver initializeDriver()
    {
        driver= new ChromeDriver();
        return driver;

    }



}
