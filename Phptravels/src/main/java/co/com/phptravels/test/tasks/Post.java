package co.com.phptravels.test.tasks;

import co.com.phptravels.test.interactions.Enable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.phptravels.test.userinterfaces.PostPage.*;

public class Post implements Task {

    private co.com.phptravels.test.models.Post post;

    public Post(co.com.phptravels.test.models.Post post) {
        this.post = post;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(

                WaitUntil.the(BTN_POST, WebElementStateMatchers.isClickable()).forNoMoreThan(2).seconds(),
                Click.on(BTN_POST),

                Enter.theValue(post.getPosttitle()).into(TXT_TITLE),
                Enter.theValue(post.getPermalink()).into(TXT_PERMALINK),

                WaitUntil.the(LST_CATEGORY, WebElementStateMatchers.isClickable()).forNoMoreThan(2).seconds(),
                Click.on(LST_CATEGORY),

                WaitUntil.the(CATEGORY, WebElementStateMatchers.isClickable()).forNoMoreThan(2).seconds(),
                Click.on(CATEGORY),

                WaitUntil.the(LST_RELATED, WebElementStateMatchers.isClickable()).forNoMoreThan(2).seconds(),
                Click.on(LST_RELATED),

                WaitUntil.the(RELATED, WebElementStateMatchers.isClickable()).forNoMoreThan(2).seconds(),
                Click.on(RELATED),

                Enable.frame(post.getBody()),

                Enter.theValue(post.getKeywords()).into(TXT_KEYWORDS),
                Enter.theValue(post.getDescription()).into(TXT_DESCRIPTION),

                WaitUntil.the(BTN_SUBMIT, WebElementStateMatchers.isClickable()).forNoMoreThan(2).seconds(),
                Click.on(BTN_SUBMIT));

        actor.remember("new post", Text.of(POST).viewedBy(actor).asString());
    }


}
