package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.lumaSite.pages.HomePageObject;

public class HomePage {
    HomePageObject home;

    public HomePage(){
        home = new HomePageObject();
    }

    @Given("I enter in Luma site")
    public void iEnterInLumaSite() {
        home.visit("https://magento.softwaretestingboard.com/");
    }

    @And("I start to check the toolbar")
    public void iStartToCheckTheToolbar() {
        home.clickSale();
    }

    @Then("I can view all the options from toolbar")
    public void iCanViewAllTheOptionsFromToolbar() {
        home.clickTraining();
    }

    @And("I can access an option from toolbar")
    public void iCanAccessAnOptionFromToolbar() {
        home.clickWhatsNew();
    }

    @Then("A New page is opened for each option")
    public void aNewPageIsOpenedForEachOption() {
        home.getTitle();
    }

    @And("Go to Search box")
    public void goToSearchBox() {
        home.searchBox("short");
    }

    @And("Try to find a cloth with search box")
    public void tryToFindAClothWithSearchBox() {
        home.searchBox("shoes");
    }

    @And("List the content from Search box for a specific cloth")
    public void listTheContentFromSearchBoxForASpecificCloth() {
        home.takeelementofList("short");
    }

    @Then("Check the content with what you searched")
    public void checkTheContentWithWhatYouSearched() {
        home.clickMen();
    }
}
