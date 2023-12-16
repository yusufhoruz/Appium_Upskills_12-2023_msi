package techproed.day05practice;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.basetest.MyDemoBaseTest;

import java.util.List;

public class HomeWork_MyDemo extends MyDemoBaseTest {
    /*
    Uygulama: MyDemoApp
    1. MyDemoApp uygulamasına gir
    2. Menüyü aç
    3. Login ol (bob@example.com, 10203040)
    4. Login butonuna tıkla
    5. İlk ürünü seç
    6. Ürün miktarını ikiye çıkar
    7. Add To Cart butonuna tıkla
    8. Sepete git
    9. Ürün miktarının Toplam miktar ile aynı olduğunu
    doğrla
    10. Proceed To Checkout butonuna tıkla
     */

    @Test
    public void MyDemoAppTest() {
        By menu = AppiumBy.accessibilityId("open menu");
        By login = AppiumBy.accessibilityId("menu item log in");
        By userName = AppiumBy.accessibilityId("Username input field");
        By password = AppiumBy.accessibilityId("Password input field");
        By loginButton = AppiumBy.accessibilityId("Login button");

List<WebElement> urunler = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().packageName(\"com.saucelabs.mydemoapp.rn\")"));
//urunler.get(9).click();

        By urunArtir = AppiumBy.accessibilityId("counter plus button");
        By addTocart = AppiumBy.accessibilityId("Add To Cart button");
        By sepet = AppiumBy.accessibilityId("cart badge");

        List<WebElement> urunAdedi = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().text(\"2\")"));

    }
}
