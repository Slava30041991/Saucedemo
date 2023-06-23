package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.InventoryPage;
import page.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;

    String BASE_URL = "https://www.saucedemo.com";

    @BeforeMethod
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);

    }
        @AfterMethod(alwaysRun = true)
    public void tearDown (){
        driver.quit();
        }
}
