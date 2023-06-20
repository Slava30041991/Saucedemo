package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.InventoryPage;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void loginUserValidDate (){
        registrationPage.openPage();
        registrationPage.inputLogin("standard_user","secret_sauce");
        //assertTrue(InventoryPage.)
    }
    @Test

    public void userFieldRequired(){
        registrationPage.openPage();
        registrationPage.inputLogin("","secret_sauce");
        Assert.assertEquals(registrationPage.getErrorMessage(),"Epic sadface: Username is required","сообщение не отображается");
    }
}
