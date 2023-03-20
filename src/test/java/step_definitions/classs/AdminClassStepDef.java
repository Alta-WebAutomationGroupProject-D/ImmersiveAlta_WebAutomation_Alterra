package step_definitions.classs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.classs.ClassPage;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class AdminClassStepDef {
    private WebDriver webDriver;

    public AdminClassStepDef(){
        super();
        this.webDriver = Hooks.webDriver;
    }


    @Then("Super Admin click button of class page")
    public void superAdminClickButtonOfClassPage() {
        ClassPage classPage = new ClassPage(webDriver);
        classPage.setClassButton();
    }

    @Then("Super Admin click add new button")
    public void superAdminClickAddNewButton() {
        ClassPage classPage = new ClassPage(webDriver);
        classPage.setAddNewButton();
    }

    @Then("Super Admin input {string}")
    public void superAdminInput(String nama ) {
        ClassPage classPage = new ClassPage(webDriver);
        classPage.setFielClassName(nama);
    }

    @And("Super Admin choose mentor {string}")
    public void superAdminChooseMentor(String mentor) {
        ClassPage classPage = new ClassPage(webDriver);
        classPage.setMentorName(mentor);
    }

    @And("Super Admin choose mulai {string}")
    public void superAdminChooseMulai(String mulai) {
        ClassPage classPage = new ClassPage(webDriver);
        classPage.setTanggalMulai(mulai);
    }

    @And("Super Admin choose akhir {string}")
    public void superAdminChooseAkhir(String akhir) {
        ClassPage classPage = new ClassPage(webDriver);
        classPage.setTanggalBerakhir(akhir);
    }

    @Then("Super Admin click save button")
    public void superAdminClickSaveButton() {
        ClassPage classPage = new ClassPage(webDriver);
        classPage.setSaveButton();
    }

    @Then("Super Admin click edit button")
    public void superAdminClickEditButton() {
        ClassPage classPage = new ClassPage(webDriver);
        classPage.setEditButton();
    }

    @Then("Super Admin click delete button")
    public void superAdminClickAddDeleteButton() {
        ClassPage classPage = new ClassPage(webDriver);
        classPage.setDeleteButton();
    }
}
