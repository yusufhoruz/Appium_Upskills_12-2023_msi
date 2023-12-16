package techproed.day13;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import techproed.basetest.ChromeBrowserBaseTest;

public class P09_MobilWebUygulama_KitapYurdu extends ChromeBrowserBaseTest {
    @Test
    public void testRegister() {
        //URL
        driver.get("https://www.kitapyurdu.com/");

        bekle(10);
        // cerez
        driver.findElement(By.id("cookiescript_accept")).click();
        //Giriş
        driver.findElement(By.xpath("//a[@href=\"index.php?route=account/account\"]")).click();
        // Üye Ol
        driver.findElement(By.partialLinkText("Ücretsiz Üye Ol")).click();
        // Ad Kutusu
        driver.findElement(By.id("firstname")).sendKeys("Ayşe");
        // Soyad Kutusu
        driver.findElement(By.id("lastname")).sendKeys("Ekinci");
        // Eposta Kutusu
        driver.findElement(By.id("email")).sendKeys("ayseekinci1@godzhildllla.com");
        // Şifre Kutusu
        driver.findElement(By.id("password")).sendKeys("12345678");
        // Şifre Tekrarı Kutusu
        driver.findElement(By.id("confirm")).sendKeys("12345678");

        //
        driver.hideKeyboard();
        // Kontrol Kutusu
        driver.findElement(By.id("form-check-input")).click();
        // Üye Ol Butonu
        driver.findElement(By.id("register-button")).click();
        driver.hideKeyboard();
    }

    /*
     @Test
    public void testRegister() {
        //URL
        driver.get("https://www.kitapyurdu.com/");
        //Çerez
        WebElement cookiescriptAccept = driver.findElement(By.id("cookiescript_accept"));
        visibleWait(driver, cookiescriptAccept, 15);
        cookiescriptAccept.click();
        //Giriş
        driver.findElement(By.xpath("//a[@href=\"index.php?route=account/account\"]")).click();
        // Üye Ol
        driver.findElement(By.partialLinkText("Ücretsiz Üye Ol")).click();
        // Ad Kutusu
        driver.findElement(By.id("firstname")).sendKeys("Ayşe");
        // Soyad Kutusu
        driver.findElement(By.id("lastname")).sendKeys("Ekinci");
        // Eposta Kutusu
        driver.findElement(By.id("email")).sendKeys("ayseekinci1@godzilla.com");
        // Şifre Kutusu
        driver.findElement(By.id("password")).sendKeys("12345678");
        // Şifre Tekrarı Kutusu
        driver.findElement(By.id("confirm")).sendKeys("12345678");
        driver.hideKeyboard();
        // Kontrol Kutusu
        driver.findElement(By.id("form-check-input")).click();
        // Üye Ol Butonu
        driver.executeScript("arguments[0].click();", driver.findElement(By.id("register-button")));
        // Doğrulama
        Assert.assertEquals(driver.findElement(By.xpath("//h1[text()='Hesabınız Oluşturuldu!']")).getText(), "Hesabınız Oluşturuldu!");
    }
     */
}
