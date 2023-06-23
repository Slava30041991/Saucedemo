package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import tests.BaseTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class InventoryPage extends BasePage {
    public static final By INVENTORI_TITLE = By.xpath("//span[@class ='title'  and text() = 'Products' ]");
    public static final By INVENTORY_ITEM = By.xpath("//div[text() ='Sauce Labs Backpack']/ancestor::div[@class = 'inventory_item']");
    public static final By SHOPPING_CART = By.xpath("//div[@id = 'shopping_cart_container']");
    public static final By YOUR_CART = By.xpath("//span[@class = 'title']");
    public static final By CONTINUE_SHOPPING = By.xpath("//button[@id = 'continue-shopping']");
    public static final By SORTING_PRODUCT_WINDOW = By.xpath("//select[@class = 'product_sort_container']");
    public static final By BUTTON_DELETE_PRODUCT_CART = By.xpath("//button[@class = 'btn btn_secondary btn_small cart_button']");
    public static final By BUTTON_CART = By.xpath("//span[@class = 'shopping_cart_badge']");
    public InventoryPage(WebDriver driver) {
        super(driver);
    }
    public void buttonSortingProduct(){
        driver.findElements(SORTING_PRODUCT_WINDOW);

        List<WebElement> webElementList= driver.findElements(By.xpath("//select/option"));
        List<String>unsortedProduct = new ArrayList<>();
        unsortedProduct.add(webElementList.get(3).getText());
        Collections.sort(unsortedProduct);

        driver.findElement(By.xpath("//select[@class ='product_sort_container' ]")).click();

        List<WebElement> webElementSorted = driver.findElements(By.xpath("//select/option"));
        List<String>sortedProduct = new ArrayList<>();
        sortedProduct.add(webElementList.get(3).getText());

        assertEquals(unsortedProduct,sortedProduct,"Массивы не равны или не отсортированы");
    }
    public void addingProduct (){
        driver.findElement(SHOPPING_CART).click();
        driver.findElement(CONTINUE_SHOPPING).click();
    }

    public void removingProductFromCart(){
        driver.findElement(BUTTON_DELETE_PRODUCT_CART).click();
    }
    public void userViewsFullInformationAboutProduct(){
        driver.findElement(INVENTORY_ITEM).click();
        driver.findElement(SHOPPING_CART).click();
        driver.findElement(BUTTON_CART).click();
        driver.findElement(BUTTON_DELETE_PRODUCT_CART).click();
    }

    public String deletingGoodsCart(){

        return driver.findElement(By.xpath(itemNameFromInventory)).getText();
    }
        public String itemNameFromInventory() {
            return driver.findElement(By.xpath(itemNameFromInventory)).getText();
        }

        public boolean titleVisible () {
            return driver.findElement(INVENTORI_TITLE).isDisplayed();


        }
    }
