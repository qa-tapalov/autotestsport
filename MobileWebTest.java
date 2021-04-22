import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;

public class MobileWebTest {


    @Test
    public void test() throws MalformedURLException {
        URL serverUrl = new URL("http://127.0.0.1:4723/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"m2 note");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");

        System.out.println("Step 1. Create new driver");
        AppiumDriver driver = new AndroidDriver(serverUrl,capabilities);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        System.out.println("Step 2. Open website");
        driver.get("https://facebook.com");

        System.out.println("Step 3. Enter email");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='email']")));
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("+79372508072");

        System.out.println("Step 4. Enter password");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("boss5233");

        System.out.println("Step 5. Click Login button");
        driver.findElement(By.xpath("//button[@name='login']")).click();

//        System.out.println("Step 6. Check error message");
//        Thread.sleep(5000);
//        (driver.findElement(By.cssSelector("div[data-sigil='m_login_notice']")).getText().contains("The password you entered is incorrect"));

        System.out.println("Step 7. Nice cock");

    }










    }








