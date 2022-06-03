package PizzaTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VeganPizzaTile
{


    private WebElement element;

    public VeganPizzaTile(WebElement el)
    {
        this.element = el;
    }

    public String getPizzaVeganTile()
    {

        return element.findElement(By.cssSelector("[aria-label=Badge]")).getText();

    }

    public String getPizzaPrice()
    {

        return element.findElement(By.className("price")).getText();

    }

}
