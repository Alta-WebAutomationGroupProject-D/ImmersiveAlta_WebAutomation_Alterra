package locator.mentee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FilterPage {
    public static WebDriver driver;

    public FilterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        FilterPage.driver = driver;
    }

    @FindBy(xpath = "//select[1]")
    private WebElement kelas;

    @FindBy(xpath = "//select[2]")
    private WebElement status;

    @FindBy(xpath = "//select[3]")
    private WebElement cate;

    public void kelasFilter(String text){
        Select classs = new Select(kelas);
        classs.selectByVisibleText(text);
    }

    public void statusFilter(String text){
        Select status = new Select(kelas);
        status.selectByVisibleText(text);
    }

    public void categoryFilter(String text){
        Select cate = new Select(kelas);
        cate.selectByVisibleText(text);
    }
}
