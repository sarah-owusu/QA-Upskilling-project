import ElementPages.Project1.Login;
import org.testng.annotations.Test;

public class FormFilledPageTest extends BaseScript{


    @Test(dataProvider = "formData", dataProviderClass = CheckoutTestData.class)
    public void testCheckoutPage(String firstName, String lastName, int postalCode) {

        Login loginTest = new Login(driver);
        loginTest.CompleteLogin();

    }
}
