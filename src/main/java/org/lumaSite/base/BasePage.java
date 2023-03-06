package org.lumaSite.base;


import org.apache.commons.io.FileUtils;
import org.lumaSite.config.DriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {

    protected WebDriver driver;
    DriverFactory driverFactory = new DriverFactory();

    public BasePage() {
        this.driver = driverFactory.getDriver();
    }

    public WebElement find(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(locator));
        return locator;
    }

    public void submit(WebElement locator) {
        find(locator).submit();
    }

    public void addText(String inputText, WebElement locator) {
        find(locator).sendKeys(inputText);
    }

    public void clear(WebElement locator) {
        find(locator).clear();
    }

    public void click(WebElement locator) {
        find(locator).click();
    }

    public void listOfelements(List<WebElement> locators){
        find(locators.get(0));
        locators.get(0).click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public void visit(String url) {
        driver.get(url);
    }

    /**
     * returns the text from the provided DOM locator using Selenium's getText method
     *
     * @param locator
     * @return String representing the inner HTML of the DOM element (MW: To check it is actually inner-text
     */
    public String getText(WebElement locator) {
        return find(locator).getText();
    }

    /**
     * searches for the provided text in the current page Url
     *
     * @param searchString partial text to locate within the page url
     * @throws IllegalStateException
     */
    public void valCorrectPage(String searchString) {
        if (!getPageTitle().contains(searchString)) {
            throw new IllegalStateException("This is not " + searchString + " .The actual Url is: " + getUrl());
        }
    }

    protected void takeScreenshot(RuntimeException e, String fileName) {
        File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShot, new File(fileName + ".png"));
        } catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage(), ioe);
        }
        throw e;
    }
}