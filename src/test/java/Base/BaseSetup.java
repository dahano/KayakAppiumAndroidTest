package Base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by ofirdahan on 5/12/17.
 */
public class BaseSetup {
    public AndroidDriver driver;

    @BeforeClass
    public void setUp() throws Exception{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("PlatformName", "Android");
        capabilities.setCapability("deviceName", "Samsung Sim");
        capabilities.setCapability("app","/Path/To/Your/File/*.apk");
        capabilities.setCapability("udid", "ID OF YOUR EMULATOR");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

}
