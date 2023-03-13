package org.lumaSite.base;


import org.apache.commons.io.FileUtils;
import org.lumaSite.config.DriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {

    protected WebDriver driver;
    DriverFactory driverFactory = new DriverFactory();
    Actions action;

    public BasePage() {
        this.driver = driverFactory.getDriver();
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
    }

    protected WebElement find(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(locator));
        return locator;
    }

    protected WebElement clickAble(WebElement locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        return locator;
    }

    protected void submit(WebElement locator) {
        find(locator).submit();
    }

    protected void addText(String inputText, WebElement locator) {
        locator.sendKeys(inputText);
    }

    protected void clear(WebElement locator) {
        click(locator);
        locator.sendKeys(Keys.chord(Keys.COMMAND, "a"));
    }

    protected void click(WebElement locator) {
        clickAble(locator).click();
        //find(locator).click();
    }

    protected void movetoElement(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    protected String getPageTitle() {
        return driver.getTitle();
    }

    protected String getUrl() {
        return driver.getCurrentUrl();
    }

    protected void visit(String url) {
        driver.get(url);
    }

    /**
     * returns the text from the provided DOM locator using Selenium's getText method
     *
     * @param locator
     * @return String representing the inner HTML of the DOM element (MW: To check it is actually inner-text
     */
    protected String getText(WebElement locator) {
        return find(locator).getText();
    }

    /**
     * searches for the provided text in the current page Url
     *
     * @param searchString partial text to locate within the page url
     * @throws IllegalStateException
     */
    protected void valCorrectPage(String searchString) {
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


    protected WebElement listofElements(List<WebElement> list, String text){
        WebElement elem = null;
        for(int i = 0; i< list.size();i++) {
            if (list.get(i).getText().equalsIgnoreCase(text)) {
                elem = list.get(i);
            }
        }
        return elem;
    }

    protected void uploadDoc(WebElement element, String path){
        element.sendKeys(path);
    }
}