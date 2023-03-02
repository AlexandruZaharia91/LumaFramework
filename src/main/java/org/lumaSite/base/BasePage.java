package org.lumaSite.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    private static WebDriver driver;
    private static WebDriverWait wait;

    public BasePage(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void webdriverDriver(String browserType){
        if("chrome".equalsIgnoreCase(browserType)){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }else if("firefox".equalsIgnoreCase(browserType)){
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }else{
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }
    }

    public WebDriver getDriver(){
        return  driver;
    }


    public static WebDriverWait getWait() {
        return wait;
    }
}
