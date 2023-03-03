package org.lumaSite.actions;

import org.lumaSite.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.Assert;


public class Actions extends BasePage {

    public void clickElement(WebElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void clearContent(WebElement element){
        getWait().until(ExpectedConditions.visibilityOf(element));
        element.clear();
    }

    public void enterText(WebElement element, String text){
        clearContent(element);
        element.sendKeys(text);
    }

    public void checkText(WebElement element, String text){
        Assert.assertEquals(element.getText(), text);
    }

    public void checkURL(String currentURL, String expectedURL){
        Assert.assertEquals(currentURL, expectedURL);
    }
}
