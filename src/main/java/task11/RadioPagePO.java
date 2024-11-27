package task11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static task11.DriverPool.getDriver;

public class RadioPagePO {
    public WebElement getRadioPage() {
        WebElement labelForYesRadio = getDriver().findElement(By.cssSelector("label[for='yesRadio']"));
        WebElement yesRadioButton = getDriver().findElement(By.id("yesRadio"));
        labelForYesRadio.click();

        return yesRadioButton;
    }

    public WebElement getImpressiveRadio() {
        WebElement labelForImpressiveRadio = getDriver().findElement(By.cssSelector("label[for='impressiveRadio']"));
        WebElement impressiveRadio = getDriver().findElement(By.id("impressiveRadio"));
        labelForImpressiveRadio.click();

        return impressiveRadio;
    }

    public WebElement getImpressiveText() {
        return getDriver().findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/p/span"));
    }
}
