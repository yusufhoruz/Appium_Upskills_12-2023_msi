package techproed.day07;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import techproed.basetest.VodQABaseTest;

public class C14_PinchOpenAndCloseGesture extends VodQABaseTest {
    @Test
    public void testPinchOpenGestureElement() throws InterruptedException {
        // login butonuna tikladik
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"LOG IN\")")).click();

        // photo wiew / ping zoom menusunu actik
        driver.findElement(AppiumBy.accessibilityId("Ping & Zoom")).click();

        // ekrandaki fotografin locate ' ini aldik
        WebElement element = driver.findElement(AppiumBy.className("android.widget.ImageView"));

        // resime zoom yapmak icin 'pinchOpenGesture' methodunu kullandik
        driver.executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "percent", 0.95,  // resmi yuzde kac buyutecegimizi belirttik, 0 ile 1 arasinda olmali
                "speed", 1000  // zoom yaparken ki hizi belirttik
        ));
        Thread.sleep(3000);
    }

    @Test
    public void testPinchOpenGestureCoordinate() throws InterruptedException {
        driver.findElement(AppiumBy.className("android.widget.Button")).click();
        driver.findElement(AppiumBy.accessibilityId("Ping & Zoom")).click();
        Thread.sleep(1000);
        // yukardaki methoddan farkli olarak burada webelement yerine koordinatlar verdik,
        // koordinati alirken dikkat etmemiz gereken sey; baslangic koordinatini mutlaka resimden almamiz gerekiyor
        driver.executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
                // baslangic noktasi olarak resmin sol ust kosesinden left ve top koordinati aldik
                // ve sol alt kosedeki koordinatlarla arsindaki farklari width ve height degerleri karsisina yazdik
                "left", 170, "top", 940, "width", 730, "height", 500,
                "percent", 0.75,
                "speed", 500
        ));
        Thread.sleep(3000);
    }

    @Test
    public void testPinchOpenAndCloseGesturesElement() throws InterruptedException {
        driver.findElement(AppiumBy.className("android.widget.Button")).click();
        driver.findElement(AppiumBy.accessibilityId("Ping & Zoom")).click();
        WebElement element = driver.findElement(AppiumBy.className("android.widget.ImageView"));

        // resmi buyuttuk
        driver.executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "percent", 0.75,
                "speed", 500
        ));
        Thread.sleep(2000);

        // resmi kuculttuk
        driver.executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "percent", 0.75,
                "speed", 500
        ));
        Thread.sleep(5000);
    }

    @Test
    public void testPinchOpenAndCloseGesturesCoordinate() throws InterruptedException {
        driver.findElement(AppiumBy.className("android.widget.Button")).click();
        driver.findElement(AppiumBy.accessibilityId("Ping & Zoom")).click();
        Thread.sleep(1000);
        driver.executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
                "left", 165, "top", 950, "width", 700, "height", 500,
                "percent", 0.75,
                "speed", 500
        ));
        Thread.sleep(2000);
        driver.executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
                "left", 165, "top", 950, "width", 700, "height", 500,
                "percent", 0.75,
                "speed", 500
        ));
        Thread.sleep(5000);
    }
    @Test
    // bu methodda resmi sadece kucultmeyi denedik,ve basardik
    // ancak resmi orijinal boyutundan daha kucuk yaparsak elimizi birakinca otomatik olarak
    // normal boyutuna dondugu icin burada da eski boyutune geri geldigini gorduk, ama kodumuz calisti :)
    public void testPinchCloseGesturesCoordinate() throws InterruptedException {
        driver.findElement(AppiumBy.className("android.widget.Button")).click();
        driver.findElement(AppiumBy.accessibilityId("Ping & Zoom")).click();

        Thread.sleep(2000);
        driver.executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
                "left", 165, "top", 950, "width", 700, "height", 500,
                "percent", 0.75,
                "speed", 500
        ));
        Thread.sleep(5000);
    }
}
