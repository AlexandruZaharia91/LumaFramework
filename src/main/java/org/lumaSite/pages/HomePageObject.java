package org.lumaSite.pages;

import org.junit.Assert;
import org.lumaSite.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class HomePageObject extends BasePage {


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
    @FindBys(@FindBy(xpath = "//div[@class = 'field search']//li"))
    private List<WebElement> listElementsTextBox;

    public HomePageObject(){
        super();
        PageFactory.initElements(driver, this);
    }

    public void clickWhatsNew(){
        click(whatsNewOpt);
    }

    public void clickWomen(){
        click(womenOpt);
    }

    public void clickMen(){
        click(menOpt);
    }

    public void clickGear(){
        click(gearOpt);
    }

    public void clickTraining(){
        click(trainingOpt);
    }

    public void clickSale(){
        click(saleOpt);
    }

    public void searchBox(String text){
        clear(textBoxSearch);
        click(textBoxSearch);
        addText(text, textBoxSearch);
    }

    public void getTitle(){
        Assert.assertEquals(getUrl(), "https://magento.softwaretestingboard.com/what-is-new.html");
    }

    public void takeelementofList(String text){
        searchBox(text);
        listOfelements(listElementsTextBox);

    }



}
