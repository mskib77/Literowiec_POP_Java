package Utils;

import org.testng.Reporter;

import static java.lang.Thread.sleep;

public class TestUtils {
    public static void mySleep(int miliseconds) {
        try {
            sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Reporter.log(e.getMessage());
        }

    }
}
