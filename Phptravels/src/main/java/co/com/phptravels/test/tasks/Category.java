package co.com.phptravels.test.tasks;

import co.com.phptravels.test.models.Categories;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.phptravels.test.userinterfaces.Categories.*;

public class Category implements Task {

    private Categories categories;
    public Category(Categories categories){
        this.categories = categories;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(
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
