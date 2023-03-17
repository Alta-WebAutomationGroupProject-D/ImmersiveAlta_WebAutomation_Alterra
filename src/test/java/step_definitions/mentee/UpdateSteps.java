package step_definitions.mentee;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import locator.mentee.UpdatePage;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class UpdateSteps {
    private WebDriver webDriver;

    public UpdateSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click pencil icon")
    public void userClickPencilIcon() {
        UpdatePage updatePage = new UpdatePage(webDriver);
        updatePage.pencilIcon();

    }

    @Then("Update {string} as name {string} as status Non-informatics as category female as gender")
    public void updateAsNameAsStatusNonInformaticsAsCategoryFemaleAsGender(String nama, String status) {
        UpdatePage updatePage = new UpdatePage(webDriver);
        updatePage.setName(nama);
        updatePage.kelamin();
        updatePage.statusDropdown(status);
        updatePage.jurusan();
    }

    @Then("User already add in mentee list")
    public void userAlreadyAddInMenteeList() {
        UpdatePage updatePage = new UpdatePage(webDriver);
        updatePage.dashboard();
    }
}
