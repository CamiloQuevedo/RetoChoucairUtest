package co.com.retochoucair.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class Utest_Page extends PageObject {

    public static final Target BUTTON_JOIN = Target.the("button that shows us the registration form")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

}



