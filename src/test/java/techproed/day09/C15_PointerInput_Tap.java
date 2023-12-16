package techproed.day09;

import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

import java.time.Duration;
import java.util.Collections;

public class C15_PointerInput_Tap extends ApiDemosBaseTest {
    @Test
    public void testTap() {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        // fingeri buraya koyduk ve bu hareketi kac defa yapacagimiz bildirmek icin 1 yazdik
        Sequence sequence = new Sequence(finger, 1)
                // parmagimizi ekranda basacagimiz yere getirdik, ama henuz basmadik
                .addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 900, 1300))
                // parmagimizi ekranda istedigmiz yere bastik
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                // bastiktan sonraki bekleme süremizi belirttik
                .addAction(new Pause(finger, Duration.ofMillis(300)))
                // belirli bir süre bekledikten sonra da tekrar Up methodu ile parmagimizi kaldirdik
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        // en sonda da bu islemleri sahneye koyduk yani tanimladik
        // sirali adimlari topluca eyleme donusturduk
        driver.perform(Collections.singletonList(sequence));
        bekle(2);
    }
}
