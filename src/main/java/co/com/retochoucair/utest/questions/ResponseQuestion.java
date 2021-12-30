package co.com.retochoucair.utest.questions;

import co.com.retochoucair.utest.model.Utest_Data;
import co.com.retochoucair.utest.userinterface.Finally_Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class ResponseQuestion implements Question<Boolean> {

    private List<Utest_Data> data;

    public ResponseQuestion(List<Utest_Data> data) {
        this.data = data;
    }

    public static ResponseQuestion toData(List<Utest_Data> data) {
        return new ResponseQuestion(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String text_Complete= Text.of(Finally_Page.Text_Welcome).viewedBy(actor).asString();
        return data.get(0).getStrFinalText().equals(text_Complete);
    }
}
