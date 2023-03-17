package locator.mentee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public static WebDriver driver;

    public SearchPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        SearchPage.driver = driver;
    }

    @FindBy(xpath = "//input[@class='input w-full max-w-[150px]']")
    private WebElement name;

    public void setName(String input){
        name.sendKeys(input);
    }
}
