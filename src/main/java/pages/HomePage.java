package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class HomePage {

    private By closeAddPopUp = By.xpath("//button[@title='Close']");
    private By myAccountBtn = By.id("nav-menu-item-895");
    private By blogBtn = By.id("nav-menu-item-897");

    
    
    
    public void setCloseAddPopUp (){
        SeleniumHelpers.findElement(closeAddPopUp).click();
    }

    public void navigateToMyAccount (){
        SeleniumHelpers.findElement(myAccountBtn).click();
    }

    public void navigateToBlog (){SeleniumHelpers.findElement(blogBtn).click();}


}
