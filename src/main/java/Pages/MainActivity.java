package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import io.appium.java_client.touch.LongPressOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class MainActivity {
    private AndroidDriver<AndroidElement> driver;
//    private WebDriver driver;

    public MainActivity(AndroidDriver<AndroidElement> driver) {
//    public MainActivity(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        System.out.println("Diagnostyka: konstruktor MainActivity(driver)");
    }

    //----------------------------------- Page Factory ------------------

    @AndroidFindBy
    (id = "autyzmsoft.pl.literowiec:id/bUpperLower")
    public MobileElement bUpperLower;

    @AndroidFindBy
    (id = "autyzmsoft.pl.literowiec:id/bPomin")
    public MobileElement bPomin;

    @AndroidFindBy
    (id = "autyzmsoft.pl.literowiec:id/imageView")
//    public WebElement imageView;
//    public MobileElement imageView;
    public AndroidElement imageView;

    //-------------------------------------------------------------------

    public void gotToSettingsActivity() {
//        """Long touching on the image when the image is present"""

        //2021.12.08 18.25 - to jest OK, dziala:
        //***************************
//        Actions actions = new Actions(driver);
//        actions.clickAndHold(imageView).perform();
        //***************************
        //2021.12.08 18.25 - to jest OK, patrz wyzej



        TouchAction t = new TouchAction(driver);
//      t.tap(tapOptions().withElement(element(imageView))).perform(); -> wzorzec z Udemy
        t.longPress(longPressOptions().withElement(element(imageView))).perform(); //<-na podstawie wzorca z Udemy

    }

    public void metoda2() {
        System.out.println("w metoda2");
    }

}
