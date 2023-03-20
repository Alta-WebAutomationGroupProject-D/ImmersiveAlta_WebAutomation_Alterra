package locator.classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ClassPage {
    public static WebDriver driver;

    public ClassPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        ClassPage.driver = driver;
    }

    @FindBy(xpath = "//div[.='Class']")
    private WebElement classButton;

    @FindBy(xpath = "//label[@class='btn bg-[#19345E]']")
    private WebElement addNewButton;

    @FindBy(xpath = "//table[@class='w-full']/tr[1]//input[@class='mb-3 input input-bordered w-full max-w-xs']")
    private WebElement fielClassName;

    @FindBy(xpath = "//select[@class='mb-3 select select-bordered w-full max-w-xs']")
    private WebElement mentorName;

    @FindBy(xpath = "//tr[3]//input[@class='mb-3 input input-bordered w-full max-w-xs']")
    private WebElement tanggalMulai;

    @FindBy(xpath = "//tr[4]//input[@class='mb-3 input input-bordered w-full max-w-xs']")
    private WebElement tanggalBerakhir;

    @FindBy(xpath = "//label[@class='btn bg-[#19345E] w-20 flex gap-2']")
    private WebElement saveButton;

//    edit
    @FindBy(xpath = "//div[.='Class']")
    private WebElement editButton;
//delete
    @FindBy(xpath = "//div[.='Class']")
    private WebElement deleteButton;


    public void setClassButton(){
        classButton.click();
    }
    public void setAddNewButton(){
        addNewButton.click();
    }
    public void setFielClassName(String nama){
        fielClassName.sendKeys(nama);
    }
    public void setMentorName(String mentor){
        Select a = new Select(mentorName);
        a.selectByVisibleText(mentor);}
    public void setTanggalMulai(String start){
        tanggalMulai.sendKeys(start);
    }
    public void setTanggalBerakhir(String end){
        tanggalBerakhir.sendKeys(end);
    }
    public void setSaveButton(){
        saveButton.click();
    }
    public void setEditButton(){editButton.click();}
    public void setDeleteButton(){editButton.click();}
}
