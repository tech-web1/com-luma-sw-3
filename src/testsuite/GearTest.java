package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GearTest extends BaseTest {
    String baseUrl = "https://magento.softwaretestingboard.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        //Mouse Hover on Gear Menu
        WebElement Gear=driver.findElement(By.xpath("//span[contains(text(),'Gear')]"));
        Actions actions=new Actions(driver);
        actions.moveToElement(Gear).click().build().perform();
        //Click on Bags
        driver.findElement(By.xpath("//span[contains(text(),'Bags')]")).click();
        //Click on Product Name
        driver.findElement(By.xpath("//a[contains(text(),'Overnight Duffle')]")).click();
    }

}
