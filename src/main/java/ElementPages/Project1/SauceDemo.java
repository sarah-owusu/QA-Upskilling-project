package ElementPages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class SauceDemo {
    WebDriver driver;

    public SauceDemo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@data-test='add-to-cart-sauce-labs-backpack']")
    private WebElement addFirstItem;

    @FindBy(xpath = "(//div[@data-test='inventory-item-price'])[1]")
    WebElement firstItemAddedPrice;

    @FindBy(xpath = "//button[@data-test='add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElement addSecondItem;

    @FindBy(xpath = "(//div[@data-test='inventory-item-price'])[2]")
    WebElement secondItemAddedPrice;

    @FindBy(xpath = "//button[@data-test='add-to-cart-sauce-labs-onesie']")
    private WebElement addThirdItem;

    @FindBy(xpath = "(//div[@data-test='inventory-item-price'])[3]")
    WebElement thirdItemAddedPrice;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
    WebElement cartCount;

    public void addFirstItemToCart() {
        addFirstItem.click();

//        TakesScreenshot firstItemAddedPrice = (TakesScreenshot) driver;
        File sourceFile = firstItemAddedPrice.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(System.getProperty("user.dir") + "\\Screenshots\\firstItemAddedPrice.png");
        try {
            FileUtils.copyFile(sourceFile, targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addSecondItemToCart() {
        addSecondItem.click();

//        TakesScreenshot secondItemAddedPrice = (TakesScreenshot) driver;
        File sourceFile = secondItemAddedPrice.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(System.getProperty("user.dir") + "\\Screenshots\\secondItemAddedPrice.png");
        try {
            FileUtils.copyFile(sourceFile, targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addThirdItemToCart() {
        addThirdItem.click();

//        TakesScreenshot thirdItemAddedPrice = (TakesScreenshot) driver;
        File sourceFile = thirdItemAddedPrice.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(System.getProperty("user.dir") + "\\Screenshots\\thirdItemAddedPrice.png");
        try {
            FileUtils.copyFile(sourceFile, targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
