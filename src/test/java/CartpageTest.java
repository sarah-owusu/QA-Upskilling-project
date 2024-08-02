import ElementPages.Project1.Login;
import org.testng.annotations.Test;

public class CartpageTest extends BaseScript{

    @Test
    public void CartPageTest(){

        Login loginTest = new Login(driver);
        loginTest.CompleteLogin();

    }


}
