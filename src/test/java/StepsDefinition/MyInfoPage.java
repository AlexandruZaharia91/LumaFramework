package StepsDefinition;

import Hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class MyInfoPage {
    Hooks hooks;
    public MyInfoPage(){
        hooks = new Hooks();
    }
    @Given("I login like {string} and {string}")
    public void iLoginLikeAnd(String user, String pwd) {
        hooks.beforeScenarioStart();
    }

    @Given("I go to My Info")
    public void iGoToMyInfo() {
    }

    @And("I access Personal Details page")
    public void iAccessPersonalDetailsPage() {
    }

    @And("I access Contact Details")
    public void iAccessContactDetails() {
    }

    @And("I access Job")
    public void iAccessJob() {
    }

    @And("I access Salary")
    public void iAccessSalary() {
    }
}
