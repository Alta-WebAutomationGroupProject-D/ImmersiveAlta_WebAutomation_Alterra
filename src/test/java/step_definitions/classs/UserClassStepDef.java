package step_definitions.classs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.classs.ClassPage;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class UserClassStepDef {
    private WebDriver webDriver;

    public UserClassStepDef(){
        super();
        this.webDriver = Hooks.webDriver;
    }


    @Then("User click button of class page")
    public void userClickButtonOfClassPage() throws InterruptedException {
        ClassPage classPage = new ClassPage(webDriver);
        classPage.setClassButton();

        Thread.sleep(2000);
    }

    @Then("User click add new button")
    public void userClickAddNewButton() throws InterruptedException {
        ClassPage classPage = new ClassPage(webDriver);
        classPage.setAddNewButton();

        Thread.sleep(2000);
    }

    @Then("User input {string}")
    public void userInput(String nama ) throws InterruptedException {
        ClassPage classPage = new ClassPage(webDriver);
        classPage.setFielClassName(nama);

        Thread.sleep(2000);
    }

    @And("User choose mentor {string}")
    public void userChooseMentor(String mentor) throws InterruptedException {
        ClassPage classPage = new ClassPage(webDriver);
        classPage.setMentorName(mentor);

        Thread.sleep(2000);
    }

    @And("User choose mulai {string}")
    public void userChooseMulai(String mulai) throws InterruptedException {
        ClassPage classPage = new ClassPage(webDriver);
        classPage.setTanggalMulai(mulai);

        Thread.sleep(2000);
    }

    @And("User choose akhir {string}")
    public void userChooseAkhir(String akhir) throws InterruptedException {
        ClassPage classPage = new ClassPage(webDriver);
        classPage.setTanggalBerakhir(akhir);

        Thread.sleep(2000);
    }

    @Then("User click save button")
    public void userClickSaveButton() throws InterruptedException {
        ClassPage classPage = new ClassPage(webDriver);
        classPage.setSaveButton();

        Thread.sleep(2000);
    }

    @Then("User click edit button")
    public void userClickEditButton() throws InterruptedException {
        ClassPage classPage = new ClassPage(webDriver);
        classPage.setEditButton();

        Thread.sleep(2000);
    }

    @Then("User click delete button")
    public void userClickAddDeleteButton() throws InterruptedException {
        ClassPage classPage = new ClassPage(webDriver);
        classPage.setDeleteButton();

        Thread.sleep(2000);
    }


}
