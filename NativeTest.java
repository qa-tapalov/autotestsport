import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;


public class NativeTest {



    @Test
    public void test() throws MalformedURLException, InterruptedException{

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "m2 note");
        capabilities.setCapability("appPackage", "ru.sportmaster.app");
        capabilities.setCapability("appActivity", "activity.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AppiumDriver driver = new AndroidDriver<>(url, capabilities);


        WebDriverWait wait = new WebDriverWait(driver, 10);
        System.out.println("Step 1. Launch app");

        MobileElement el1 = (MobileElement) driver.findElementById("ru.sportmaster.app:id/btnClose");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("ru.sportmaster.app:id/ivCatalog");
        el2.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/close")));


        MobileElement el3 = (MobileElement) driver.findElementById("ru.sportmaster.app:id/close");
        el3.click();

//        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.View/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.View/android.widget.RelativeLayout[1]/android.widget.TextView");
//        el4.click();
//        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.View/android.widget.RelativeLayout[1]/android.widget.TextView");
//        el5.click();
//        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.View/android.widget.RelativeLayout[1]/android.widget.TextView");
//        el6.click();
//        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.View/android.view.View/android.widget.RelativeLayout[1]/android.widget.RelativeLayout");
//        el7.click(); //добавить в корзину


    }


}