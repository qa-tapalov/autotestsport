import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Native extends BaseClass {

    @Test
    public void splash()  {

        for (int i = 0; i < 6; i++){
            WebDriverWait wait = new WebDriverWait(driver, 5);
            MobileElement button_next = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/btnOnward")));
            MobileElement title = driver.findElementById("ru.sportmaster.app:id/title");
            MobileElement title_description = driver.findElementById("ru.sportmaster.app:id/description");
            System.out.println("Отображение экрана: " + title.getText());
            System.out.println("Описание: " + title_description.getText());
            System.out.println();
            button_next.click();

        }
    }



    @Test
    public void test_helps() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        MobileElement close = driver.findElementById("ru.sportmaster.app:id/btnClose");
        close.click();
        MobileElement catalog = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/ivCatalog")));
        catalog.click();


        MobileElement close_help_catalog = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/close")));
        MobileElement help_catalog = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.TextView[2]");
        if (help_catalog.getText().equals("Чтобы найти нужный вам товар, сделайте фото или выберите изображение из галереи.")){
            System.out.println("Название подсказки в каталоге корректно: " + help_catalog.getText());
            close_help_catalog.click();
        }
        else {
        System.out.println("Название подсказки в каталоге некорректно: "+ help_catalog.getText());
        close_help_catalog.click();}


        MobileElement category = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.View/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.View/android.widget.RelativeLayout[1]/android.widget.TextView")));
        category.click();

        MobileElement subCategory = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.View/android.widget.RelativeLayout[1]/android.widget.TextView")));
        subCategory.click();
        MobileElement items =  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.View/android.widget.RelativeLayout[1]/android.widget.TextView");
        items.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.View/android.view.View/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1]")));
        MobileElement item =  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.View/android.view.View/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView[1]");
        item.click();

        MobileElement close_help_item = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/close")));
        MobileElement help_item = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.TextView[1]"));
        if ( help_item.getText().equals("Теперь можно поделиться с друзьями")){
            System.out.println("Название подсказки в карточке товара корректно: " + help_item.getText());
            close_help_item.click();
        }
        else { System.out.println("Название подсказки в карточке товара не корректно: " + help_item.getText());
        close_help_item.click();}

        AndroidTouchAction action = new AndroidTouchAction(driver);
        action.press(PointOption.point(726, 1400)).moveTo(PointOption.point(726,700)).release().perform();


        MobileElement size = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.view.View[1]/android.widget.TextView[1]");
        size.click();
        MobileElement buy = driver.findElementById("ru.sportmaster.app:id/buy");
        buy.click();


        MobileElement basketItemCount = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/basketItemCount")));

        MobileElement basketIcon = driver.findElementById("ru.sportmaster.app:id/ivCart");
        basketIcon.click();

        MobileElement close_help_basket = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/close")));
        MobileElement help_basket = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.TextView");
        if (help_basket.getText().equals("Для удаления позиции сдвиньте строку влево или нажимайте на знак минус, пока количество не уменьшится до 0.")) {
            System.out.println("Название подсказки в корзине корректно: " + help_basket.getText());
            close_help_basket.click();
        }
        else {
            System.out.println("Название подсказки в корзине не корректно: " + help_basket.getText());
            close_help_basket.click();

        }



//




    }
}