package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {


    public static String MAINPAGE_URL = "http://www.awful-valentine.com";

    WebDriver driver;

    @FindBy(id = "searchinput")
    WebElement searchField;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ResultPage searchText(String searchWord) {

        searchField.sendKeys(searchWord);
        searchField.sendKeys(Keys.ENTER);
        return new ResultPage(driver);
    }

}
