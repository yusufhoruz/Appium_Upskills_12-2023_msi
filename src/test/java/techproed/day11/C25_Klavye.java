package techproed.day11;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.KeyInput;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

public class C25_Klavye extends ApiDemosBaseTest {
    @Test
    public void testIsKeyboardShown() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"TextFields\"))"));
        bekle(3);
        driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
        System.out.println(driver.isKeyboardShown());
        bekle(3);
        driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit")).click();
        System.out.println(driver.isKeyboardShown());
        bekle(3);
        driver.hideKeyboard();
        System.out.println(driver.isKeyboardShown());
        bekle(3);
    }

    @Test
    public void testPressKey() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"TextFields\"))"));
        bekle(3);
        driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
        driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit")).click();
        KeyEvent AHarfi = new KeyEvent(AndroidKey.Y);
        driver.pressKey(AHarfi);
        //  driver.pressKey(new KeyEvent(AndroidKey.A)); ustteki ile ayni islemi yapiyor
        KeyEvent back = new KeyEvent(AndroidKey.BACK);
        driver.pressKey(back);
        bekle(2);
        KeyEvent appSwitch = new KeyEvent(AndroidKey.APP_SWITCH);
        driver.pressKey(appSwitch);
        bekle(2);
        KeyEvent home = new KeyEvent(AndroidKey.HOME);
        driver.pressKey(home);
        bekle(2);


    }
}
