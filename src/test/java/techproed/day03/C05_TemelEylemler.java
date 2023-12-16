package techproed.day03;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import io.appium.java_client.android.nativekey.KeyEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class C05_TemelEylemler {
    @Test
    public void testTemelEylemler() throws MalformedURLException, InterruptedException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(appUrl);

        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver = new AndroidDriver(url, options);

        By app = AppiumBy.accessibilityId("App");
        By activity = AppiumBy.accessibilityId("Activity");
        By customTitle = AppiumBy.accessibilityId("Custom Title");
        By leftTextBox = AppiumBy.id("io.appium.android.apis:id/left_text_edit");
        By rightTextBox = AppiumBy.id("io.appium.android.apis:id/right_text_edit");
        By changeLeft = AppiumBy.accessibilityId("Change Left");
        By changeRight = AppiumBy.accessibilityId("Change Right");


        driver.findElement(app).click();
        driver.findElement(activity).click();
        driver.findElement(customTitle).click();

        driver.findElement(leftTextBox).clear();
        driver.findElement(leftTextBox).sendKeys("Appium is enjoy");
        driver.findElement(changeLeft).click();

        driver.findElement(rightTextBox).clear();
        Thread.sleep(2000);
        driver.setClipboardText("Kopyalanmis Text, Ctrl+c gibi calisir");
        driver.findElement(rightTextBox).sendKeys(driver.getClipboardText());
        Thread.sleep(2000);
      //  driver.findElement(rightTextBox).sendKeys("Appium is bad");
        driver.findElement(changeRight).click();


        KeyEvent back = new KeyEvent(AndroidKey.BACK);
        KeyEvent home = new KeyEvent(AndroidKey.HOME);

        driver.pressKey(back);
        Thread.sleep(2000);
        driver.pressKey(home);

    }
}
