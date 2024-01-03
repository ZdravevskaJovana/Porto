package POMTests;

import helpers.SeleniumHelpers;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pages.*;

import java.time.Duration;

public class BaseClass {

    HomePage homePage;
    MyAccPageLoginOrRegistration myAccPageLoginOrRegistration;
    CheckoutPage checkoutPage;
    MyAccountPage myAccountPage;
    OrderCompletePage orderCompletePage;
    ProductPage productPage;
    ShoppingCartPage shoppingCartPage;
    BlogPage blogPage;
    ChosenBlogPage chosenBlogPage;

    @BeforeClass
    public void setUp(){
        SeleniumHelpers.initializingWebDriver();
        SeleniumHelpers.getDriver().manage().window().maximize();
        SeleniumHelpers.getDriver().get("https://www.portotheme.com/wordpress/porto/shop4-soft/");
        SeleniumHelpers.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @BeforeTest
    public void initPages(){
        homePage = new HomePage();
        myAccPageLoginOrRegistration = new MyAccPageLoginOrRegistration();
        checkoutPage = new CheckoutPage();
        myAccountPage = new MyAccountPage();
        orderCompletePage = new OrderCompletePage();
        productPage = new ProductPage();
        shoppingCartPage = new ShoppingCartPage();
        blogPage = new BlogPage();
        chosenBlogPage = new ChosenBlogPage();


    }

    @AfterClass
    public void tearDown (){SeleniumHelpers.getDriver().quit();    }
}
