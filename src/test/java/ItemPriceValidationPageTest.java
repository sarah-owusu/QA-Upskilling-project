import ElementPages.Project1.Login;
import org.testng.annotations.Test;

public class ItemPriceValidationPageTest extends BaseScript{

    @Test
    public void ItemPriceValidationPageTest(){

        Login loginTest = new Login(driver);
        loginTest.CompleteLogin();
    }
}
