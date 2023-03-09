package org.lumaSite.pages;

import org.junit.Assert;
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
    @FindBy(xpath = "//a[contains(text(), 'Personal Details')]")
    private WebElement personalDetails;
    @FindBy(xpath = "//a[contains(text(), 'Contact Details')]")
    private WebElement contactDetails;
    @FindBy(xpath = "//a[contains(text(), 'Job')]")
    private WebElement job;
    @FindBy(xpath = "//a[contains(text(), 'Salary')]")
    private WebElement salary;
    @FindBy(xpath =  "//div[@class = 'orangehrm-edit-employee-image']")
    private WebElement avatar;
    @FindBy(xpath = "//div[1][@class = 'oxd-select-text-input']")
    private WebElement nationality;
    @FindBy(xpath = "//a[normalize-space()='Emergency Contacts']")
    private WebElement emergContacts;
    @FindBy(xpath = "//a[normalize-space()='Dependents']")
    private WebElement dependents;
    @FindBy(xpath = "//a[normalize-space()='Immigration']")
    private WebElement immigration;
    @FindBy(xpath = "//a[normalize-space()='Tax Exemptions']")
    private WebElement taxExemptions;
    @FindBy(xpath = "//a[normalize-space()='Report-to']")
    private WebElement reportTo;
    @FindBy(xpath = "//a[normalize-space()='Qualifications']")
    private WebElement qualifications;
    @FindBy(xpath = "//a[normalize-space()='Memberships']")
    private WebElement memberships;
    @FindBy(xpath = "//h6[normalize-space()='Personal Details']")
    private WebElement persDetailsText;
    @FindBy(xpath = "//h6[normalize-space()='Contact Details']")
    private WebElement contactDetText;
    @FindBy(xpath = "//h6[normalize-space()='Assigned Emergency Contacts']")
    private WebElement emergContactsText;
    @FindBy(xpath = "//h6[normalize-space()='Assigned Dependents']")
    private WebElement dependentsText;
    @FindBy(xpath = "//h6[normalize-space()='Assigned Immigration Records']")
    private WebElement immigrationText;
    @FindBy(xpath = "//h6[normalize-space()='Job Details']")
    private WebElement jobText;
    @FindBy(xpath = "//h6[normalize-space()='Assigned Salary Components']")
    private WebElement salaryText;
    @FindBy(xpath = "//h6[normalize-space()='Tax Exemptions']")
    private WebElement taxExemptionsText;
    @FindBy(xpath = "//h6[normalize-space()='Report to']")
    private WebElement reportToText;
    @FindBy(xpath = "//h6[normalize-space()='Qualifications']")
    private WebElement qualificationsText;
    @FindBy(xpath = "//h6[normalize-space()='Assigned Memberships']")
    private WebElement membershipsText;


    public void clickmyInfo(){
        click(myInfoOpt);
    }

    public void personalDet(){
        Assert.assertTrue("Personal Details is not fisplayed", persDetailsText.isDisplayed());
    }


}
