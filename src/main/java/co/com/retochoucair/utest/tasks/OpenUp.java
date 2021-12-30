package co.com.retochoucair.utest.tasks;

import co.com.retochoucair.utest.userinterface.Utest_Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;


public class OpenUp implements Task {

    private Utest_Page utestPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPage),
        Click.on(Utest_Page.BUTTON_JOIN));
    }
}
