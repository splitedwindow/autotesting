package task11;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static task11.DriverPool.getDriver;

public class Task11Test {
    public static void main(String[] args) {

    }
    @Test
    void uiTest() {
        // step 1: click
        new RadioPageBO().getIndex().verifyRadioButton()
                // step 2: click "impressive" radio
                .verifyRadioSelected()
                // step 3: validate "impressive" text is being shown
                .verifyTextShown();

    }

    @AfterClass
    void tearDown() {
        // Close the browser
        if (getDriver() != null) {
            getDriver().quit();
        }
    }
}
