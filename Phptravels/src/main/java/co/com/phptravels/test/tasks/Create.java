package co.com.phptravels.test.tasks;

import co.com.phptravels.test.models.Categories;
import co.com.phptravels.test.models.Post;
import net.serenitybdd.screenplay.Tasks;

public class Create {

    private Create() {
    }

    public static Category category(Categories categories) {
        return Tasks.instrumented(Category.class, categories);
    }

    public static NewPost post(Post post) {
        return Tasks.instrumented(NewPost.class, post);
    }
}
