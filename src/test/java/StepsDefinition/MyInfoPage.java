package StepsDefinition;

import Hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.lumaSite.pages.MyInfo;

public class MyInfoPage {
    Hooks hooks;
    MyInfo myInfo;
    public MyInfoPage(){
        hooks = new Hooks();
        myInfo = new MyInfo();
    }
    @Given("I login like {string} and {string}")
    public void iLoginLikeAnd(String user, String pwd) {
        hooks.beforeScenarioStart();
    }

    @Given("I go to My Info")
    public void iGoToMyInfo() {
        myInfo.accessMyInfo();
    }

    @And("I started to complete the fields")
    public void iStartedToCompleteTheFields() {
        myInfo.myInfo("John", "Haiduc", "B0938874873", "Romanian", "Single"
                ,"Male", "A-", "HelloWorld.rtf", "alvin.jpg");
    }
}
