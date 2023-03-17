package step_definitions.mentee;

import io.cucumber.java.en.Then;
import locator.mentee.DeletePage;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class DeleteSteps {
    private WebDriver webDriver;

    public DeleteSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("Click rubbish icon")
    public void clickRubbishIcon() {
        DeletePage deletePage = new DeletePage(webDriver);
        deletePage.delete();
    }
}
