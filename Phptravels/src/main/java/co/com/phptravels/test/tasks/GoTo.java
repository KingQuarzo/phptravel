package co.com.phptravels.test.tasks;

import net.serenitybdd.screenplay.Tasks;

public class GoTo {

    private GoTo(){
    }

    public static Categories categories(){
        return Tasks.instrumented(Categories.class);
    }
    public static NewCategory searchCategory(String category){
        return Tasks.instrumented(NewCategory.class, category);
    }

    public static Post post(){
        return Tasks.instrumented(Post.class);
    }
}
