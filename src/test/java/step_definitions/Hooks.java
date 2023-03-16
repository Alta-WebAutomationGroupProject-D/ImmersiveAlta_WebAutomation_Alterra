package step_definitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hooks {
    public static WebDriver webDriver;

    @Before
    public void openBrowser(){
        WebDriverManager.edgedriver().setup();
        webDriver = new EdgeDriver();
        String appUrl = "https://immersive-dashboard-tawny.vercel.app/";
        webDriver.get(appUrl);
        webDriver.manage().window().maximize();
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        webDriver.quit();
    }
}
