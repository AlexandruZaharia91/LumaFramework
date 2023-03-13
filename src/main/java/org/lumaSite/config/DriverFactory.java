package org.lumaSite.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    static {
        Runtime.getRuntime().addShutdownHook(new Thread() {
           public void run() {
               //driver.quit();
               }
        });
    }

    private static WebDriver driver;

    public WebDriver getDriver(){
        if (driver == null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            return driver;
        }else {
            return driver;
        }
    }




}
