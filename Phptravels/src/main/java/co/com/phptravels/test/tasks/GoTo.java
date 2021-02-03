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

    public static Posts post(){
        return Tasks.instrumented(Posts.class);
    }

}
