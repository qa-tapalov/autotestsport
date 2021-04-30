import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Native extends BaseClass {

    private final String[] xpathElements = {
            "ru.sportmaster.app:id/title",
            "ru.sportmaster.app:id/description",
            "ru.sportmaster.app:id/btnOnward"

    };

    @Test
    public void splash()  {

        for (int i = 0; i < 6; i++){
            MobileElement button_next = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id(xpathElements[2])));
            MobileElement title = driver.findElementById(xpathElements[0]);
            MobileElement titleDescription = driver.findElementById(xpathElements[1]);
            System.out.println("Отображение экрана: " + title.getText());
            System.out.println("Описание: " + titleDescription.getText());
            System.out.println("___");
            button_next.click();

        }
    }

    @Test
    public void checkNavigationBar(){

        MobileElement close = driver.findElementById("ru.sportmaster.app:id/btnClose");
        close.click();

//        MobileElement close_button = driver.findElement(By.id("ru.sportmaster.app:id/closeButton"));
//        close_button.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/image")));
        System.out.println("Открыто главное меню");

        MobileElement catalog =  driver.findElementById("ru.sportmaster.app:id/ivCatalog");
        catalog.click();
        MobileElement close_catalog =(MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/close")));
        System.out.println("Открыт каталог");
        close_catalog.click();

        MobileElement store =  driver.findElementById("ru.sportmaster.app:id/ivStores");
        store.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/eSearch")));
        System.out.println("Открыт список магазинов");

        MobileElement basket =  driver.findElementById("ru.sportmaster.app:id/ivCart");
        basket.click();
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.View/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.View/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[2]")));
        System.out.println("Открыта корзина");

        MobileElement profile =  driver.findElementById("ru.sportmaster.app:id/ivAccount");
        profile.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/ePhone")));
        System.out.println("Открыт экран профиля");



    }



    @Test
    public void test_helps() {

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


        MobileElement size = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.view.View[1]/android.widget.TextView[5]");
        size.click();
        MobileElement buy = driver.findElementById("ru.sportmaster.app:id/buy");
        buy.click();


        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/basketItemCount")));

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


    }

    @Test
    public void checkProductCard() {

        MobileElement close = driver.findElementById("ru.sportmaster.app:id/btnClose");
        close.click();
        MobileElement catalog = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/ivCatalog")));
        catalog.click();


        MobileElement close_help_catalog = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/close")));
        close_help_catalog.click();


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
        close_help_item.click();

        MobileElement name_item = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/name")));
        System.out.println("Название товара присутствует: " + name_item.getText());

        MobileElement article_item = driver.findElementById("ru.sportmaster.app:id/article");
        System.out.println("Артикул присутствует: " + article_item.getText());

        MobileElement image_item = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/androidx.viewpager.widget.ViewPager/android.widget.ImageView"));
        System.out.println("Фото товара присутствует");

        MobileElement size_table = driver.findElementById("ru.sportmaster.app:id/sizingInformation");
        System.out.println("Таблица размеров присутствует");

        MobileElement sizes = driver.findElementById("ru.sportmaster.app:id/rvSizes");
        System.out.println("Размерная сетка присутствует");

        AndroidTouchAction action = new AndroidTouchAction(driver);
        action.press(PointOption.point(726, 1400)).moveTo(PointOption.point(726,700)).release().perform();

        MobileElement tech_sticker = driver.findElementById("ru.sportmaster.app:id/image");
        System.out.println("Стикер технологии присутствует");

        MobileElement buy = driver.findElementById("ru.sportmaster.app:id/buy");
        System.out.println("Кнопка 'В корзину' присутствует");

        MobileElement addToCompare = driver.findElementById("ru.sportmaster.app:id/addToCompare");
        System.out.println("Кнопка добавить в сравнение присутствует");

        MobileElement favorite = driver.findElementById("ru.sportmaster.app:id/addToFavorite");
        System.out.println("Кнопка добавить в избранное присутствует");

        MobileElement review = driver.findElementById("ru.sportmaster.app:id/reviewView");
        System.out.println("Блок отзывов присутствует");

        MobileElement view = driver.findElementById("ru.sportmaster.app:id/faqView");
        System.out.println("Блок вопрос/ответ присутствует");

    }

    @Test
    public void addAndDeleteItemFromBasket() {

        MobileElement close = driver.findElementById("ru.sportmaster.app:id/btnClose");
        close.click();
        MobileElement catalog = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/ivCatalog")));
        catalog.click();


        MobileElement close_help_catalog = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/close")));
        MobileElement help_catalog = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.TextView[2]");
        close_help_catalog.click();

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
        close_help_item.click();
        MobileElement nameItem = driver.findElement(By.id("ru.sportmaster.app:id/name"));

        AndroidTouchAction action = new AndroidTouchAction(driver);
        action.press(PointOption.point(726, 1400)).moveTo(PointOption.point(726,700)).release().perform();


        MobileElement size = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.view.View[1]/android.widget.TextView[5]");
        size.click();
        MobileElement buy = driver.findElementById("ru.sportmaster.app:id/buy");
        buy.click();
        System.out.println("Товар '" + nameItem.getText() + "' добавлен в корзину");


        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/basketItemCount")));

        MobileElement basketIcon = driver.findElementById("ru.sportmaster.app:id/ivCart");
        basketIcon.click();

        MobileElement close_help_basket = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/close")));
        MobileElement help_basket = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.TextView");

        close_help_basket.click();

        MobileElement deleteItemFromBasket = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/deleteButton")));
        deleteItemFromBasket.click();
        System.out.println("Товар '" + nameItem.getText() + "' удалён из корзины");



    }






}