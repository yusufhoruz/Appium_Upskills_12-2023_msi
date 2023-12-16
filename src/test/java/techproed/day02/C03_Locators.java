package techproed.day02;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class C03_Locators extends ApiDemosBaseTest {

    @Test
    public void testLocators() throws MalformedURLException {


        // 1- accessibilityid
       WebElement element =  driver.findElement(AppiumBy.accessibilityId("Accessibility"));
        System.out.println("Accessibility id = " + element.getText());


        // 2- id

        element = driver.findElements(AppiumBy.id("android:id/text1")).get(1);
        System.out.println("element = " + element.getText());

        // 3- className
        element =driver.findElements(AppiumBy.className("android.widget.TextView")).get(2);
        System.out.println("element = " + element.getText());

        // androidUIAutomator
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Accessibility\")"));

        // xpath
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Accessibility\"]"));
        System.out.println("element = " + element.getText());

    }
}
