import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.net.MalformedURLException;
import java.net.URL;



public class BaseClass {
    WebDriverWait wait;


    static AppiumDriver<MobileElement> driver;

    @Before
    public void setup() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "m2 note");
//        capabilities.setCapability("autoAcceptAlerts", "true");
        capabilities.setCapability("appPackage", "ru.sportmaster.app");
        capabilities.setCapability("appActivity", "activity.MainActivity");
//        capabilities.setCapability("noReset","true");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver<>(url, capabilities);
         wait = new WebDriverWait(driver, 5);

        System.out.println("Приложение запущено");
        System.out.println();

    }



    @After
    public void tearDown()  {
        driver.quit();
        System.out.println();
        System.out.println("Приложение закрыто");
    }

    }