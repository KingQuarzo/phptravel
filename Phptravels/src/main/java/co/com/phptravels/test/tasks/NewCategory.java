package co.com.phptravels.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.phptravels.test.userinterfaces.Categories.*;


public class NewCategory implements Task {

    private String category;
    public NewCategory(String category){
        this.category = category;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SEARCH),
                Enter.theValue(category).into(TXT_SEARCH),
                Click.on(BTN_GO)

        );
        System.out.println(Text.of(RESULT).viewedBy(actor).asString());
        actor.remember("result of category", Text.of(RESULT).viewedBy(actor).asString());

    }

}
