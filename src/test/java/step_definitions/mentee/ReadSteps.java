package step_definitions.mentee;

import io.cucumber.java.en.Then;
import locator.mentee.ReadPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class ReadSteps {
    private WebDriver webDriver;

    public ReadSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("New user is already added")
    public void userIsAlreadyAdded() {
        ReadPage readPage = new ReadPage(webDriver);
        Assert.assertTrue(readPage.nameVisual());
    }
}
