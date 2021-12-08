package Tests;

import Pages.MainActivity;
import Utils.TestUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class MainActivityTest extends BaseTest {

//    MainActivity mainActivity;
//
//    @BeforeTest
//    public void setUp() {
//        System.out.println("wykonuje setUp -> @BeforeTest");
//        mainActivity = new MainActivity(super.driver);
//    }


    @Test(priority = 1)
    public void dummy_test_1() {
        //wypisanie nazwy aktualnie wyjkonywanego testu:
        //String nazwa = new Throwable().getStackTrace()[0].getMethodName();
        //alternatywa dla w.w..:
        System.out.println("    Nazwa testu: "+new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName());

        mainActivity.bPomin.click();
        TestUtils.mySleep(1000);
            //wypisanie nazwy aktualnie wyjkonywanego testu:
            //String nazwa = new Throwable().getStackTrace()[0].getMethodName();
            //alternatywa dla w.w..:
            System.out.println("    Nazwa testu: "+new Object() {}
                    .getClass()
                    .getEnclosingMethod()
                    .getName());
        }



    @Test(priority = 0)
    public void goToSettings() {
        //wypisanie nazwy aktualnie wyjkonywanego testu:
        //String nazwa = new Throwable().getStackTrace()[0].getMethodName();
        //alternatywa dla w.w..:
        System.out.println("    Nazwa testu: "+new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName());

        mainActivity.gotToSettingsActivity();
        mainActivity.metoda2();


    }

}
