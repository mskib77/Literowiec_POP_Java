package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SettingsActivity {
    private AndroidDriver<AndroidElement> driver;

    public SettingsActivity(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        System.out.println("Diagnostyka: konstruktor SettingsActivity(driver)");

    }
}
