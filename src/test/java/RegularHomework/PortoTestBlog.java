package RegularHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class PortoTestBlog {
    WebDriver driver;
    WebDriverWait wait;

    String email = "tester2@gmail.com";
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

    @Test
    public void verifyCommenting() {

        WebElement blog = driver.findElement(By.id("nav-menu-item-897"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", blog);
        blog.click();
        driver.findElement(By.cssSelector("div[data-title='Perfect Accessories']")).click();
        driver.findElement(By.id("comment")).sendKeys("Please pass");
        driver.findElement(By.id("author")).sendKeys(name);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("url")).sendKeys(url);
        driver.findElement(By.id("submit")).click();
        String actual = driver.findElement(By.xpath("//em[text()='Your comment is awaiting moderation.']")).getText();
        String expected = "Your comment is awaiting moderation.";
        Assert.assertEquals(actual, expected);
    }

//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
}
