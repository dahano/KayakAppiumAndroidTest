package Tests;

import Base.BaseSetup;
import Pages.SearchHotels;
import Pages.WelcomePage;
import org.testng.annotations.Test;

/**
 * Created by ofirdahan on 5/14/17.
 */
public class SearchForHotelsTest extends BaseSetup{

    @Test
    public void setCityLocation(){
        SearchHotels searchHotels = new SearchHotels();
        WelcomePage welcomePage = new WelcomePage();

        welcomePage.navigateWithoutLoggingIn(driver);
        searchHotels.setLocation(driver, "Santa Monica");

    }
}
