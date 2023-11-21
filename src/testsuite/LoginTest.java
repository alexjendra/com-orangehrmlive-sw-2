package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
     String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Test
     public void userShouldLoginSuccessfullyWithValidCredentials(){
     //enter "Admin" username
         driver.findElement(By.name("username")).sendKeys("Admin");
         //enter 'admin123' password
         driver.findElement(By.name("password")).sendKeys("admin123");
         //click on login button
         driver.findElement(By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
         //verify the 'Dashboard' text is display
         String expected = "Dashboard";
         String actual = driver.findElement(By.xpath("//div[@class = 'oxd-topbar-header-title']//h6[@class = 'oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        Assert.assertEquals(expected, actual);



     }
     @Before
    public void setup(){

        openBrowser(baseUrl);
     }
     @After
    public void tearDown(){

        closeBrowser();
     }

}
