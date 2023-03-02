package org.lumaSite.pages;

import org.lumaSite.actions.Actions;
import org.lumaSite.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePageObject extends Actions {

    @FindBy(xpath = "")
    private WebElement whatsNew;
    @FindBy(xpath = "")
    private  WebElement womenOpt;
    @FindBy(xpath = "")
    private WebElement menOpt;
    @FindBy(xpath = "")
    private WebElement gearOpt;
    @FindBy(xpath = "")
    private WebElement trainningOpt;
    @FindBy(xpath = "")
    private WebElement saleOpt;


    public void clickWhatsNew(){

    }


}
