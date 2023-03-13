package Hooks;

import org.junit.After;
import org.junit.Before;
import org.lumaSite.base.BasePage;


public class Hooks extends BasePage {


    @Before()
    public void beforeScenarioStart(){
        visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}
