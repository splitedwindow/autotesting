package task10;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task10Test {
    WebDriver driver;
    public static void main(String[] args) {

    }
    @Test
    void uiTest() {
        driver.get("https://demoqa.com/radio-button");
        System.out.println(driver.getCurrentUrl());

        // step 1: click

        WebElement labelForYesRadio = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        WebElement yesRadioButton = driver.findElement(By.id("yesRadio"));
        if (!labelForYesRadio.isSelected()) {
            labelForYesRadio.click();
            Assert.assertTrue(yesRadioButton.isSelected());
        }


        // step 2: click "impressive" radio

        WebElement labelForImpressiveRadio = driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
        WebElement impressiveRadio = driver.findElement(By.id("impressiveRadio"));

        if(!labelForImpressiveRadio.isSelected()) {
            labelForImpressiveRadio.click();

        }
        Assert.assertTrue(impressiveRadio.isSelected());

        // step 3: validate "impressive" text is being shown
        WebElement impressiveText = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/p/span"));
        Assert.assertEquals(impressiveText.getText(), "Impressive", "The displayed message should match the expected text.");

    }

    @BeforeTest
    void setup() {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
    }

    @AfterClass
    void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
