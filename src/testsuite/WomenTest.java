package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utility.Utility;

public class WomenTest extends Utility {
    String baseUrl = "https://magento.softwaretestingboard.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }

    @Test
    public void verifyTheSortByProductNameFilter() {
        //Mouse hover on Women Menu
        WebElement women=driver.findElement(By.xpath("//span[contains(text(),'Women')]"));
        WebElement Tops=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[2]"));
        Actions actions=new Actions(driver);
        actions.moveToElement(women).moveToElement(Tops).click().build().perform();
        //Click on Jackets
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();
        //select sort By filter Product name
        WebElement dropDown= driver.findElement(By.name("PRICE"));
        Select select=new Select(dropDown);

    }
    @Test
    public void verifyTheSortByPriceFilter(){
        //Mouse hover on Women Menu
        WebElement women=driver.findElement(By.xpath("//span[contains(text(),'Women')]"));
        WebElement Tops=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[2]"));
        Actions actions=new Actions(driver);
        actions.moveToElement(women).moveToElement(Tops).click().build().perform();
        //Click on Jackets
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")).click();


    }




    @After
    public void tearDown() {
          closeBrowser();
    }

}
