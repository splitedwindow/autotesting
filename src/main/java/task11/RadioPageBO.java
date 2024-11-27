package task11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static task11.DriverPool.getDriver;

public class RadioPageBO {
    RadioPagePO radioPagePO;

    public RadioPageBO getIndex() {
        getDriver().get("https://demoqa.com/radio-button");
        radioPagePO = new RadioPagePO();
        return this;
    }

    public RadioPageBO verifyRadioButton() {
        Assert.assertTrue(radioPagePO.getRadioPage().isSelected());
        return this;
    }

    public RadioPageBO verifyRadioSelected() {
        Assert.assertTrue(radioPagePO.getImpressiveRadio().isSelected());
        return this;
    }

    public void verifyTextShown() {
        // idk how to do this

        Assert.assertEquals(radioPagePO.getImpressiveText().getText(), "Impressive", "The displayed message should match the expected text.");
    }
}
