package Pages;

import Base.BaseSetup;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

/**
 * Created by ofirdahan on 5/14/17.
 */
public class SearchHotels extends BaseSetup {

    public void setLocation(AndroidDriver driver, String cityNameOrPlace){
        WebElement locationField = driver.findElement(By.id("com.kayak.android:id/displayName"));

        if(locationField != null){
            locationField.click();
        }

        try{
            WebElement searchTextField = driver.findElement(By.id("com.kayak.android:id/smartySearchText"));
            searchTextField.sendKeys(cityNameOrPlace);

            WebElement selectFirstListItem = driver.findElement(By.xpath("//android.widget.LinearLayout[2][@index='1']"));
            selectFirstListItem.click();

            Assert.assertTrue(driver.findElement(By.id("com.kayak.android:id/displayName")).getAttribute("text").contains(cityNameOrPlace));

        }catch (NoSuchElementException nse){
            nse.printStackTrace();
        }

    }

    public void setDate(AndroidDriver driver){

    }

    public void setGuests(AndroidDriver driver){

    }
}
