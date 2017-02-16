package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AbstractClass {

    protected static WebDriver driver;
    public static MainPage mainPage;

    @BeforeClass
    public static void setUp() throws Exception {
        driver  = new ChromeDriver();
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        driver.get(MainPage.MAINPAGE_URL);
    }

    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }
}
