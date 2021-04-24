import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;



public class BaseClass {

    static AppiumDriver<MobileElement> driver;

    @Before
    public void setup() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "m2 note");
        capabilities.setCapability("appPackage", "ru.sportmaster.app");
        capabilities.setCapability("appActivity", "activity.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver<>(url, capabilities);
        System.out.println("Приложение запущено");

    }
    static class  list_elements {

        static MobileElement button_next =  driver.findElementById("ru.sportmaster.app:id/btnOnward");
        static MobileElement title = driver.findElementById("ru.sportmaster.app:id/title");
        static MobileElement title_description = driver.findElementById("ru.sportmaster.app:id/description");

        static MobileElement close = driver.findElementById("ru.sportmaster.app:id/btnClose");
        static MobileElement catalog =  driver.findElementById("ru.sportmaster.app:id/ivCatalog");
        static MobileElement close_help_catalog = driver.findElementById("ru.sportmaster.app:id/close");
        static MobileElement help_catalog = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.TextView[2]");
        static MobileElement category =  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.View/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.View/android.widget.RelativeLayout[1]/android.widget.TextView");
        static MobileElement subCategory =  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.View/android.widget.RelativeLayout[1]/android.widget.TextView");
        static MobileElement items = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.View/android.widget.RelativeLayout[1]/android.widget.TextView");
        static MobileElement item = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.View/android.view.View/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1]");
        static MobileElement close_help_item = driver.findElementByXPath("ru.sportmaster.app:id/close");
        static MobileElement help_item = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.TextView[1]");
        static MobileElement size = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.view.View[1]/android.widget.TextView[1]");
        static MobileElement buy = driver.findElementById("ru.sportmaster.app:id/buy");
        static MobileElement basketItemCount =  driver.findElementById("ru.sportmaster.app:id/basketItemCount");
        static MobileElement basketIcon = driver.findElementById("ru.sportmaster.app:id/ivCart");
        static MobileElement close_help_basket =  driver.findElementById("ru.sportmaster.app:id/close");
        static MobileElement help_basket = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.TextView");



    }

    @After
    public void tearDown()  {
        driver.quit();
        System.out.println("Приложение закрыто");
    }

    }