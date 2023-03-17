package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import locator.mentee.FilterPage;
import org.openqa.selenium.WebDriver;

public class FilterSteps {
    private WebDriver webDriver;

    public FilterSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User choose {string} as class")
    public void userInputAsClassAsStatusAsCategoryFilterUserChoose(String kelas) throws InterruptedException {
        FilterPage filterPage = new FilterPage(webDriver);
        filterPage.kelasFilter(kelas);
        Thread.sleep(4000);
    }

    @And("User choose {string} as status")
    public void userChooseAsStatus(String status) throws InterruptedException {
        FilterPage filterPage = new FilterPage(webDriver);
        filterPage.statusFilter(status);
        Thread.sleep(2000);
    }

    @Then("User choose {string} as category")
    public void userChooseAsCategory(String cate) {
        FilterPage filterPage = new FilterPage(webDriver);
        filterPage.categoryFilter(cate);
    }
}
