package techproed.day07;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

public class C12_SwipeGesture extends ApiDemosBaseTest {
    @Test
    public void testSwipeGestureElement() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();


      WebElement element =  driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
      driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
              "elementId", ((RemoteWebElement) element).getId(),
              "direction","left",
              "percent", 1.0, // percent 0 ile 1 arasinda olmak zorunda
              "speed",500

      ));

    }

    @Test
    public void testSwipeGestureCoordinate() throws InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();

        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
                "left", 100, "top", 300, "width", 900, "height", 200,
                "direction", "left",
                "percent", 0.65,
                "speed", 500
        ));
        Thread.sleep(5000);

    }
}
