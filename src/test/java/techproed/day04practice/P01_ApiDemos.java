package techproed.day04practice;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

public class P01_ApiDemos extends ApiDemosBaseTest {

    /*
    Uygulama: ApiDemos
API Demos uygulamasına gir
Preference seçeneğine tıkla
3. Preference dependencies seçeneğine tıkla
WiFi kontrol kutusunu seç
WiFi settings seçeneğine tıkla
Açılan ekrandaki başlığın WiFi settings olduğunu doğrula
Metin kutusuna adını yaz
Tamam butonuna tıkla
     */

    @Test
    public void testName() {
        By preferences = AppiumBy.accessibilityId("Preference");
        By preferenceDependencies = AppiumBy.accessibilityId("3. Preference dependencies");
        By checkbox = By.id("android:id/checkbox");
        By wifiSettings = AppiumBy.androidUIAutomator("new UiSelector().text(\"WiFi settings\")");
        By title = By.id("android:id/alertTitle");
        By textBox = AppiumBy.className("android.widget.EditText");
        By okButton = By.id("android:id/button1");

        driver.findElement(preferences).click();
        driver.findElement(preferenceDependencies).click();
        driver.findElement(checkbox).click();
        driver.findElement(wifiSettings).click();
        System.out.println("driver.findElement(title).getText() = " + driver.findElement(title).getText());
        Assert.assertEquals(driver.findElement(title).getText(),"WiFi settings");
        driver.findElement(textBox).sendKeys("Yusuf");
        driver.findElement(okButton).click();
 }
}
