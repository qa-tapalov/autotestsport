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