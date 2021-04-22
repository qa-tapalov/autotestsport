import io.appium.java_client.MobileElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.junit.Assert.*;

public class Native extends BaseClass {

    @Test
    public void test() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        MobileElement el1 = (MobileElement) driver.findElementById("ru.sportmaster.app:id/btnClose");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("ru.sportmaster.app:id/ivCatalog");
        el2.click();


        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/close")));
        MobileElement help_catalog = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.TextView[2]");
        if (help_catalog.getText().equals(" найти нужный вам товар, сделайте фото или выберите изображение из галереи.")){
            System.out.println("Название подсказки в каталоге корректно");
            MobileElement el3 = (MobileElement) driver.findElementById("ru.sportmaster.app:id/close");
            el3.click();
        }
        else System.out.println("Название подсказки в каталоге некорректно");
        MobileElement el3 = (MobileElement) driver.findElementById("ru.sportmaster.app:id/close");
        el3.click();


        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.View/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.View/android.widget.RelativeLayout[1]/android.widget.TextView");
        el4.click();

        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.View/android.widget.RelativeLayout[1]/android.widget.TextView");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.View/android.widget.RelativeLayout[1]/android.widget.TextView");
        el6.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.View/android.view.View/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1]")));
        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.View/android.view.View/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1]");
        el7.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/close")));
        MobileElement el8 = (MobileElement) driver.findElementById("ru.sportmaster.app:id/close");
        el8.click();
        driver.quit();
    }
}