package PizzaTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PizzaMenuNav

{
    private WebDriver driver;

    public PizzaMenuNav(WebDriver driver)
    {
        this.driver = driver;
    }

    //public void navigateToLoginPage()
    {
       // WebElement loginMenu = driver.findElement(By.className("person"));
       // loginMenu.click();

    }

       public void navigateToOrderMenu()
    {
        WebElement orderMenu = driver.findElement(By.cssSelector("[aria-label=menu]"));
        orderMenu.click();

    }

}
