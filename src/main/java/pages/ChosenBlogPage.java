package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class ChosenBlogPage {

    private By commentField = By.id("comment");
    private By authorField = By.id("author");
    private By emailField = By.id("email");
    private By urlField = By.id("url");
    private By submitBtn = By.id("submit");
    private By messageAfterCommenting = By.xpath("//em[text()='Your comment is awaiting moderation.']");

    public void writeAComment (String comment, String author, String email, String url){
        SeleniumHelpers.findElement(commentField).sendKeys(comment);
        SeleniumHelpers.findElement(authorField).sendKeys(author);
        SeleniumHelpers.findElement(emailField).sendKeys(email);
        SeleniumHelpers.findElement(urlField).sendKeys(url);
        SeleniumHelpers.findElement(submitBtn).click();
    }
    public String getMsg (){
      return  SeleniumHelpers.findElement(messageAfterCommenting).getText();
    }
}
