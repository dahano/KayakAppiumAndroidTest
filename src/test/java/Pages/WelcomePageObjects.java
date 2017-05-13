package Pages;

import Base.BaseSetup;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

/**
 * Created by ofirdahan on 5/12/17.
 */

public class WelcomePageObjects extends BaseSetup{

    public void loginWithFacebook(AndroidDriver driver){
        //ARRANGE
        WebElement loginWithFacebookButton = driver.findElement(By.id("com.kayak.android:id/facebookLogin"));

        //ACT
        loginWithFacebookButton.click();

        //ASSERT
        try{
            WebElement facebookDialogBanner = driver.findElementByAccessibilityId("facebook");
            Assert.assertTrue(facebookDialogBanner.isEnabled());
        }catch (NoSuchElementException nse){
            nse.printStackTrace();
        }
    }

    public void navigateWithoutLoggingIn(AndroidDriver driver){
        //ARRANGE
        WebElement closeButton = driver.findElementByXPath("//android.widget.ImageView[@index='2']");

        //ACT
        closeButton.click();

        //ASSERT
        try {
            WebElement searchListingPage = driver.findElement(By.id("com.kayak.android:id/pager"));
            Assert.assertTrue(searchListingPage.isEnabled());
        } catch (NoSuchElementException nse){
            nse.printStackTrace();
            System.out.println("Close Button crashed " + nse);
        }
    }
}
