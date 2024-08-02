package ElementPages.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormFilledPage {
    WebDriver driver;

    public FormFilledPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastName;

    @FindBy(xpath = "//input[@data-test='postalCode']")
    WebElement postalCode;

    public void enterFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void enterPostalCode(String postalCode) {
        this.postalCode.sendKeys(postalCode);
    }

    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueButton;

    public void clickContinueButton() {
        continueButton.click();
    }

    private void validateForm(){
        if (firstName.getAttribute("value").isEmpty()) {
            throw new IllegalStateException("Error: First Name is required");
        } else if (lastName.getAttribute("value").isEmpty()) {
            System.out.println("Error: last Name is required");

        } else if (postalCode.getAttribute("value").isEmpty()) {
            System.out.println("Error: postal Code is required");
        } else {
            System.out.println("form filled is successfully");
        }
    }



}
