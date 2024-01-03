package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class ProductPage {

    private By colourRadioBtn = By.linkText("Black");
    private  By sizeRadioBtn = By.linkText("L");
    private By addToCartBtn = By.cssSelector("button.single_add_to_cart_button");
    private By viewCartBtn = By.xpath("//a[@class = \"wc-action-btn view-cart-btn button wc-forward\"]");

    public void selectProductDetails(){
        SeleniumHelpers.findElement(colourRadioBtn).click();
        SeleniumHelpers.findElement(sizeRadioBtn).click();
    }
    public void clickOnAddToCartBtn (){
        SeleniumHelpers.findElement(addToCartBtn).click();

    }
    public  void clickOnViewCartBtn (){
        SeleniumHelpers.findElement(viewCartBtn).click();}
    }

