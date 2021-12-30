package co.com.retochoucair.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Personal_information_Page {

    public static final Target NAME = Target.the("button that show us the form to name")
            .located(By.id("firstName"));

    public static final Target LAST_NAME = Target.the("button that show us the form to last name")
            .located(By.id("lastName"));

    public static final Target E_MAIL = Target.the("button that show us the form to email")
            .located(By.id("email"));

    public static final Target BIRTH_MONTH = Target.the("button that show us the form to birth month")
            .located(By.id("birthMonth"));

    public static final Target BIRTHDAY = Target.the("button that show us the form to birthday")
            .located(By.id("birthDay"));

    public static final Target BIRTH_YEAR = Target.the("button that show us the form to birth year")
            .located(By.id("birthYear"));

    public static final Target BUTTON_NEXT = Target.the("button that directs to the next location")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
