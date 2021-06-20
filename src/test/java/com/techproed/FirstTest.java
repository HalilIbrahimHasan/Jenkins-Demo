package com.techproed;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("iPhone"+ Keys.ENTER);
        System.out.println("Ahmet abi calisma"+driver.getTitle().contains("iPhone"));
        Assert.assertTrue(driver.getTitle().contains("iPhone1"));
//        System.out.println("Ahmet abi calisma"+driver.getTitle().contains("iPhone"));
//        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Amazon.com"));
//        System.out.println("This browser is navigating to "+driver.getTitle());
//        System.out.println("Batch 13 arkadaslarimiz icin bir Demo");
//        System.out.println("Ozgur Bey offer aldi");
    }


}


