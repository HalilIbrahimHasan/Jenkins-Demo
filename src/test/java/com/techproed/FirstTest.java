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
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-gpu");
        driver = new ChromeDriver(options);
        driver.get("https://www.amazon.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        List <WebElement> allItems = driver.findElements(By.xpath("//header/div/div[4]/div[2]/div[2]/div/script/following::a"));
        for (int i = 0; i < 8; i++) {
            System.out.println("item "+(i+1)+" => "+allItems.get(i).getText());
        }
//        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
    }


}


