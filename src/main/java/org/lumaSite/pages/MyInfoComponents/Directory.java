package org.lumaSite.pages.MyInfoComponents;

import org.junit.Assert;
import org.lumaSite.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Directory extends BasePage {

    private String value;

    public void setValue(String value){
        this.value = value;
    }


    @FindBy(xpath = "//div[@class='orangehrm-container']//p")
    private List<WebElement> recordsFound;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    private WebElement employeeName;
    @FindBy(xpath = "//form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
    private WebElement jobTitle;
    @FindBy(xpath = "//div[@role = 'listbox']//div")
    private List<WebElement> listofelements;
    @FindBy(xpath = "//form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]")
    private WebElement location;
    @FindBy(xpath = "//button[normalize-space()='Search']")
    private WebElement resetBtn;
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement searchBtn;


    public void employeeName(){
        click(employeeName);
        addText(value, employeeName);
    }

    public void jobTitle(){
        click(jobTitle);
        listofElements(listofelements, value);
    }

    public void location(){
        click(this.location);
        listofElements(listofelements, value);
    }

    public void search(){
        click(searchBtn);
    }

    public void reset(){
        click(resetBtn);
    }

    public void listofRecords(){
        boolean itemNameSeen = false;
        for(WebElement s : recordsFound){
            if(s.getText().equals(value)){
                itemNameSeen = true;
            }
        }
        Assert.assertTrue("the value is not displayed ", itemNameSeen);
    }

}
