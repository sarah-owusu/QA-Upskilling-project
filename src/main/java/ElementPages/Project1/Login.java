package ElementPages.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


// Base class
public class Login {
    WebDriver driver;
    public Login(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement button;

    public void CompleteLogin()
    {
        userName.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        button.click();

        System.out.println("Go to next page" + driver.getCurrentUrl());
    }

    @FindBy(className = "app_logo")
    private WebElement logo;
    public void logoVisibllityStatus(){
        System.out.println(logo.isDisplayed());
    }
}
