package com.example.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
    protected static WebDriver webDriver;

    public static WebDriver getDriver() { return webDriver; }

    private void setDriver(String appURL) { webDriver=initChromeDriver(appURL); }

    private static WebDriver initChromeDriver(String appURL){
        System.setProperty("webdriver.chrome.driver", "/users/hildebrandrr/IdeaProjects/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("headless");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        return driver;
    }
    @Parameters({"appURL"})
    @BeforeClass
    public void initializeBase(String appURL){
        try{
            setDriver(appURL);
        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }
    }
    @AfterClass
    public void teardown(){ webDriver.quit(); }
}
