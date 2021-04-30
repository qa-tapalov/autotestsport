import io.appium.java_client.MobileElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Authorization extends BaseClass {

    @Test
    public void authorization() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        MobileElement close = driver.findElementById("ru.sportmaster.app:id/btnClose");
        close.click();
        MobileElement profile = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ru.sportmaster.app:id/ivAccount")));
        profile.click();

        MobileElement inputTlf =  driver.findElementById("ru.sportmaster.app:id/ePhone");
        inputTlf.sendKeys("+793725080");
        MobileElement button =  driver.findElementById("ru.sportmaster.app:id/tvLogin");
        button.click();



        Thread.sleep(20000);
        MobileElement inputCode =  driver.findElementById("ru.sportmaster.app:id/eCode");
        inputCode.sendKeys("5396");
        MobileElement button_go =  driver.findElementById("ru.sportmaster.app:id/tvLogin");
        button_go.click();


    }
}
