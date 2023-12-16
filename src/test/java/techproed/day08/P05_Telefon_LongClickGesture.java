package techproed.day08;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import techproed.basetest.TelefonBaseTest;

public class P05_Telefon_LongClickGesture extends TelefonBaseTest {
    /*
    Uygulama: Telefon
    Telefon uygulamasına gir
    +90 530 486 1275 numarasını ara
    Mesajda, Arama başarısız oldu. metnini doğrula
    Tamam butonuna bas
     */
    @Test
    public void testTelefonTest() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("key pad")).click();

        By bir = AppiumBy.accessibilityId("1,");
        By iki = AppiumBy.accessibilityId("2,ABC");
        By uc = AppiumBy.accessibilityId("3,DEF");
        By dort = AppiumBy.accessibilityId("4,GHI");
        By bes = AppiumBy.accessibilityId("5,JKL");
        By alti = AppiumBy.accessibilityId("6,MNO");
        By yedi = AppiumBy.accessibilityId("7,PQRS");
        By sekiz = AppiumBy.accessibilityId("8,TUV");
        By dokuz = AppiumBy.accessibilityId("9,WXYZ");
        By sifir = AppiumBy.accessibilityId("0");
        By araButton = AppiumBy.accessibilityId("dial");

        longClickGesture(driver,driver.findElement(sifir),1000);
        driver.findElement(dokuz).click();
        driver.findElement(sifir).click();
        driver.findElement(bes).click();
        driver.findElement(uc).click();
        driver.findElement(sifir).click();
        driver.findElement(dort).click();
        driver.findElement(sekiz).click();
        driver.findElement(alti).click();
        driver.findElement(bir).click();
        driver.findElement(iki).click();
        driver.findElement(yedi).click();
        driver.findElement(bes).click();
        driver.findElement(araButton).click();

        Thread.sleep(5);


    }
}
