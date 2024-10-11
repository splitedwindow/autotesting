package task11;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task11 {
    WebDriver driver;
    public static void main(String[] args) {

    }
    @Test
    void uiTest() {
        driver.get("https://demoqa.com/radio-button");
        System.out.println(driver.getCurrentUrl());

        // step 1: do something
        WebElement yesRadio = driver.findElement(By.id("yesRadio"));

        // step 2: do something 2
        WebElement impressiveRadio = driver.findElement(By.id("impressiveRadio"));

        // step 3: do something 3
        WebElement noRadio = driver.findElement(By.id("noRadio"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));


        Assert.assertTrue(yesRadio.isDisplayed());

    }

    @BeforeTest
    void setup() {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();


    }
}
