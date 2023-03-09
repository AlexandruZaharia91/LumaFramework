package org.lumaSite.pages.MyInfoComponents;

import org.lumaSite.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalDetails extends BasePage {

    @FindBy(xpath = "//a[contains(text(), 'Personal Details')]")
    private WebElement personalDetails;
    @FindBy(xpath = "//h6[normalize-space()='Personal Details']")
    private WebElement persDetailsText;
    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement nameTxt;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement middleNametxt;
    @FindBy(xpath = "//div[2]/div[2]/div[1]/div[1]/div[2]/input[1]")
    private WebElement driverLicenseTxt;
    @FindBy(xpath = "//body/div/div/div/div/div/div/div/div/div/form/div/div/div/div/div/div[1]/div[2]/input[1]")
    private WebElement licenseExp;
    @FindBy(xpath = "//div[@class='oxd-date-input-link --today']")
    private WebElement calendarTodaybtn;
    @FindBy(xpath = "//div[contains(text(), 'Today')]")
    private WebElement nationalityList;
    @FindBy(xpath = "//div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
    private WebElement maritalStatus;
    @FindBy(xpath = "//div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/i[1]")
    private WebElement dateOfBirth;
    @FindBy(xpath = "//div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]")
    private WebElement genderMale;
    @FindBy(xpath = "//label[normalize-space()='Female']")
    private WebElement genderFemale;
    @FindBy(xpath = "//label[normalize-space()='Yes']")
    private WebElement smokerCheck;


}
