package co.com.retochoucair.utest.tasks;

import co.com.retochoucair.utest.model.Utest_Data;
import co.com.retochoucair.utest.userinterface.Personal_information_Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class Insert_Personal_Data implements Task {

    private List<Utest_Data> data;

    public Insert_Personal_Data(List<Utest_Data> data) {
        this.data = data;
    }


    public static Insert_Personal_Data thePage(List<Utest_Data> data) {

        return Tasks.instrumented(Insert_Personal_Data.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(data.get(0).getStrName()).into(Personal_information_Page.NAME),
                Enter.theValue(data.get(0).getStrLastName()).into(Personal_information_Page.LAST_NAME),
                Enter.theValue(data.get(0).getStrEmail()).into(Personal_information_Page.E_MAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthMonth()).from(Personal_information_Page.BIRTH_MONTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthDay()).from(Personal_information_Page.BIRTHDAY),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthYear()).from(Personal_information_Page.BIRTH_YEAR),
                Click.on(Personal_information_Page.BUTTON_NEXT));

    }
}
