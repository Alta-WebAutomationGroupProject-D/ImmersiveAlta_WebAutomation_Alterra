package step_definitions.mentee;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import locator.mentee.CreatePage;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class CreateSteps {
    private WebDriver webDriver;

    public CreateSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User already mentee page")
    public void userAlreadyMenteePage() throws InterruptedException {
        CreatePage createPage = new CreatePage(webDriver);
        createPage.menteeDash();
        Thread.sleep(2000);
    }

    @Then("Add new mentee")
    public void addNewMentee() throws InterruptedException {
        CreatePage createPage = new CreatePage(webDriver);
        createPage.addNew();
        Thread.sleep(2000);
    }


    @And("Input {string} as name {string} as address {string} {string} as email {string} as telegram")
    public void inputAsNameAsAddressAsEmailAsTelegram(String nama, String alamat, String rumah, String mail, String tele) {
        CreatePage createPage = new CreatePage(webDriver);
        createPage.setName(nama);
        createPage.setAddress(alamat);
        createPage.setHome_address(rumah);
        createPage.setEmail(mail);
        createPage.kelamin();
        createPage.setTelegram(tele);
    }

    @And("Input {string} as phone {string} as discord {string} as status {string} as class")
    public void inputAsPhoneAsDiscordAsStatusAsClass(String number, String dis, String status, String kelas) throws InterruptedException {
        CreatePage createPage = new CreatePage(webDriver);
        createPage.setPhone(number);
        createPage.setDiscord(dis);
        createPage.statusDropdown(status);
        Thread.sleep(2000);
        createPage.classDropdown(kelas);
        Thread.sleep(2000);
    }

    @And("In emergency data input {string} as name {string} as phone {string} as status")
    public void inEmergencyDataInputAsNameAsPhoneAsStatus(String nama, String number, String status) throws InterruptedException {
        CreatePage createPage = new CreatePage(webDriver);
        createPage.setNameEmergency(nama);
        createPage.setPhoneEmergency(number);
        createPage.emergencyDropdown(status);
        Thread.sleep(2000);
    }

    @And("In education data input {string} as major {string} as institution")
    public void inEducationDataInputAsMajorAsInstitution(String jurusan, String univ) {
        CreatePage createPage = new CreatePage(webDriver);
        createPage.jurusan();
        createPage.majorUniv(jurusan);
        createPage.kampus(univ);
    }

    @Then("Click save button")
    public void clickSaveButton() {
        CreatePage createPage = new CreatePage(webDriver);
        createPage.end();
    }
}
