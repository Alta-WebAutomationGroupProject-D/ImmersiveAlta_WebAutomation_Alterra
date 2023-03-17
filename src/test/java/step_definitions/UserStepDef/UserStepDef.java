package step_definitions.UserStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import locator.user.UserPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class UserStepDef {

    private WebDriver webDriver;

    public UserStepDef(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Then("User clicked button user page")
    public void userClickedButtonUserPage() {
        UserPage userPage = new UserPage(webDriver);
        userPage.setClickUserButton();
    }

    @And("User already in user page")
    public void userAlreadyInUserPage() throws InterruptedException{
        UserPage userPage = new UserPage(webDriver);
        Assert.assertTrue(userPage.setVerifyUserPage());
        Thread.sleep(3000);
    }

    @Then("User search and see list user name {string}")
    public void userSearchAndSeeList(String keyword) throws InterruptedException{
        UserPage userPage = new UserPage(webDriver);
        UserPage.searchingUser(keyword);
        userPage.clickNextList();
        Thread.sleep(2000);
    }

    @And("Button doesnt exist")
    public void buttonDoesntExist() throws InterruptedException{
        UserPage userPage = new UserPage(webDriver);
        userPage.buttonDoesntExist();
        Thread.sleep(2000);
    }

    @And("Table has been filtered")
    public void filterSearchUser() throws InterruptedException{
        UserPage userPage = new UserPage(webDriver);
        Assert.assertTrue(userPage.filterSearch());
        Thread.sleep(2000);
    }

}
