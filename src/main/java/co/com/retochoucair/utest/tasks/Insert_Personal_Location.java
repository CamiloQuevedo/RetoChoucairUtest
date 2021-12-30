package co.com.retochoucair.utest.tasks;

import co.com.retochoucair.utest.model.Utest_Data;
import co.com.retochoucair.utest.userinterface.Location_Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static org.openqa.selenium.Keys.*;

public class Insert_Personal_Location implements Task {

    private List<Utest_Data> data;

    public Insert_Personal_Location(List<Utest_Data> data) {
        this.data = data;
    }

    public static Insert_Personal_Location thePage(List<Utest_Data> data) {
        return Tasks.instrumented(Insert_Personal_Location.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrCity()).into(Location_Page.CITY),
                Hit.the(ARROW_DOWN).into(Location_Page.CITY),
                Hit.the(ENTER).into(Location_Page.CITY),
                Enter.theValue(data.get(0).getStrPostalCode()).into(Location_Page.POSTAL_CODE),
                Click.on(Location_Page.BUTTON_DEVICES)
                );

    }
}
