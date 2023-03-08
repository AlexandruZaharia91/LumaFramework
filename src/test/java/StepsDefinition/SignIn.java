package StepsDefinition;

import Hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.lumaSite.pages.HomePageObject;
import org.lumaSite.pages.LoginPage;

public class SignIn {
    Hooks hooks;
    LoginPage loginPage;

    public SignIn(){
        hooks = new Hooks();
        loginPage = new LoginPage();
    }

    @Given("I navigate to login page from Orange HRM")
    public void iNavigateToLoginPageFromOrangeHRM() {
        hooks.beforeScenarioStart();
    }

    @Given("I login with user {string} and password {string}")
    public void iLoginWithUserAndPassword(String user, String pwd) {
        loginPage.username(user);
        loginPage.password(pwd);
    }

    @And("I press Login button")
    public void iPressLoginButton() {
        loginPage.clickSignInBtn();
    }

    @Then("I check the new page")
    public void iCheckTheNewPage() {
        loginPage.checkPage();
    }

}
