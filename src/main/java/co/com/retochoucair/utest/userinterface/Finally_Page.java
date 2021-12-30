package co.com.retochoucair.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Finally_Page {

    public static final Target Text_Welcome = Target.the("sample confirmation text")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/div/ui-view/div/div/div/div[1]/div/h1"));
}
