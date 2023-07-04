package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.Utility;

public class MenTest extends Utility {
    String baseUrl = "https://magento.softwaretestingboard.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        //Mouse hover on Men Menu
        WebElement men=driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
        WebElement Bottoms=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]/span[2]"));
        Actions actions=new Actions(driver);
        actions.moveToElement(men).moveToElement(Bottoms).click().build().perform();
        //Click on pants
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]")).click();


    }








    @After
    public void tearDown() {
        //    closeBrowser();
    }
}
