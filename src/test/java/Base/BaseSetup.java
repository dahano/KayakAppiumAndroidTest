package Base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

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
        //capabilities.setCapability("PlatformName", "Android");
        capabilities.setCapability("deviceName", "Samsung Sim");
        capabilities.setCapability("app", "/Users/ofirdahan/Desktop/Travel/kayak.apk");
        capabilities.setCapability("udid", "192.168.56.101:5555");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown()  {
        driver.closeApp();
    }

}
