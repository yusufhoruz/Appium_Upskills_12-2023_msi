package techproed.day06;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;
public class C09_LongClickGesture extends ApiDemosBaseTest {
    @Test
    public void testLongClickGestureElement() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("App")).click();
        driver.findElement(AppiumBy.accessibilityId("Fragment")).click();
        driver.findElement(AppiumBy.accessibilityId("Context Menu")).click();
        WebElement longPressMe = driver.findElement(AppiumBy.accessibilityId("Long press me"));
//        driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
//                "elementId", ((RemoteWebElement) longPressMe).getId(),
//                "duration", 1000
//        ));
        longClickGesture(driver, longPressMe, 1000);
        Thread.sleep(5000);
    }
    @Test
    public void testLongClickGestureCooredinate() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("App")).click();
        driver.findElement(AppiumBy.accessibilityId("Fragment")).click();
        driver.findElement(AppiumBy.accessibilityId("Context Menu")).click();
//        driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
//                "x", 464,
//                "y", 500,
//                "duration", 1000
//        ));

        longClickGesture(driver, 464, 500, 1000);
        Thread.sleep(5000);
    }
}