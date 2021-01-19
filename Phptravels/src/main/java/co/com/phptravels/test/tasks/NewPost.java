package co.com.phptravels.test.tasks;

import co.com.phptravels.test.models.Post;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.phptravels.test.userinterfaces.PostPage.*;

public class NewPost implements Task {

    private Post post;

    public NewPost(Post post) {
        this.post = post;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(

                Click.on(BTN_POST),
                Enter.theValue(post.getPosttitle()).into(TXT_TITLE),
                Enter.theValue(post.getPermalink()).into(TXT_PERMALINK),
                Enter.theValue(post.getKeywords()).into(TXT_KEYWORDS),
                Enter.theValue(post.getDescription()).into(TXT_DESCRIPTION),

                Click.on(LST_CATEGORY)
                //Enter.theValue(post.getBody()).into(TXT_BODY),

        );

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(
                Click.on(CATEGORY),
                Click.on(LST_RELATED),
                Click.on(RELATED),
                Click.on(BTN_SUBMIT));
    }
}
