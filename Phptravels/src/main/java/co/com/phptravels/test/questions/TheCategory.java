package co.com.phptravels.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheCategory implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return "Escritura".equals(actor.recall("new category"));
    }

    public static TheCategory wasCreated() {
        return new TheCategory();
    }

}
