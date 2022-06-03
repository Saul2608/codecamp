package PizzaTests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class PizzaBaseTest
{

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
        driver.get("https://d3udduv23dv8b4.cloudfront.net/#/");
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void Quit()

    {
        if (driver !=null)
            driver.quit();
    }

}


