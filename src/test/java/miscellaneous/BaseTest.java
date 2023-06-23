package miscellaneous;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.InventoryPage;
import page.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    String BASE_URL = "https://www.saucedemo.com";
    String nameLockedOutUser = "locked_out_user";
    String problemUsername = "problem_user";
    String problemUsernameLocator = "//a[@id='item_4_img_link']";
    WebDriver driver;
    @BeforeMethod
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        InventoryPage inventoryPage = new InventoryPage(driver);
        LoginPage registrationPage = new LoginPage(driver);


    }
        @AfterMethod(alwaysRun = true)
    public void tearDown (){
        driver.quit();
        }
}
