package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    private WebDriver driver;

    @FindBy(id = "author")
    WebElement authorName;
    @FindBy(id = "email")
    WebElement authorEmail;
    @FindBy(id = "comment")
    WebElement commentText;
    @FindBy(id = "submit")
    WebElement submiCommentButton;


    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setCommentName(String userName) {
        authorName.sendKeys(userName);
    }

    public void setCommentEmail(String userEmail) {
        authorEmail.sendKeys(userEmail);
    }

    public void setCommentText(String userComment) {
        commentText.sendKeys(userComment);
    }

    public void submitComment() {
        submiCommentButton.click();
    }
}
