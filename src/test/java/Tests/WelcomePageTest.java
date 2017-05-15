package Tests;

import Base.BaseSetup;
import Pages.WelcomePage;
import org.testng.annotations.Test;

/**
 * Created by ofirdahan on 5/12/17.
 */

public class WelcomePageTest extends BaseSetup{

    @Test
    public void navigateWithoutLoggingInTest(){
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.navigateWithoutLoggingIn(driver);
    }

    @Test
    public void facebookButtonReturnsFacebookDialog(){
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.loginWithFacebook(driver);
    }

    @Test
    public void emailButtonReturnsSignUpDialog(){
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.loginWithEmail(driver);
    }


}
