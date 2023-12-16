package techproed.day02;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class HomeWork_LocateYontemleri {
    @Test
    public void AccessibilityId_Locate() throws MalformedURLException, InterruptedException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(appUrl)
                .setAvd("Pixel_7")
                .setAvdLaunchTimeout(Duration.ofMinutes(5));

        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver = new AndroidDriver(url, options);
        driver.findElement(AppiumBy.accessibilityId("Accessibility")).click();
        Thread.sleep(2);
        WebElement provider = driver.findElement(AppiumBy.accessibilityId("Accessibility Node Provider"));
        System.out.println("Accessibility Node Provider = " + provider.getText());

        WebElement querying = driver.findElement(AppiumBy.accessibilityId("Accessibility Node Querying"));
        System.out.println("Accessibility Node Querying = " + querying.getText());

        WebElement service = driver.findElement(AppiumBy.accessibilityId("Accessibility Service"));
        System.out.println("Accessibility Service = " + service.getText());

        WebElement customView = driver.findElement(AppiumBy.accessibilityId("Custom View"));
        System.out.println("customView = " + customView.getText());


    }

    @Test
    public void Id_Locate() throws MalformedURLException, InterruptedException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(appUrl)
                .setAvd("Pixel_7")
                .setAvdLaunchTimeout(Duration.ofMinutes(5));

        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver = new AndroidDriver(url, options);
        driver.findElement(AppiumBy.accessibilityId("Content")).click(); // Content butonuna tikladik
        Thread.sleep(2);
        WebElement assets = driver.findElements(AppiumBy.id("android:id/text1")).get(0);
        System.out.println("assets = " + assets.getText());

        WebElement clipboard = driver.findElements(AppiumBy.id("android:id/text1")).get(1);
        System.out.println("clipboard = " + clipboard.getText());

        WebElement packages = driver.findElements(AppiumBy.id("android:id/text1")).get(2);
        System.out.println("packages = " + packages.getText());

        WebElement provider = driver.findElements(AppiumBy.id("android:id/text1")).get(3);
        System.out.println("provider = " + provider.getText());

        WebElement resources = driver.findElements(AppiumBy.id("android:id/text1")).get(4);
        System.out.println("resources = " + resources.getText());

        WebElement storage = driver.findElements(AppiumBy.id("android:id/text1")).get(5);
        System.out.println("storage = " + storage.getText());


    }

    @Test
    public void ClassName_Locate() throws MalformedURLException, InterruptedException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(appUrl)
                .setAvd("Pixel_7")
                .setAvdLaunchTimeout(Duration.ofMinutes(5));

        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver = new AndroidDriver(url, options);
        driver.findElement(AppiumBy.accessibilityId("Media")).click(); // Media butonuna tikladik
        Thread.sleep(2);
        WebElement audioFx = driver.findElements(AppiumBy.className("android.widget.TextView")).get(1);
        System.out.println("audioFx = " + audioFx.getText());

        WebElement mediaPlayer = driver.findElements(AppiumBy.className("android.widget.TextView")).get(2);
        System.out.println("mediaPlayer = " + mediaPlayer.getText());

        WebElement videoView = driver.findElements(AppiumBy.className("android.widget.TextView")).get(3);
        System.out.println("videoView = " + videoView.getText());
    }

    @Test
    public void UiAutomator_Locate() throws MalformedURLException, InterruptedException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(appUrl)
                .setAvd("Pixel_7")
                .setAvdLaunchTimeout(Duration.ofMinutes(5));

        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver = new AndroidDriver(url, options);
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"NFC\")")).click(); // NFC butonuna tikladik
        Thread.sleep(4);


//        WebElement dispatch = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"ForegroundDispatch\")"));
//        System.out.println("dispatch = " + dispatch.getText());

        WebElement ndefPush = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"ForegroundDispatch\")"));
        System.out.println("ndefPush = " + ndefPush.getText());

        WebElement techFilter = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"TechFilter\")"));
        System.out.println("techFilter = " + techFilter.getText());
    }

    // appium driver uninstall uiautomator2
}