import ElementPages.Project1.CartPage;
import ElementPages.Project1.FormFilledPage;
import ElementPages.Project1.ItempriceValidationPage;
import ElementPages.Project1.Login;
import org.testng.annotations.Test;

public class ProductPageTest extends  BaseScript{

    @Test
    public  void ProductPageTest() {

        Login loginTest = new Login(driver);
        loginTest.CompleteLogin();

        //perform product actions
        ElementPages.SauceDemo sauceDemoTest = new ElementPages.SauceDemo(driver);
        sauceDemoTest.addFirstItemToCart();
        sauceDemoTest.addSecondItemToCart();
        sauceDemoTest.addThirdItemToCart();

        // clicking on the cart icon
        CartPage cartpage = new CartPage(driver);
        cartpage.clickCartIcon();

        // removing one item from the cart
        cartpage.removeBackpackFromCart();

        // Clicking on the checkout button
        cartpage.clickCheckoutButton();

        // Asserting the page Url
        cartpage.pageUrl();

        FormFilledPage formFilledPage = new FormFilledPage(driver);
        formFilledPage.enterFirstName("John");
        formFilledPage.enterLastName("Doe");
        formFilledPage.enterPostalCode("123");

        //verifying input fields are filled
        FormFilledPage formFilledPage1 = new FormFilledPage(driver);
        formFilledPage1.clickContinueButton();

        // verifying sum of item prices
        ItempriceValidationPage itemsPrice = new ItempriceValidationPage(driver);
        itemsPrice.priceValidation();

        itemsPrice.clickFinishButton();

        itemsPrice.isSuccessfullOrderTestDisplayed();


    }

    }



