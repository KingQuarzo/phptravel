package co.com.phptravels.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Menu {

    public static final Target LST_BLOG = Target.the("List to select diferents options")
            .locatedBy("//*[@href='#Blog']");
    public static final Target CATEGORY = Target.the("Option to create category")
            .locatedBy("//*[@href='https://www.phptravels.net/admin/blog/category']");
    public static final Target POST = Target.the("Option to create post")
            .locatedBy("//*[@href='https://www.phptravels.net/admin/blog']");

    public Menu() {
    }
}
