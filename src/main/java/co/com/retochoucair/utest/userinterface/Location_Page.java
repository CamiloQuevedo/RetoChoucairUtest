package co.com.retochoucair.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Location_Page {
    public static final Target CITY = Target.the("button that show us the form to city")
            .located(By.id("city"));

    public static final Target POSTAL_CODE = Target.the("button that show us the form to postal code")
            .located(By.id("zip"));

    public static final Target BUTTON_DEVICES = Target.the("button that directs to the next devices")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
