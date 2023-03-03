package org.lumaSite.pages;

import org.junit.Assert;
import org.lumaSite.actions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;


public class HomePageObject extends Actions {

    @FindBy(xpath = "//a[@id='ui-id-3']")
    private WebElement whatsNewOpt;
    @FindBy(xpath = "//li//span[contains(text(), 'Women')]")
    private  WebElement womenOpt;
    @FindBy(xpath = "//li//span[contains(text(), 'Men')]")
    private WebElement menOpt;
    @FindBy(xpath = "//li//span[contains(text(), 'Gear')]")
    private WebElement gearOpt;
    @FindBy(xpath = "//li//span[contains(text(), 'Training')]")
    private WebElement trainingOpt;
    @FindBy(xpath = "//li//span[contains(text(), 'Sale')]")
    private WebElement saleOpt;
    @FindBy(xpath = "//span[@class = 'base']")
    private WebElement whatsNewText;
    @FindBy(xpath = "//h1/span[contains(text(), 'Women')]")
    private WebElement womenText;
    @FindBy(xpath = "//h1/span[contains(text(), 'Men')]")
    private WebElement menText;
    @FindBy(xpath = "//h1/span[contains(text(), 'Gear')]")
    private WebElement gearText;
    @FindBy(xpath = "//h1/span[contains(text(), 'Training')]")
    private WebElement trainingText;
    @FindBy(xpath = "//h1/span[contains(text(), 'Sale')]")
    private WebElement saleText;
    @FindBy(xpath = "//input[@id = 'search']")
    private WebElement textBoxSearch;
    @FindBys(@FindBy(xpath = "//div[@class = 'field search']//li "))
    private List<WebElement> listElementsTextBox;



    public void clickWhatsNew(){
        clickElement(whatsNewOpt);
        checkText(whatsNewText, "What's New");
        checkURL(getDriver().getCurrentUrl(), "https://magento.softwaretestingboard.com/what-is-new.html");
    }

    public void clickWomen(){
        clickElement(womenOpt);
        checkText(womenText, "Women");
        checkURL(getDriver().getCurrentUrl(), "https://magento.softwaretestingboard.com/women.html");
    }

    public void clickMen(){
        clickElement(menOpt);
        checkText(menText, "Men");
        checkURL(getDriver().getCurrentUrl(), "https://magento.softwaretestingboard.com/men.html");
    }

    public void clickGear(){
        clickElement(gearOpt);
        checkText(gearText, "Gear");
        checkURL(getDriver().getCurrentUrl(), "https://magento.softwaretestingboard.com/gear.html");
    }

    public void clickTraining(){
        clickElement(trainingOpt);
        checkText(trainingOpt, "Training");
        checkURL(getDriver().getCurrentUrl(), "https://magento.softwaretestingboard.com/training.html");
    }

    public void clickSale(){
        clickElement(saleOpt);
        checkText(saleText, "Sale");
        checkURL(getDriver().getCurrentUrl(), "https://magento.softwaretestingboard.com/sale.html");
    }

    public void searchText(String text){
        clearContent(textBoxSearch);
        enterText(textBoxSearch, text);
        Assert.assertTrue("nu s-a gasit nici o lista", listElementsTextBox.size() > 0);
    }


}
