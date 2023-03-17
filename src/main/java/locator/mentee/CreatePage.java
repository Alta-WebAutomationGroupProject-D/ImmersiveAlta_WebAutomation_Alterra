package locator.mentee;

import locator.LogInOutPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatePage {
    public static WebDriver driver;

    public CreatePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        CreatePage.driver = driver;
    }

    @FindBy(xpath = "//div[.='Mentee']")
    private WebElement mentee;

    @FindBy(xpath = "//a[.='Add New']")
    private WebElement user;

    @FindBy(xpath = "//table[1]/tr[1]//input[@class='input input-bordered w-1/2']")
    private WebElement name;

    @FindBy(xpath = "//table[1]/tr[2]//input[@class='input input-bordered w-1/2']")
    private WebElement address;

    @FindBy(xpath = "//table[1]/tr[3]//input[@class='input input-bordered w-1/2']")
    private WebElement home_address;

    @FindBy(xpath = "//table[1]/tr[4]//input[@class='input input-bordered w-1/2']")
    private WebElement email;

    @FindBy(xpath = "//input[@value='Male']")
    private WebElement gender;

    @FindBy(xpath = "//tr[6]//input[@class='input input-bordered w-1/2']")
    private WebElement telegram;

    @FindBy(xpath = "//tr[7]//input[@class='input input-bordered w-1/2']")
    private WebElement phone;

    @FindBy(xpath = "//tr[8]//input[@class='input input-bordered w-1/2']")
    private WebElement discord;

    @FindBy(xpath = "//tr[9]//select[@class='select select-bordered w-1/2']")
    private WebElement statusDrop;

    @FindBy(xpath = "//tr[10]//select[@class='select select-bordered w-1/2']")
    private WebElement kelasDrop;

    @FindBy(xpath = "//table[2]/tr[1]//input[@class='input input-bordered w-1/2']")
    private WebElement nameEmergency;

    @FindBy(xpath = "//table[2]/tr[2]//input[@class='input input-bordered w-1/2']")
    private WebElement phoneEmergency;

    @FindBy(xpath = "//table[2]//select[@class='select select-bordered w-1/2']")
    private WebElement statusEmergency;

    @FindBy(xpath = "//input[@value='Informatics']")
    private WebElement category;

    @FindBy(xpath = "//table[3]/tr[2]//input[@class='input input-bordered w-1/2']")
    private WebElement major;

    @FindBy(xpath = "//table[3]/tr[3]//input[@class='input input-bordered w-1/2']")
    private WebElement institution;

    @FindBy(xpath = "//button[@class='btn bg-[#19345E] w-20 flex gap-2']")
    private WebElement save;

    public void menteeDash(){
        mentee.click();
    }

    public void addNew(){
        user.click();
    }

    public void setName(String nama){
        name.sendKeys(nama);
    }

    public void setAddress(String addr){
        address.sendKeys(addr);
    }

    public void setHome_address(String ha){
        home_address.sendKeys(ha);
    }

    public void setEmail(String mail){
        email.sendKeys(mail);
    }

    public void kelamin(){
        gender.click();
    }

    public void setTelegram(String tele){
        telegram.sendKeys(tele);
    }

    public void setPhone(String number){
        phone.sendKeys(number);
    }

    public void setDiscord(String dis){
        discord.sendKeys(dis);
    }

    public void statusDropdown(String text){
        Select status = new Select(statusDrop);
        status.selectByVisibleText(text);
    }

    public void classDropdown(String text){
        Select kelas = new Select(kelasDrop);
        kelas.selectByVisibleText(text);
    }

    public void setNameEmergency(String emer){
        nameEmergency.sendKeys(emer);
    }

    public void setPhoneEmergency(String emerPhone){
        phoneEmergency.sendKeys(emerPhone);
    }

    public void emergencyDropdown(String text){
        Select emer = new Select(statusEmergency);
        emer.selectByVisibleText(text);
    }

    public void jurusan(){
        category.click();
    }

    public void majorUniv(String jurusan){
        major.sendKeys(jurusan);
    }

    public void kampus(String univ){
        institution.sendKeys(univ);
    }

    public void end(){
        save.click();
    }
}
