package step_definitions.UserStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import locator.user.UserPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class AdminStepDef {

    private WebDriver webDriver;

    public AdminStepDef(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    // Positive Case
    @Then("Admin clicked button user page")
    public void adminClickedButtonUserPage() {
        UserPage userPage = new UserPage(webDriver);
        userPage.setClickUserButton();
    }

    @Then("Admin already in user page")
    public void adminAlreadyInUserPage() {
        UserPage userPage = new UserPage(webDriver);
        Assert.assertTrue(userPage.setVerifyUserPage());
    }

    @Then("Admin click button add new user")
    public void adminClickButtonAddUser(){
        UserPage userPage = new UserPage(webDriver);
        userPage.setClickBtnAddUser();
    }

    @And("Show Pop up Form New User")
    public void showPopUpFormAddUser()throws InterruptedException{
        UserPage userPage = new UserPage(webDriver);
        Assert.assertTrue(userPage.setVrfyAddUserPopUp());
        Thread.sleep(3000);
    }

    @And("Show Pop up Form Edit User")
    public void showPopUpFormEditUser()throws InterruptedException{
        UserPage userPage = new UserPage(webDriver);
        Assert.assertTrue(userPage.setVrfyEditUserProfile());
        Thread.sleep(3000);
    }

    @Then("Admin click button edit profile")
    public void adminClickButtonEdit()throws InterruptedException{
        UserPage userPage = new UserPage(webDriver);
        userPage.setButtonEditProfileUser();
        Thread.sleep(2000);
    }

    @And("Admin already on Edit Profile Page")
    public void adminAlreadyinEditProfilePage(){
        UserPage userPage = new UserPage(webDriver);
        Assert.assertTrue(userPage.setVrfyEditUserProfile());
    }

    @Then("Admin input {string} as Nama and {string} as Email and {string} as Password")
    public void adminInputDataProfile(String name, String emailnewuser, String passnewuser) throws InterruptedException {
        UserPage userPage = new UserPage(webDriver);
        UserPage.setNama(name);
        UserPage.setEmailProfile(emailnewuser);
        UserPage.setPassword(passnewuser);
        Thread thread;
        Thread.sleep(3000);
    }

    @And("Admin input {string} as new Nama and {string} as new Email")
    public void adminEditProfileUser(String name, String newemail) throws InterruptedException {
        UserPage userPage = new UserPage(webDriver);
        UserPage.setNama(name);
        UserPage.setEmailProfile(newemail);
        Thread thread;
        Thread.sleep(3000);
    }

    @And("Choose team {string}")
    public void setTeam(String team1) throws InterruptedException{
        UserPage userPage = new UserPage(webDriver);
        userPage.pilihTeam(team1);
        Thread.sleep(3000);
    }

    @And("Choose status {string}")
    public void setStatus(String status1) throws InterruptedException{
        UserPage userPage = new UserPage(webDriver);
        userPage.pilihStatus(status1);
        Thread.sleep(3000);
    }

    @Then("Click button Save")
    public void clickBtnSaveAddUser(){
        UserPage userPage = new UserPage(webDriver);
        userPage.adminClickBtnSaveAddUser();
    }

    @Then("Click button Cancel")
    public void clickBtnTambah(){
        UserPage userPage = new UserPage(webDriver);
        userPage.adminClickBtnCancelAddUser();
    }

    @Then("Click button delete user")
    public void clickBtnDelete(){
        UserPage userPage = new UserPage(webDriver);
        userPage.adminClickDeleteButton();
    }

    // Negative Case
    @Then("Admin input {string} as Nama and {} as Blank Email and {string} as Password")
    public void adminInputDataProfileWithBlankParam(String name, String passnewuser) throws InterruptedException {
        UserPage userPage = new UserPage(webDriver);
        UserPage.clearField();
        UserPage.setNama(name);
        UserPage.setPassword(passnewuser);
        Thread thread;
        Thread.sleep(3000);
    }

    @And("Admin input {string} as new Nama and {} as Blank Email")
    public void adminEditProfileUserWithBlank(String name, String newemail) throws InterruptedException {
        UserPage userPage = new UserPage(webDriver);
        UserPage.setNama(name);
        UserPage.setEmailProfile(newemail);
        Thread thread;
        Thread.sleep(3000);
    }
}
