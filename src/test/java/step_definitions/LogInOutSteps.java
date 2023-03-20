package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.LogInOutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LogInOutSteps {
    private WebDriver webDriver;

    public LogInOutSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

//    Normal login
    @Given("User already in landing page")
    public void userAlreadyInLandingPage() {
        LogInOutPage logInOutPage = new LogInOutPage(webDriver);
        Assert.assertTrue(logInOutPage.vrfyLandingPage());
    }

    @When("User input {string} as email and {string} as password")
    public void userInputAsEmailAndAsPassword(String email, String pass) throws InterruptedException {
        LogInOutPage logInOutPage = new LogInOutPage(webDriver);
        logInOutPage.setEmail(email);
        logInOutPage.setPassword(pass);
        logInOutPage.button();
        Thread.sleep(3000);
    }

    @Then("User already in dashboard page")
    public void userAlreadyInDashboardPage() {
        LogInOutPage logInOutPage = new LogInOutPage(webDriver);
        Assert.assertTrue(logInOutPage.vrfyDashboard());
    }

//    Invalid & blank login
    @Then("Error message should appear {string}")
    public void errorMessageShouldAppear(String error) {
        LogInOutPage logInOutPage = new LogInOutPage(webDriver);
        Assert.assertEquals(error, logInOutPage.errorMessage());
    }

//    Logout
    @And("User click logout button")
    public void userClickLogoutButton() {
        LogInOutPage logInOutPage = new LogInOutPage(webDriver);
        logInOutPage.buttonLogout();
    }
}
