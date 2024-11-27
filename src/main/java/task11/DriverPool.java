package task11;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverPool {
    static WebDriver driver;
    static WebDriverWait wait;

    static WebDriver getDriver() {
        if(driver==null) {

            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();

            driver.manage().window().maximize();

            wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        }
        return driver;
    }
}
