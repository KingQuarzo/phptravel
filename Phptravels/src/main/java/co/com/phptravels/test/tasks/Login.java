package co.com.phptravels.test.tasks;

import co.com.phptravels.test.utils.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.phptravels.test.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private User user = new User("admin@phptravels.com","demoadmin");

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(user.getEmail()).into(TXT_EMAIL),
                Enter.theValue(user.getPassword()).into(TXT_PASSWORD),
                Click.on(BTN_LOGIN)
        );

    }

    public static Login inPhptravels(){
        return instrumented(Login.class);
    }

}
