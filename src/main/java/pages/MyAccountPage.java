package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MyAccountPage {

    private By searchField = By.name("s");

    public void searchProduct (String product){
        SeleniumHelpers.findElement(searchField).sendKeys(product+ Keys.ENTER);
    }
}
