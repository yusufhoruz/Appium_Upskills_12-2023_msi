package techproed.day03;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class C06_Element_degerlerini_cekme {
    @Test
    public void testElementDegerleriniCekme() throws MalformedURLException, InterruptedException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(appUrl);

        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver = new AndroidDriver(url, options);

        By accessibility = AppiumBy.accessibilityId("Accessibility");
        System.out.println(driver.findElement(accessibility).getText());
        System.out.println("Get Attribute(package attribute degeri) : "+driver.findElement(accessibility).getAttribute("package"));
        System.out.println("Get Attribute(checkable attribute degeri) : "+driver.findElement(accessibility).getAttribute("checkable"));

        System.out.println("is Selected"+driver.findElement(accessibility).isSelected());
        System.out.println("is Enabled"+driver.findElement(accessibility).isEnabled());
        System.out.println("is Displayed"+driver.findElement(accessibility).isDisplayed());

        System.out.println("Get Size  : "+driver.findElement(accessibility).getSize());
        System.out.println("Get Location  : "+driver.findElement(accessibility).getLocation());

    }
}
