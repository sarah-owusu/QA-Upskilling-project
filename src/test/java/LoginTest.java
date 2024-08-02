import ElementPages.Project1.Login;
import ElementPages.SauceDemo;
import org.testng.annotations.Test;

public class LoginTest extends  BaseScript{

    @Test
    public void loginTest()
    {
        Login loginTest = new Login(driver);
        loginTest.CompleteLogin();

        loginTest.logoVisibllityStatus();

        SauceDemo sauceDemoTest = new SauceDemo(driver);
        sauceDemoTest.addFirstItemToCart();
        sauceDemoTest.addSecondItemToCart();
        sauceDemoTest.addThirdItemToCart();

    }
}
