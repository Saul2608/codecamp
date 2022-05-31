package apitests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    @Test
    public void FormsInsertTest(){

        WebElement formsInsertField = driver.findElement(By.cssSelector("[aria-label=forms]"));
        formsInsertField.click();
        var insertName = driver.findElement(By.id("name"));
                insertName.sendKeys("Saul");
        var insertEmail = driver.findElement(By.id("email"));
                insertEmail.sendKeys("Example@email.com");
        var insertState = driver.findElement(By.id("state"));
                insertState.sendKeys("NSW");
        var agreeButton = driver.findElement(By.cssSelector("[for=agree]"));
                agreeButton.click();
        var Buttons = driver.findElements(By.className("v-btn"));
        for (WebElement button : Buttons){

                if (button.getText().equalsIgnoreCase("submit")){
                button.click();
            }
        }

        var popupMessage = driver.findElement(By.className("popup-message"));
        new WebDriverWait(driver, 10).until(d ->popupMessage.isDisplayed());
        Assertions.assertEquals("Thanks for your feedback Saul",popupMessage.getText());
    }
}
