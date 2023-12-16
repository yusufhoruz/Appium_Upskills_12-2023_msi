package techproed.day05practice;

import io.appium.java_client.AppiumBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.basetest.GeneralStoreBaseTest;

public class P03_General_Store_Negative_Test extends GeneralStoreBaseTest {
    @Test
    public void generalStore_NegativeTest() {
        /*
        Uygulama: GeneralStore
        GeneralStore uygulamasına gir
        Menüden Angola seçeneğini seç
        Your Name kutusunu boş bırak
        Let’s Shop butonuna tıkla
        Hata mesajını doğrula (Toast Message)
         */
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();

      String toastmessage =  driver.findElement(AppiumBy.xpath("//android.widget.Toast")).getAttribute("name");

        Assert.assertEquals(toastmessage,"Please enter your name");
    }
}
