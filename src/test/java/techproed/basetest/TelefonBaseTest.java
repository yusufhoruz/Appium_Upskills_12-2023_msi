package techproed.basetest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import techproed.utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class TelefonBaseTest extends ReusableMethods {
    protected AndroidDriver driver;
    @BeforeClass
    public void setup() throws MalformedURLException {

// com.android.dialer/com.android.dialer.main.impl.MainActivity
        UiAutomator2Options options = new UiAutomator2Options()
                .setAppPackage("com.android.dialer")
                .setAppActivity("com.android.dialer.main.impl.MainActivity")
                .setUdid("emulator-5554");

        URL url = new URL("http://0.0.0.0:4723");

         driver = new AndroidDriver(url, options);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void afterClass() {
    //    driver.quit();
    }
}
