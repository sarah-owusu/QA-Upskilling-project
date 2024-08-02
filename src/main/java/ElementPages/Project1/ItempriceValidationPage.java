package ElementPages.Project1;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItempriceValidationPage{
    WebDriver driver;

    private double shirtPrice = 15.99;
    private double onesiePrice = 7.99;
    private double totalPrice;
    private double tax = 1.92;
    private double overAllTotalPrice;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public double getShirtPrice() {
        return shirtPrice;
    }

    public void setShirtPrice(double shirtPrice) {
        this.shirtPrice = shirtPrice;
    }

    public double getOnesiePrice() {
        return onesiePrice;
    }

    public void setOnesiePrice(double onesiePrice) {
        this.onesiePrice = onesiePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getOverAllTotalPrice() {
        return overAllTotalPrice;
    }

    public void setOverAllTotalPrice(double overAllTotalPrice) {
        this.overAllTotalPrice = overAllTotalPrice;
    }

    public ItempriceValidationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void priceValidation() {
        totalPrice = shirtPrice + onesiePrice;
        overAllTotalPrice = totalPrice + tax;
        System.out.println("total price of the items are " + totalPrice);
        System.out.println("Over all total price are " + overAllTotalPrice);
    }
    @FindBy(xpath = "//button[@data-test='finish']")
    WebElement finishButton;

    @FindBy(xpath = "//h2[@class='complete-header']")
    WebElement successfulOrder;

    public void clickFinishButton() {
        Assert.state(finishButton.isDisplayed(), "Finish button is visible");
        finishButton.click();
    }

    public void isSuccessfullOrderTestDisplayed() {
        System.out.println(successfulOrder.getText());
    }
}
