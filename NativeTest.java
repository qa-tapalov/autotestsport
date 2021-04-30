import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;


public class NativeTest extends BaseClass {

    static class list_elements {

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

    private String xpathElements[] = {
            "ru.sportmaster.app:id/btnOnward",
            "ru.sportmaster.app:id/title",
            "ru.sportmaster.app:id/description"

    };

    @Test
    public void splash() {

        for (int i = 0; i < 6; i++) {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.visibilityOf(list_elements.button_next));
            System.out.println("Отображение экрана: " + list_elements.title.getText() + " - " + list_elements.title_description.getText());
            list_elements.button_next.click();

        }
    }



    @Test
    public void test_help() {
        WebDriverWait wait = new WebDriverWait(driver, 5);

        list_elements.close.click();
        wait.until(ExpectedConditions.visibilityOf(list_elements.catalog));
        list_elements.catalog.click();
        wait.until(ExpectedConditions.visibilityOf(list_elements.close_help_catalog));

        if (list_elements.help_catalog.getText().equals("Чтобы найти нужный вам товар, сделайте фото или выберите изображение из галереи.")){
            System.out.println("Название подсказки в каталоге корректно: " + list_elements.help_catalog.getText());
            list_elements.close_help_catalog.click();
        }
        else {
            System.out.println("Название подсказки в каталоге некорректно: "+ list_elements.help_catalog.getText());
            list_elements.close_help_catalog.click();}

        wait.until(ExpectedConditions.visibilityOf(list_elements.category));

        list_elements.category.click();

        wait.until(ExpectedConditions.visibilityOf(list_elements.subCategory));
        list_elements.subCategory.click();

        wait.until(ExpectedConditions.visibilityOf(list_elements.items));
        list_elements.items.click();

        wait.until(ExpectedConditions.visibilityOf(list_elements.item));
        list_elements.item.click();

        wait.until(ExpectedConditions.visibilityOf(list_elements.close_help_item));
        if ( list_elements.help_item.getText().equals("Теперь можно поделиться с друзьями")){
            System.out.println("Название подсказки в карточке товара корректно: " + list_elements.help_item.getText());
            list_elements.close_help_item.click();
        }
        else { System.out.println("Название подсказки в карточке товара не корректно: " + list_elements.help_item.getText());
            list_elements.close_help_item.click();}

        AndroidTouchAction action = new AndroidTouchAction(driver);
        action.press(PointOption.point(726, 1400)).moveTo(PointOption.point(726,700)).release().perform();


        list_elements.size.click();
        list_elements.buy.click();


        wait.until(ExpectedConditions.visibilityOf(list_elements.basketItemCount));
        list_elements.basketIcon.click();

        wait.until(ExpectedConditions.visibilityOf(list_elements.close_help_basket));
        if (list_elements.help_basket.getText().equals("Для удаления позиции сдвиньте строку влево или нажимайте на знак минус, пока количество не уменьшится до 0.")) {
            System.out.println("Название подсказки в корзине корректно: " + list_elements.help_basket.getText());
            list_elements.close_help_basket.click();
        }
        else {
            System.out.println("Название подсказки в корзине не корректно: " + list_elements.help_basket.getText());
            list_elements.close_help_basket.click();

        }









    }









    }