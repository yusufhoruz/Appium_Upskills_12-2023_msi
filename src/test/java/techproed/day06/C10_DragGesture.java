package techproed.day06;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

public class C10_DragGesture extends ApiDemosBaseTest {
    @Test
    public void testDragGestureElement() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
       WebElement element =  driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

        driver.executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "endX", 610,
                "endY", 550,
                "speed", 500
        ));
dragGesture(driver,element,610,550,250);
        Thread.sleep(2);

    }

    @Test
    public void testDragGestureCoordinate() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();


//        driver.executeScript("mobile: dragGesture", ImmutableMap.of(
//                "startX", 202,
//                "startY", 546,
//                "endX", 610,
//                "endY", 550,
//                "speed", 500
//        ));

        Thread.sleep(2);
dragGesture(driver,202,546,610,550,250);
    }
}
