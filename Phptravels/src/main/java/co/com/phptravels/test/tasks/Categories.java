package co.com.phptravels.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.phptravels.test.userinterfaces.Menu.CATEGORY;
import static co.com.phptravels.test.userinterfaces.Menu.LST_BLOG;

public class Categories implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LST_BLOG),
                Click.on(CATEGORY)
        );
    }

}
