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

    //div[.='User']
    //li[@class='cursor-pointer']//div[.='User']
    @FindBy(xpath = "//div[.='User']")
    private WebElement clickButtonUser;

    @FindBy(xpath = "//th[.='No']")
    private WebElement verifyUserPage;

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

    //tr[5]//label[1]
    //tr[5]/td[@class='flex gap-6']//label[1]
    //tbody > tr:nth-of-type(5) .text-green-600
    //tbody[1]/tr[5]/td[@class='flex gap-6']//label[1]
    //tbody > tr:nth-of-type(5) [d='M880 836H144c-17.7 0-32 14.3-32 32v36c0 4.4 3.6 8 8 8h784c4.4 0 8-3.6 8-8v-36c0-17.7-14.3-32-32-32zm-622.3-84c2 0 4-.2 6-.5L431.9 722c2-.4 3.9-1.3 5.3-2.8l423.9-423.9a9.96 9.96 0 0 0 0-14.1L694.9 114.9c-1.9-1.9-4.4-2.9-7.1-2.9s-5.2 1-7.1 2.9L256.8 538.8c-1.5 1.5-2.4 3.3-2.8 5.3l-29.5 168.2a33.5 33.5 0 0 0 9.4 29.8c6.6 6.4 14.9 9.9 23.8 9.9z']
    //tbody > tr:nth-of-type(5) path[d='M880 836H144c-17.7 0-32 14.3-32 32v36c0 4.4 3.6 8 8 8h784c4.4 0 8-3.6 8-8v-36c0-17.7-14.3-32-32-32zm-622.3-84c2 0 4-.2 6-.5L431.9 722c2-.4 3.9-1.3 5.3-2.8l423.9-423.9a9.96 9.96 0 0 0 0-14.1L694.9 114.9c-1.9-1.9-4.4-2.9-7.1-2.9s-5.2 1-7.1 2.9L256.8 538.8c-1.5 1.5-2.4 3.3-2.8 5.3l-29.5 168.2a33.5 33.5 0 0 0 9.4 29.8c6.6 6.4 14.9 9.9 23.8 9.9z']
    @FindBy(css = "tbody > tr:nth-of-type(5) .text-green-600")
    private WebElement editProfileUserButton;

    @FindBy(xpath = "//h3[@class='text-lg font-bold text-center mb-5']")
    private WebElement vrfyPopUpEditUserProfile;

    @FindBy(xpath = "//input[@value='Fajar Sadboy']")
    private static WebElement editNama;

    @FindBy(xpath = "//input[@value='uniqueemailbanget123@gmail.com']")
    private static WebElement editEmail;

    @FindBy(xpath = "//tbody[1]/tr[6]/td[@class='flex gap-6']//span[1])")
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

    public void setClickBtnAddUser(){
        clickBtnAddUser.click();
    }

    public boolean setVrfyAddUserPopUp(){
        vrfyAddUserPopUp.isDisplayed();
        return true;
    }

    public void setButtonEditProfileUser(){
        editProfileUserButton.click();
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
