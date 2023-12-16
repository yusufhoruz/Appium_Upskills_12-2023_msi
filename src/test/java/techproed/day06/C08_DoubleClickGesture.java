package techproed.day06;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import techproed.basetest.CalculatorBaseTest;
public class C08_DoubleClickGesture extends CalculatorBaseTest {
    @Test
    public void testDoubleClickGestureElement() throws InterruptedException {
       driver.findElement(AppiumBy.accessibilityId("9")).click();
        driver.findElement(AppiumBy.accessibilityId("5")).click();
        driver.findElement(AppiumBy.accessibilityId("2")).click();

        WebElement element = driver.findElement(AppiumBy.id("com.google.android.calculator:id/formula"));
        driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"952\")"))).getId()
        ));
//
        Thread.sleep(3000);
    }
    @Test
    public void testDoubleClickGestureCoordinate() throws InterruptedException {

       driver.findElement(AppiumBy.accessibilityId("9"));
        driver.findElement(AppiumBy.accessibilityId("5")).click();
        driver.findElement(AppiumBy.accessibilityId("2")).click();
        driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of(
                "x", 800,
                "y", 400
        ));
     //   doubleClickGesture(driver, 800, 400);  // method ile de ayni islemi yapabiliriz
        Thread.sleep(1000);
    }
}
