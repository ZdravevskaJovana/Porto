package POMTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifySuccessfullyCheckout extends BaseClass {

    @Test
    public void verifyCheckout () throws InterruptedException {
        homePage.setCloseAddPopUp();
        homePage.navigateToMyAccount();

        myAccPageLoginOrRegistration.enterRegisterEmailAddress("tester2@gmail.com");
        myAccPageLoginOrRegistration.clickOnRegisterBtn();
        myAccountPage.searchProduct("Blue Backpack for Young");

        productPage.selectProductDetails();
        productPage.clickOnAddToCartBtn();
        productPage.clickOnViewCartBtn();

        shoppingCartPage.clickOnProceedToCheckoutBtn();

        checkoutPage.enterBillingDetails(
                "Jovana",
                "Zdrav",
                "Ulica 1",
                "Bitola",
                "Macedonia",
                "7000",
                "076441598",
                "tester2@gmail.com");

        Thread.sleep(3000);
        checkoutPage.clickOnPlaceOrderBtn();
        String actualMsg = orderCompletePage.getOrderCompletionMsg();
        String expectedMsg = "Order Complete";

        Assert.assertEquals(actualMsg,expectedMsg);




    }
}
