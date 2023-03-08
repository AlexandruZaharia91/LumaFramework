package org.lumaSite.pages;

import org.lumaSite.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage extends BasePage {

    public MyInfoPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='My Info']")
    private WebElement myInfoOpt;

    @FindBy(xpath = "")
    private WebElement personalDetails;
    @FindBy(xpath = "")
    private WebElement contactDetails;
    @FindBy(xpath = "")
    private WebElement job;
    @FindBy(xpath = "")
    private WebElement salary;
}
