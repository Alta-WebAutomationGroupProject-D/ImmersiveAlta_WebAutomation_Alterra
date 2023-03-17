package step_definitions.mentee;

import io.cucumber.java.en.And;
import locator.mentee.LogPage;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class LogSteps {
    private WebDriver webDriver;

    public LogSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click book icon")
    public void userClickBookIcon() {
        LogPage logPage = new LogPage(webDriver);
        logPage.setLog();
    }
}
