package locator.user;

import locator.LogInOutPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserPage {
    public static WebDriver driver;

    public UserPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        LogInOutPage.driver = driver;
    }

    @FindBy(xpath = "//li[@class='cursor-pointer']//div[.='User']")
    private WebElement clickButtonUser;

    @FindBy(xpath = "//th[.='No']")
    private WebElement verifyUserPage;

    @FindBy(xpath = "//h3[@class='text-lg font-bold text-center mb-5']")
    private WebElement vrfyPopUpEditUserProfile;

    @FindBy(xpath = "//label[@class='btn bg-[#19345E]']")
    private WebElement clickBtnAddUser;

    @FindBy(xpath = "//h3[@class='text-lg font-bold text-center mb-5']")
    private WebElement vrfyAddUserPopUp;

    @FindBy(xpath = "//table[@class='w-full']/tr[1]//input[@class='mb-3 input input-bordered w-full max-w-xs']")
    private static WebElement nama;

    @FindBy(xpath = "//tr[3]//input[@class='mb-3 input input-bordered w-full max-w-xs']")
    private static WebElement password;

    @FindBy(xpath = "//table[@class='w-full']/tr[2]//input[@class='mb-3 input input-bordered w-full max-w-xs']")
    private static WebElement email123;

    @FindBy(xpath = "//tr[4]//select[@class='mb-3 select select-bordered w-full max-w-xs']")
    private WebElement team;

    @FindBy(xpath = "//tr[5]//select[@class='mb-3 select select-bordered w-full max-w-xs']")
    private WebElement status;

    @FindBy(xpath = "//label[@class='btn bg-[#19345E] w-20 flex gap-2']")
    private WebElement saveAddUser;

    @FindBy(xpath = "//label[@class='btn bg-white border-[#19345E] text-[#19345E] hover:bg-[#19345E] hover:text-white w-20 flex gap-2']")
    private WebElement cancelAddUser;

    @FindBy(css = "tbody > tr:nth-of-type(5) .text-green-600")
    private WebElement editProfileUserButton;

    @FindBy(xpath = "//input[@value='Fajar Sadboy']")
    private static WebElement editNama;

    @FindBy(xpath = "//input[@value='uniqueemailbanget123@gmail.com']")
    private static WebElement editEmail;

    @FindBy(css = "tbody > tr:nth-of-type(2) [d='M864 256H736v-80c0-35.3-28.7-64-64-64H352c-35.3 0-64 28.7-64 64v80H160c-17.7 0-32 14.3-32 32v32c0 4.4 3.6 8 8 8h60.4l24.7 523c1.6 34.1 29.8 61 63.9 61h454c34.2 0 62.3-26.8 63.9-61l24.7-523H888c4.4 0 8-3.6 8-8v-32c0-17.7-14.3-32-32-32zm-200 0H360v-72h304v72z']")
    private WebElement deleteButton;

    @FindBy(xpath = "//th[.='Fullname']")
    private WebElement btnNotShow;

    @FindBy(xpath = "//input[@class='input w-full max-w-[150px]']")
    private static WebElement searchUser;

    @FindBy(xpath = "//button[contains(.,'Next')]")
    private WebElement btnNextListUser;

    @FindBy(xpath = "//th[.='1']")
    private WebElement vrfyFilterSearch;


    public void setClickUserButton(){
        clickButtonUser.click();
    }

    public boolean setVerifyUserPage(){
        verifyUserPage.isDisplayed();
        return true;
    }

    public void setButtonEditProfileUser(){
        editProfileUserButton.click();
    }

    public boolean setVrfyAddUserPopUp(){
        vrfyAddUserPopUp.isDisplayed();
        return true;
    }

    public void setClickBtnAddUser(){
        clickBtnAddUser.click();
    }

    public boolean setVrfyEditUserProfile(){
        vrfyPopUpEditUserProfile.isDisplayed();
        return true;
    }

    public static void setNama(String name){
        nama.sendKeys(name);
    }

    public static void setPassword(String passnewuser) {
        password.sendKeys(passnewuser);
    }

    public static void setEmailProfile(String emailnewuser){
        email123.sendKeys(emailnewuser);
    }

    public static void clearField(){
        editNama.clear();
        editEmail.clear();
    }

    public void pilihTeam(String team1){
        Select a = new Select(team);
        a.selectByVisibleText(team1);
    }

    public void pilihStatus(String status1){
        Select a = new Select(status);
        a.selectByVisibleText(status1);
    }

    public void adminClickBtnSaveAddUser(){
        saveAddUser.click();
    }

    public void adminClickBtnCancelAddUser(){
        cancelAddUser.click();
    }

    public void adminClickDeleteButton(){
        deleteButton.click();
    }

    public boolean buttonDoesntExist(){
        btnNotShow.isDisplayed();
        return true;
    }

    public static void searchingUser(String keyword){
        searchUser.sendKeys(keyword);
    }

    public void clickNextList(){
        btnNextListUser.click();
    }

    public boolean filterSearch(){
        vrfyFilterSearch.isDisplayed();
        return true;
    }

}