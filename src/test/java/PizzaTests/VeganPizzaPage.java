package PizzaTests;

import apitests.PlanetTile;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VeganPizzaPage

{

    private WebDriver driver;

    public VeganPizzaPage(WebDriver driver)
    {

        this.driver = driver;

    }

    private List<WebElement> getVeganPizzaTile()

    {
        return driver.findElements(By.className("planet"));
    }

    public PlanetTile findVeganPizzaTileByName()
    {
        VeganPizzaTile foundPizzaTile = null;
        var tiles = getVeganPizzaTile();
        for (WebElement tile : tiles)
        {

            var currentTile = new VeganPizzaTile(tile);
            if (currentTile.getPizzaVeganTile().equalsIgnoreCase())
            {

                foundVeganPizzaTile = currentTile;
                break;
            }
        }

        if (foundPizzaTile.getPizzaVeganTile()== null) throw (new NotFoundException());
        return foundVeganPizzaTile;

    }

}