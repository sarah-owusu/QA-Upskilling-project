import org.testng.annotations.DataProvider;

public class CheckoutTestData {

    @DataProvider(name = "checkoutDataProvider")
    public Object[][] checkoutDataProvider() {
        return new Object[][]{
                {"John", "Doe", "12345"},
        };
    }
}
