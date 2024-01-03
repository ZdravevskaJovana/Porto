package POMTests;

import helpers.SeleniumHelpers;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifySuccessfullyCommentingOnBlog extends BaseClass{

    @Test
    public void verifyCommentingOnBlog(){
        homePage.navigateToBlog();

        blogPage.selectBlogTopic();

        chosenBlogPage.writeAComment(
                "Finally pass","JOVANA", "jovana@test.com", "https://www.google.com/");

        String actualName = chosenBlogPage.getMsg();
        String expectedName = "Your comment is awaiting moderation.";
        System.out.println(actualName);


        Assert.assertEquals(actualName, expectedName);



    }


}
