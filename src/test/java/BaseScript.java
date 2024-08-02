import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseScript {

    WebDriver driver;
    @BeforeMethod

    public void setUp() throws InterruptedException {
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://www.saucedemo.com/";
        driver.get(url);

        Thread.sleep(3000);

    }

    @AfterMethod
    public void allMethodDone(){
        driver.close();
    }

}
