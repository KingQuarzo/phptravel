package co.com.phptravels.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ThePost implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
       return "Escritura".equals(actor.recall("new post"));
    }

    public static ThePost wasCreated() {
        return new ThePost();
    }

}
