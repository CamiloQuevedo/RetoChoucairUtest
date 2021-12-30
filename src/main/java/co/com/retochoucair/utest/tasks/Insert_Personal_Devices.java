package co.com.retochoucair.utest.tasks;

import co.com.retochoucair.utest.model.Utest_Data;
import co.com.retochoucair.utest.userinterface.Devices_Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

public class Insert_Personal_Devices implements Task {

    private List<Utest_Data> data;

    public Insert_Personal_Devices(List<Utest_Data> data) {
        this.data = data;
    }

    public static Insert_Personal_Devices thePage(List<Utest_Data> data) {
        return Tasks.instrumented(Insert_Personal_Devices.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(Devices_Page.CONT_COMPUTER),
                //SelectFromOptions.byVisibleText(data.get(0).getStrComputer()).from(Devices_Page.COMPUTER)
                Enter.theValue(data.get(0).getStrComputer()).into(Devices_Page.COMPUTER).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(Devices_Page.CONT_VERSION),
                Enter.theValue(data.get(0).getStrVersion()).into(Devices_Page.VERSION).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(Devices_Page.CONT_LANGUAGE),
                Enter.theValue(data.get(0).getStrLanguage()).into(Devices_Page.LANGUAGE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(Devices_Page.CONT_MOBILE),
                Enter.theValue(data.get(0).getStrMobile()).into(Devices_Page.MOBILE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(Devices_Page.CONT_MODEL),
                Enter.theValue(data.get(0).getStrModel()).into(Devices_Page.MODEL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(Devices_Page.CONT_SYSTEM),
                Enter.theValue(data.get(0).getStrSystem()).into(Devices_Page.SYSTEM).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(Devices_Page.BUTTON_DEVICES)
                );



    }
}
