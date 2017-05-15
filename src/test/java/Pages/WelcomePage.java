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

public class WelcomePage extends BaseSetup{

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

    public void loginWithEmail(AndroidDriver driver){
        //ARRANGE
        WebElement loginWithEmailButton = driver.findElement(By.id("com.kayak.android:id/useEmailBtn"));

        //ACT
        loginWithEmailButton.click();

        //ASSERT
        try{
            WebElement signUpHeader = driver.findElement(By.id("com.kayak.android:id/loginSignupFragmentHeading"));
            Assert.assertTrue(signUpHeader.isEnabled());
        }catch (NoSuchElementException nse){
            nse.printStackTrace();
            System.out.println("Sign Up Header was not found " + nse);
        }
    }

    public void navigateWithoutLoggingIn(AndroidDriver driver){
        WebElement closeButton = driver.findElement(By.id("com.kayak.android:id/closeBtn"));
        closeButton.click();

        try {
            WebElement searchListingPage = driver.findElement(By.id("com.kayak.android:id/pager"));
            Assert.assertTrue(searchListingPage.isEnabled());
        } catch (NoSuchElementException nse){
            nse.printStackTrace();
            System.out.println("Close Button crashed " + nse);
        }
    }
}
