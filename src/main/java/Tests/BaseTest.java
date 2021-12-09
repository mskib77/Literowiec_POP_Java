package Tests;

import Pages.MainActivity;
import Pages.SettingsActivity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public AndroidDriver<AndroidElement> driver;
//    WebDriver driver;
    private DesiredCapabilities cap;

    protected MainActivity mainActivity;

    @BeforeMethod
    public void setUp() throws MalformedURLException, InterruptedException {
        System.out.println("wykonuję @BeforeMethod = setUp()");
        cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator");
        cap.setCapability("autoGrantPermissions","true");
        cap.setCapability("appPackage", "autyzmsoft.pl.literowiec");
        cap.setCapability("appActivity", "autyzmsoft.pl.literowiec.MainActivity");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), cap);

        mainActivity = new MainActivity(driver);

        dismissSplashScreen();
    }



    private void dismissSplashScreen() throws InterruptedException {
        System.out.println("wchodze......");
//        AndroidElement el = (AndroidElement) driver.findElementById("autyzmsoft.pl.literowiec:id/btn_OK");
//        WebElement el = driver.findElementById("autyzmsoft.pl.literowiec:id/btn_OK");
        WebElement el = driver.findElement(By.id("autyzmsoft.pl.literowiec:id/btn_OK"));
        el.click();
        System.out.println("wychodze<<<<");
    }
    
}
