package techproed.day08;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import techproed.basetest.KitapYurduBaseTest;

import java.util.List;

public class P06_KitapYurdu_ScrollSwipeGesture extends KitapYurduBaseTest {
    @Test
    public void testName() throws InterruptedException {
        /*
        Uygulama: Kitap Yurdu
        Kitap Yurdu uygulamasına gir
        İlgi Görenler bölümündeki 5. kitaba tıkla
        Kitap adı, Yazar adı ve Yayınevi adı bilgilerini yazdır
        Künye başlıklarını ve bilgilerini yazdır
         */

        WebElement swipeElement = driver.findElement(AppiumBy.id("com.mobisoft.kitapyurdu:id/viewListContainer"));
        swipeGesture(driver, swipeElement, "left", 0.80, 500);
        Thread.sleep(3000);

        WebElement kitapBes = driver.findElement(AppiumBy.xpath("(//*[@resource-id=\"com.mobisoft.kitapyurdu:id/imageViewProduct\"])[3]"));
        clickGesture(driver, kitapBes);

        List<WebElement> kitapBilgileri = driver.findElements(AppiumBy.xpath("//android.widget.ScrollView[@resource-id=\"com.mobisoft.kitapyurdu:id/productDetailScrollView\"]/android.view.ViewGroup/android.widget.TextView"));
        System.out.println("Kitap adı    : " + kitapBilgileri.get(0).getText());
        System.out.println("Yazar adı    : " + kitapBilgileri.get(1).getText());
        System.out.println("Yayınevi adı : " + kitapBilgileri.get(2).getText());

        System.out.println("\n---------------------------\n");
        WebElement scrollElement = driver.findElement(AppiumBy.id("com.mobisoft.kitapyurdu:id/productDetailScrollView"));
        scrollGesture(driver, scrollElement, "down", 2.1, 1000);
        Thread.sleep(5000);

        List<WebElement> kunyeBasliklari = driver.findElements(AppiumBy.id("com.mobisoft.kitapyurdu:id/textViewAttributeTitle"));
        List<WebElement> kunyeBilgileri = driver.findElements(AppiumBy.id("com.mobisoft.kitapyurdu:id/textViewAttributeName"));


        for (int i = 0; i <kunyeBasliklari.size() ; i++) {
            System.out.println(kunyeBasliklari.get(i).getText()+kunyeBilgileri.get(i).getText()+"\t");

        }
    }
}
