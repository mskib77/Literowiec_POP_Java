package Pages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;

public class MainActivity {
//    private AndroidDriver<AndroidElement> driver;
    private WebDriver driver;

//    public MainActivity(AndroidDriver<AndroidElement> driver) {
    public MainActivity(WebDriver driver) {
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
    public WebElement imageView;
//    public MobileElement imageView;
//    public AndroidElement imageView;

    //-------------------------------------------------------------------

    public void gotToSettingsActivity() {
//        """Long touching on the image when the image is present"""
//        action = TouchAction(self.driver)
//        image = self.get_image()
//        action.long_press(image).perform().release()


        //2021.12.08 18.25 - to jest OK, dziala:

       AndroidDriver<AndroidElement> driver1 = new AndroidDriver<AndroidElement>();


        Actions actions = new Actions(driver1);
        actions.clickAndHold(imageView).perform();
        //2021.12.08 18.25 - to jest OK, patrz wyzej



//        TouchActions action = new TouchActions(driver);
//        action.longPress(imageView).perform();
//        action.perform();

//        TouchAction action = new TouchAction(driver);
//        action.press((PointOption) imageView).release();
        int x =1;

    }

    public void metoda2() {
        System.out.println("w metoda2");
    }

}
