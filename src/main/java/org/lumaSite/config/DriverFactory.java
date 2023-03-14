package org.lumaSite.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            return driver;
        }else {
            return driver;
        }
    }




}
