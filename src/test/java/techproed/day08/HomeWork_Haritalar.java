package techproed.day08;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.basetest.MapsBaseTest;



public class HomeWork_Haritalar extends MapsBaseTest {
    /*
    Uygulama: Haritalar
    Haritalar uygulamasına gir
    Harita türü olarak Uydu seçeneğini seç
    Arama motorunda Rams Park Stadyumu kelimelerini arat
    Haritada Rams Park Stadyumu bölgesine zoom in ve zoom out işlemlerini yap
     */

    @Test
    public void testHaritalar_PinchOpenAndclose() {

        By satellite = AppiumBy.androidUIAutomator("new UiSelector().text(\"Satellite\")");
        By menu = AppiumBy.id("com.google.android.apps.maps:id/search_omnibox_menu_button");
        By searchBox = AppiumBy.androidUIAutomator("new UiSelector().text(\"Search here\")");
        bekle(15);
        clickGesture(driver,driver.findElement(searchBox));
        driver.findElement(searchBox).sendKeys("Rams Park Stadyumu");
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        bekle(5);
        driver.findElement(menu).click();
        driver.findElement(satellite).click();

        bekle(10);
        driver.executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
                "left", 110, "top", 500, "width", 690, "height", 730,
                "percent", 0.9,
                "speed", 250
        ));
        bekle(5);
        driver.executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
                "left", 110, "top", 500, "width", 690, "height", 730,
                "percent", 0.9,
                "speed", 250
        ));
        bekle(10);
    }
    @Test
    public void testPinchOpenAndClose() throws InterruptedException {

        WebElement katmanlar = driver.findElement(AppiumBy.accessibilityId("Layers"));
        clickGesture(driver, katmanlar);

        WebElement uydu = driver.findElement(AppiumBy.accessibilityId("Satellite"));
        clickGesture(driver, uydu);

        WebElement menuyuKapat = driver.findElement(AppiumBy.accessibilityId("Close menu"));
        clickGesture(driver, menuyuKapat);

        WebElement aramaMotoru = driver.findElement(AppiumBy.accessibilityId("Search here"));
        clickGesture(driver, aramaMotoru);

        WebElement metinArama = driver.findElement(AppiumBy.id("com.google.android.apps.maps:id/search_omnibox_edit_text"));
        metinArama.sendKeys("Rams Park Stadyumu");

        KeyEvent enter = new KeyEvent(AndroidKey.ENTER);
        driver.pressKey(enter);

        Thread.sleep(5000);

        driver.executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
                "left", 330,
                "top", 560,
                "width", 430,
                "height", 500,
                "percent", 0.75,
                "speed", 300
        ));

        Thread.sleep(2000);

        driver.executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
                "left", 330,
                "top", 560,
                "width", 430,
                "height", 500,
                "percent", 0.75,
                "speed", 300
        ));

        Thread.sleep(5000);

    }
}
