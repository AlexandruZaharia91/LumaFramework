package org.lumaSite.pages.MyInfoComponents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyInfoPage extends PersonalDetails  {
    @FindBy(xpath = "//span[normalize-space()='My Info']")
    private WebElement myInfoOpt;

    public void goToPage(){
        click(myInfoOpt);
    }

    public PersonalDetails personalDetails(){
        PersonalDetails personalDetails = new PersonalDetails();
        return personalDetails;
    }

}
