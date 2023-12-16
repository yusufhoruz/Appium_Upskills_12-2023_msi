package techproed.day07;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

public class C13_FlingeGesture extends ApiDemosBaseTest {
    @Test
    public void testFlingeGestureElement() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();


      driver.executeScript("mobile: flingGesture", ImmutableMap.of(
              "elementId", ((RemoteWebElement) driver.findElement(AppiumBy.id("android:id/list"))).getId(),
              "direction","down",
              "speed",500

      ));
Thread.sleep(3000);
    }

    @Test
    public void testFlingeGestureCoordinate() throws InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();

        driver.executeScript("mobile: flingGesture", ImmutableMap.of(
                "left", 100, "top", 300, "width", 900, "height", 200,
                "direction", "left",
                "speed", 500
        ));
        Thread.sleep(5000);

    }
}
