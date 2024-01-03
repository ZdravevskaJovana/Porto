package RegularHomework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.Set;

public class PortoTests {
    WebDriver driver;
    WebDriverWait wait;

    String email = "tester2@gmail.com";
    String password = "Test123*";
    String name = "Tester";
    String url = "https://www.portotheme.com/wordpress/porto/shop4-soft/";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Blue Backpack for Young

    }

    @Test(priority = 1)
    public void Registration() throws InterruptedException {


        Thread.sleep(5000);
        WebElement closeBtn = driver.findElement(By.xpath("//button[@title='Close']"));
        closeBtn.click();
        String parentHandle = driver.getWindowHandle();

        driver.findElement(By.id("nav-menu-item-895")).click();
        driver.findElement(By.id("reg_email")).sendKeys(email);
        driver.findElement(By.name("s")).sendKeys("Blue Backpack for Young" + Keys.ENTER);
        driver.findElement(By.linkText("Black")).click();
        driver.findElement(By.linkText("L")).click();
        driver.findElement(By.cssSelector("button.single_add_to_cart_button")).click();
        driver.findElement(By.cssSelector("a.view-cart-btn ")).click();
        driver.findElement(By.cssSelector("div.porto-radio ")).click();

        // Shopping Cart page

        WebElement proceed = driver.findElement(By.className("wc-proceed-to-checkout"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", proceed);
        wait.until(ExpectedConditions.elementToBeClickable(proceed)).click();




        driver.findElement(By.id("billing_first_name")).sendKeys("Ime");
        driver.findElement(By.id("billing_last_name")).sendKeys("Prezime");
        driver.findElement(By.id("billing_address_1")).sendKeys("Ulica 36");
        driver.findElement(By.id("billing_city")).sendKeys("Bitola");
        driver.findElement(By.id("billing_state")).sendKeys("Macedonia");
        driver.findElement(By.id("billing_postcode")).sendKeys("7000");
        driver.findElement(By.id("billing_phone")).sendKeys("123456");
        driver.findElement(By.id("billing_email")).sendKeys(email);
       WebElement submitBtn=  driver.findElement(By.id("place_order"));
       wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
       submitBtn.click();
       String actual = driver.findElement(By.partialLinkText("Complete")).getText();
       String expected = "Order Complete";

        Assert.assertEquals(actual, expected);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}




