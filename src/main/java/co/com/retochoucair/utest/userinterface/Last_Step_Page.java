package co.com.retochoucair.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Last_Step_Page {

    public static final Target PASSWORD = Target.the("field to user password")
            .located(By.id("password"));

    public static final Target PASSWORD_CONFIRM = Target.the("field to confirm user password")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_PERMISSION1 = Target.the("Check box to permission 1")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target CHECK_PERMISSION2 = Target.the("Check box to permission 2")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECK_PERMISSION3 = Target.the("Check box to permission 3")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BUTTON_COMPLETE = Target.the("button that show us the form to password")
            .located(By.id("laddaBtn"));
}
