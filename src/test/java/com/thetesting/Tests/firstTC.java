package com.thetesting.Tests;

import com.thetesting.Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class firstTC extends BaseTest{

    @Test
    public void guestLogin()
    {
        driver.get("https://askomdch.com/");
    }


}
