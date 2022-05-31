package apitests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class BaseTestSuite {

    protected static WebDriver driver;

    @BeforeAll
    public static void Setup() throws MalformedURLException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Installs\\Installs\\chromedriver102\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

    }

    @BeforeEach
    public void Startup()

    {
        driver.get("https://d18u5zoaatmpxx.cloudfront.net/#/");
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void Quit()
    {
        if (driver !=null)
            driver.quit();
    }

}
