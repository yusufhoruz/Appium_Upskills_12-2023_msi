package techproed.day12;

import org.testng.annotations.Test;
import techproed.basetest.ChromeBrowserBaseTest;

public class C27_MobilwebUygulamaTesti extends ChromeBrowserBaseTest {
    @Test
    public void testBrowser () {
        driver.get("https://www.amazon.com");
        bekle(3);
    }
}
