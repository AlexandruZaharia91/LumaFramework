package org.lumaSite.pages;

import org.junit.Assert;
import org.lumaSite.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement userName;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement loginBtn;
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    private WebElement dasboardText;

    public void username(String username){
        clear(userName);
        addText(username, userName);
    }

    public void password(String password){
        clear(this.password);
        addText(password, this.password);
    }

    public void clickSignInBtn(){
        click(loginBtn);
    }

    public void checkPage() {
        find(dasboardText);
        Assert.assertTrue("Dasboard Title is not displayed",dasboardText.isDisplayed());
    }

}
