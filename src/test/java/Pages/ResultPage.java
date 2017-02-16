package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPage {

    private WebDriver driver;

    public ResultPage(WebDriver driver) {
        this.driver = driver;

    }

    public ProductPage selectFirstItem() {

        driver.findElement(By.xpath(".//*[@id='main-products']/div[1]")).click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.withMessage("Element was not found")
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='category-inner']/h1")));

        return new ProductPage(driver);
    }
}
