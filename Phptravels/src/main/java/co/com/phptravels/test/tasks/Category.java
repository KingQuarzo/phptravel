package co.com.phptravels.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.phptravels.test.userinterfaces.Categories.*;

public class Category implements Task {

    private co.com.phptravels.test.models.Category categories;

    public Category(co.com.phptravels.test.models.Category categories) {
        this.categories = categories;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_ADD, WebElementStateMatchers.isClickable()).forNoMoreThan(2).seconds(),
                Click.on(BTN_ADD),
                Enter.theValue(categories.getCategoryName()).into(TXT_CATEGORY_NAME),
                Enter.theValue(categories.getVietnamese()).into(TXT_VIETNAMESE),
                Enter.theValue(categories.getRussian()).into(TXT_RUSSIAN),
                Enter.theValue(categories.getArabic()).into(TXT_ARABIC),
                Enter.theValue(categories.getFarsi()).into(TXT_FARSI),
                Enter.theValue(categories.getTurkish()).into(TXT_TURKISH),
                Enter.theValue(categories.getFrench()).into(TXT_FRENCH),
                Enter.theValue(categories.getSpanish()).into(TXT_SPANISH),
                Enter.theValue(categories.getGerman()).into(TXT_GERMAN),
                Click.on(BTN_COMPLETE)
        );

    }
}
