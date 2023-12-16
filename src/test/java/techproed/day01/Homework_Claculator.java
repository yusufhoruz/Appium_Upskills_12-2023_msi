package techproed.day01;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Homework_Claculator {
    @Test // calculator
    public void testDesiredCapabilities() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","android");
        capabilities.setCapability("automationName","uiautomator2");
        capabilities.setCapability("udid","c443c4f5");
        capabilities.setCapability("app","C:\\Users\\Sibi\\JavaProjects\\Appium_Upskills\\src\\test\\resources\\ApiDemos-debug.apk");
        capabilities.setCapability("appPackage","com.google.android.calculator");
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator");

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url,capabilities);
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='7']")).click();
        driver.findElement(By.id("com.google.android.calculator:id/clr")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='7']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"artı\"]")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='7']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"eşittir\"]")).click();
        driver.findElement(By.id("com.google.android.calculator:id/clr")).click();

    }

    @Test // otto
    public void testDesiredCapabilities2() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","android");
        capabilities.setCapability("automationName","uiautomator2");
        capabilities.setCapability("udid","c443c4f5");
        capabilities.setCapability("appPackage","de.cellular.ottohybrid");
        capabilities.setCapability("appActivity","de.cellular.ottohybrid.MainActivity");

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url,capabilities);


    }

    @Test // emulator
    public void testDesiredCapabilities3() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","android");
        capabilities.setCapability("automationName","uiautomator2");
        capabilities.setCapability("udid","c443c4f5");
        capabilities.setCapability("appPackage","com.google.android.calculator");
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator");

        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url,capabilities);
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='7']")).click();
        driver.findElement(By.id("com.google.android.calculator:id/clr")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='7']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"plus\"]")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='7']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"equals\"]")).click();
        driver.findElement(By.id("com.google.android.calculator:id/clr")).click();


    }

    @Test
    public void testUiAutomator2Options() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                // .setUdid("c443c4f5")
                //  .setApp("C:\Users\Sibi\JavaProjects\Appium_Upskills\src\test\resources\ApiDemos-debug.apk")
                .setAppPackage("com.google.android.calculator")
                .setAppActivity("com.android.calculator2.Calculator");

        URL url = new URL("http://0.0.0.0:4723");

        AndroidDriver driver = new AndroidDriver(url,options);

    }
}
