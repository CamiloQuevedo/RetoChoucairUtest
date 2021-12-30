package co.com.retochoucair.utest.tasks;

import co.com.retochoucair.utest.model.Utest_Data;
import co.com.retochoucair.utest.userinterface.Devices_Page;
import co.com.retochoucair.utest.userinterface.Finally_Page;
import co.com.retochoucair.utest.userinterface.Last_Step_Page;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

public class Insert_Personal_Password implements Task {

    private List<Utest_Data> data;

    public Insert_Personal_Password(List<Utest_Data> data) {
        this.data = data;
    }

    public static Insert_Personal_Password thePage(List<Utest_Data> data) {
        return Tasks.instrumented(Insert_Personal_Password.class,data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrPassword()).into(Last_Step_Page.PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(Last_Step_Page.PASSWORD_CONFIRM),
                Click.on(Last_Step_Page.CHECK_PERMISSION1),
                Click.on(Last_Step_Page.CHECK_PERMISSION2),
                Click.on(Last_Step_Page.CHECK_PERMISSION3),
                Click.on(Last_Step_Page.BUTTON_COMPLETE),
                WaitUntil.the(Finally_Page.Text_Welcome,WebElementStateMatchers.isEnabled()).forNoMoreThan(120).seconds());
    }
}
