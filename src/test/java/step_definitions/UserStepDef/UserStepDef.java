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

    @Then("User already in user page")
    public void userAlreadyInUserPage() {
        UserPage userPage = new UserPage(webDriver);
        Assert.assertTrue(userPage.setVerifyUserPage());
    }

    @Then("User click button add new user")
    public void userClickButtonAddUser(){
        UserPage userPage = new UserPage(webDriver);
        userPage.setClickBtnAddUser();
    }

    @And("User already on Add User")
    public void userAlreadyInAddUserPage()throws InterruptedException{
        UserPage userPage = new UserPage(webDriver);
        Assert.assertTrue(userPage.setVrfyAddUserPopUp());
        Thread.sleep(3000);
    }

    @Then("User click button edit profile")
    public void userClickButtonEdit(){
        UserPage userPage = new UserPage(webDriver);
        userPage.setButtonEditProfileUser();
    }

    @And("User already on Edit Profile")
    public void userAlreadyinEditProfilePage(){
        UserPage userPage = new UserPage(webDriver);
        Assert.assertTrue(userPage.setVrfyEditUserProfile());
    }

    @Then("User input {string} as new Nama and {string} as new Email")
    public void userEditDataProfile(String name, String emailprofile) throws InterruptedException {
        UserPage userPage = new UserPage(webDriver);
        UserPage.clearField();
        UserPage.setNama(name);
        UserPage.setEmailProfile(emailprofile);
        Thread thread;
        Thread.sleep(2000);
    }

    @And("User input new {string} as Nama and {} as Blank Email")
    public void userEditProfileUserWithBlank(String name, String newemail) throws InterruptedException {
        UserPage userPage = new UserPage(webDriver);
        UserPage.clearField();
        UserPage.setNama(name);
        UserPage.setEmailProfile(newemail);
        Thread thread;
        Thread.sleep(3000);
    }

    @And("User choose team {string}")
    public void userSetTeam(String team1) throws InterruptedException{
        UserPage userPage = new UserPage(webDriver);
        userPage.pilihTeam(team1);
        Thread.sleep(3000);
    }

    @And("User choose status {string}")
    public void userSetStatus(String status1) throws InterruptedException{
        UserPage userPage = new UserPage(webDriver);
        userPage.pilihStatus(status1);
        Thread.sleep(3000);
    }

    @And("Show Pop up Akses Ditolak")
    public void showPopUpAksesDitolak() throws InterruptedException{
        UserPage userPage = new UserPage(webDriver);
        userPage.vrfyPopUpAksesDitolak();
        Thread.sleep(3000);
    }
}
