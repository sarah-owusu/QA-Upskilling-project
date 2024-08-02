package ElementPages.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cart;
    public void clickCartIcon(){
        cart.click();
    }

    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removeBackpack;

    public void removeBackpackFromCart() {
        removeBackpack.click();
    }

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButton;

    public void clickCheckoutButton() {
        checkoutButton.click();
    }

    public String pageUrl(){
        return driver.getCurrentUrl();
    }
    }

