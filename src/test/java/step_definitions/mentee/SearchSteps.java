package step_definitions.mentee;

import io.cucumber.java.en.Then;
import locator.mentee.SearchPage;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class SearchSteps {
    private WebDriver webDriver;

    public SearchSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User input {string} as name user to look for")
    public void userInputAsNameUserToLookFor(String nama) {
        SearchPage searchPage = new SearchPage(webDriver);
        searchPage.setName(nama);
    }
}
