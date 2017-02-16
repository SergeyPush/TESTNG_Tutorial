package Tests;

import Pages.AbstractClass;
import Pages.ProductPage;
import Pages.ResultPage;
import org.testng.annotations.Test;

public class Test001 extends AbstractClass {


    @Test
    public void testFirstTest() throws Exception {

        ResultPage result = mainPage.searchText("Our love is special!!");

        ProductPage product = result.selectFirstItem();

        product.setCommentName("User");
        product.setCommentEmail("e-mail@mail.com");
        product.setCommentText("This is short comment");
        product.submitComment();

    }
}
