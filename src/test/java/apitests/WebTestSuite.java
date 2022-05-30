package apitests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebTestSuite {

    private static WebDriver driver;

    @BeforeAll
    public static void Setup()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

    }

    @BeforeEach
    public void Start()
    {
        driver.get("https://d18u5zoaatmpxx.cloudfront.net/#/");
    }

    @AfterAll
    public static void Quit()
    {
        if (driver !=null)
            driver.quit();
    }

    @Test
    public void FormTest() {

        WebElement formsMenuButton = driver.findElement(By.cssSelector("[aria-label=forms]"));
        formsMenuButton.click();
        Assertions.assertEquals("https://d18u5zoaatmpxx.cloudfront.net/#/forms",driver.getCurrentUrl());
    }

    @Test
    public void PlanetTest(){

        WebElement planetsMenuButton = driver.findElement(By.cssSelector("[aria-label=planets]"));
        planetsMenuButton.click();
        Assertions.assertEquals("https://d18u5zoaatmpxx.cloudfront.net/#/planets",driver.getCurrentUrl());
    }

}
