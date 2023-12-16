package techproed.day12;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

import java.util.Set;

public class C26_HibritUygulamaTesti extends ApiDemosBaseTest {
    @Test
    public void testHibrit() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        bekle(2);
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));
        bekle(2);
        driver.findElement(AppiumBy.accessibilityId("WebView")).click();
        bekle(5); // bu bekle methodunu koymazsak dogru context bilgilerini vermeyebilir.

        // driver.getContextHandles() ile sayfanin context bilgilerini set olarak aldik
        // aslinda asagidaki koalara igtiyacimiz yok, sadece nasil context alindigini görmek icin yazdik,  biz contexti inspectorden de alabiliriz
//        Set<String> contextHandles = driver.getContextHandles();
//
//        for (String contextName:contextHandles){
//            System.out.println(contextName);
//        }

        /*
        Test calistirdigimizda eger  2chromedriver bulunamadi hatasi alirsak, serveri asagidaki gibi gibi calistirip
        testi tekrar calistiririz. Böylece  Chromedriver bilgisayarimiza otomatik olarak yuklenir

        'appium --allow-insecure chromedriver_autodownload'
        komutu ile chromedriver bilgisayarimiza otomatik olarak yuklenir
         */
        // driver.context() ile de istedigimiz context e gecis yapabiliriz
        driver.context("WEBVIEW_io.appium.android.apis");
        System.out.println("Url : "+ driver.getCurrentUrl());
        System.out.println(driver.findElement(By.tagName("h1")).getText());
        bekle(2);
        driver.pressKey(new KeyEvent(AndroidKey.BACK)); // telefondaki geri tusu olarak fonksiyon yapar
        driver.context("NATIVE_APP"); // bu kod ile native uygulamaya gecis yaptik bu adim zorunlu

        bekle(2);
        driver.findElement(AppiumBy.accessibilityId("Visibility")).click();

    }
}
