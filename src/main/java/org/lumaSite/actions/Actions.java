package org.lumaSite.actions;

import org.lumaSite.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Actions extends BasePage {

    public void clickElement(WebElement element){
        getWait().until(ExpectedConditions.visibilityOf(element));
        element.click();
    }
}
