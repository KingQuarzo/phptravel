package co.com.phptravels.test.tasks;

import co.com.phptravels.test.models.Category;
import net.serenitybdd.screenplay.Tasks;

public class Create {

    private Create() {
    }

    public static co.com.phptravels.test.tasks.Category category(Category categories) {
        return Tasks.instrumented(co.com.phptravels.test.tasks.Category.class, categories);
    }

    public static Post post(co.com.phptravels.test.models.Post post) {
        return Tasks.instrumented(Post.class, post);
    }
}
