package PizzaTests;

import apitests.FormsPage;
import apitests.MenuPage;
import apitests.PlanetsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PizzaTestSuite extends PizzaBaseTest
{
    @Test
    public void SignupTest(){

       var signup = new PizzaSignupPage(driver);

        signup.pressLogin();
        signup.NewSign();
        signup.setUserName("abc");
        signup.setPassword("abc");
        signup.setConfirm("def");
        signup.pressSignup();

        signup.getErrorUserName();
        signup.getErrorPassword();
        signup.getErrorConfirm();


        Assertions.assertEquals("Username is required", signup.getErrorUserName());
        Assertions.assertEquals("Password is required", signup.getErrorPassword());
        Assertions.assertEquals("Please confirm your password", signup.getErrorConfirm());

    }

    @Test
    public void VeganPizza()
    {

        var menu = new PizzaMenuNav(driver);
        menu.navigateToOrderMenu();



    }
}
