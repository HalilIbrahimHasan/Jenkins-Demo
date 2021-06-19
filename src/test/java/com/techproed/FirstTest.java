package com.techproed;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {


    @Test
    public void OpenBrowser()  {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-gpu");
        driver = new ChromeDriver(options);
        driver.get("https://gmibank.com/account/register");
        System.out.println(driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("GMIBANK"));
        System.out.println("This browser is navigating to "+driver.getTitle());
    }


}

