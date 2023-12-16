package techproed.day02;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class C02_Capabilities {

    @Test
    public void testUiAutomator2Options() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                // .setUdid("c443c4f5")    // Çalıştıracağımız uygulamayı seçmek için
                .setApp("C:\\Users\\Sibi\\JavaProjects\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk")
                //   .setAppPackage("io.appium.android.apis")  // Çalıştıracağımız uygulamayı seçmek için
                //   .setAppActivity("io.appium.android.apis.ApiDemos")  // Çalıştıracağımız uygulamayı seçmek için
                .setAvd("Pixel_7")  // Kapalı emülatörü açmak için
                .setAvdLaunchTimeout(Duration.ofMinutes(4))   // Emülatörün acilmasinin beklenmesi icin belirlenen süre
                ;

        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver = new AndroidDriver(url,options);

    }



    @Test
    public void testUiAutomator2Optionss() throws MalformedURLException {
        String appUrl = System.getProperty("user.dir")
                + File.separator+"src"
                + File.separator+"test"
                + File.separator+"resources"
                + File.separator+"ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options()
                // .setUdid("c443c4f5")    // Çalıştıracağımız uygulamayı seçmek için
                .setApp(appUrl)
                //   .setAppPackage("io.appium.android.apis")  // Çalıştıracağımız uygulamayı seçmek için
                //   .setAppActivity("io.appium.android.apis.ApiDemos")  // Çalıştıracağımız uygulamayı seçmek için
                .setAvd("Pixel_7")  // Kapalı emülatörü açmak için
                .setAvdLaunchTimeout(Duration.ofMinutes(4))   // Emülatörün acilmasinin beklenmesi icin belirlenen süre
                ;

        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver = new AndroidDriver(url,options);

    }
}
