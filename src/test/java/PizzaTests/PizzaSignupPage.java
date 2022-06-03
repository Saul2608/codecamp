package PizzaTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PizzaSignupPage {

    private WebDriver driver;

    public PizzaSignupPage(WebDriver driver)
    {

        this.driver = driver;

    }

    public void setUserName(String name)
    {

        var insertName = driver.findElement(By.id("input-94"));
        insertName.sendKeys(name);

    }

    public void setPassword(String password)
    {

        var insertEmail = driver.findElement(By.id("input-97"));
        insertEmail.sendKeys(password);

    }

    public void setConfirm(String confirm)
    {

        var insertConfirm = driver.findElement(By.id("input-100"));
        insertConfirm.sendKeys(confirm);

    }

    public void NewSign()
    {

        var insertNewSign = driver.findElement(By.tagName("P"));
        insertNewSign.click();

    }


    public void pressLogin()
    {

        var Buttons = driver.findElements(By.className("v-btn"));
        for (WebElement button : Buttons) {

            if (button.getText().equalsIgnoreCase("person")) {
                button.click();
            }
        }
    }



    public void pressSignup()
    {

        var Buttons = driver.findElements(By.className("v-btn"));
        for (WebElement button : Buttons) {

            if (button.getText().equalsIgnoreCase("sign up")) {
                button.click();
            }
        }
    }

    public String getErrorUserName(){


        return driver.findElement(By.id("username-err")).getText();


    }

    public String getErrorPassword(){

        return driver.findElement(By.id("password-err")).getText();


    }

    public String getErrorConfirm(){

        return driver.findElement(By.id("confirm-err")).getText();


    }

}


