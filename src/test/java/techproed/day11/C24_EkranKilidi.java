package techproed.day11;

import org.testng.annotations.Test;
import techproed.basetest.DeviceBaseTest;

import java.time.Duration;

public class C24_EkranKilidi extends DeviceBaseTest {
    @Test
    public void testLockDevices() {
        driver.lockDevice(Duration.ofSeconds(5));
        bekle(2);
    }

    @Test
    public void testUnlockockDevices() {
        driver.lockDevice();
        bekle(5);
        driver.unlockDevice();
        bekle(3);
    }

    @Test
    public void testIsDeviceLock() {
        System.out.println(driver.isDeviceLocked());
        driver.lockDevice();
        bekle(4);
        System.out.println(driver.isDeviceLocked());

        driver.unlockDevice();
        bekle(3);
        System.out.println(driver.isDeviceLocked());
    }




}
