package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInOutPage {
    public static WebDriver driver;

    public LogInOutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        LogInOutPage.driver = driver;
    }

    @FindBy(xpath = "//form[@class='flex flex-col gap-2 ']/div[1]//input[@class='bg-transparent " +
            "text-[16px] h-4 outline-none ']")
    private WebElement email;

    @FindBy(xpath = "//form[@class='flex flex-col gap-2 ']/div[2]//input[@class='bg-transparent " +
            "text-[16px] h-4 outline-none ']")
    private WebElement password;

    @FindBy(xpath = "//span[.='Please enter a valid username or password..']")
    private WebElement error;

    @FindBy(xpath = "//button[@class='w-24 h-10 bg-blue text-white rounded-lg']")
    private WebElement btnLogin;

    @FindBy(xpath = "//li[@class='absolute bottom-3 text-sm flex  gap-2 items-center cursor-pointer']")
    private WebElement btnLogout;

    @FindBy(xpath = "//h1[@class='text-center']")
    private WebElement dashboard;

    public boolean vrfyLandingPage(){
        email.isDisplayed();
        return true;
    }

    public void setEmail(String mail){
        email.sendKeys(mail);
    }

    public void setPassword(String pass){
        password.sendKeys(pass);
    }

    public void button(){
        btnLogin.click();
    }

    public String errorMessage(){
        return error.getText();
    }

    public boolean vrfyDashboard(){
        dashboard.isDisplayed();
        return true;
    }

    public void buttonLogout(){
        btnLogout.click();
    }
}
