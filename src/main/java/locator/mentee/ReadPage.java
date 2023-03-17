package locator.mentee;

import locator.LogInOutPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadPage {
    public static WebDriver driver;

    public ReadPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        ReadPage.driver = driver;
    }

    @FindBy(xpath = "//td[.='AldanM']")
    private WebElement name;

    public boolean nameVisual(){
        name.isDisplayed();
        return true;
    }
}
