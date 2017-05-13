package Tests;

import Base.BaseSetup;
import Pages.WelcomePageObjects;
import org.testng.annotations.Test;

/**
 * Created by ofirdahan on 5/12/17.
 */

public class WelcomePageTest extends BaseSetup{

    @Test
    public void navigateWithoutLoggingInTest(){
        WelcomePageObjects welcomePageObjects = new WelcomePageObjects();
        welcomePageObjects.navigateWithoutLoggingIn(driver);
    }

    @Test
    public void facebookButtonReturnsFacebookDialog(){
        WelcomePageObjects welcomePageObjects = new WelcomePageObjects();
        welcomePageObjects.loginWithFacebook(driver);
    }


}
