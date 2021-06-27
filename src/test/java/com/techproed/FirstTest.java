package com.techproed;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class FirstTest {



        @Test
        public void OpenBrowser()  {
            WebDriver driver;
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Documents\\Selenium-Grid-Server\\chromedriver_win32\\chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            options.addArguments("disable-gpu");
            driver = new ChromeDriver(options);
            driver.get("https://www.google.com");
            System.out.println("Title of the page is: " + driver.getTitle());
            Assert.assertTrue("This page is unexpected!",driver.getTitle().equals("Google"));
            System.out.println("6. proje grubu");

            System.out.println("Today we are learning how to set Jenkins on the servers");


        }



}

