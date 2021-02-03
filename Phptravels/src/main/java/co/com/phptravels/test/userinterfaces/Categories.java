package co.com.phptravels.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Categories {

    public static final Target BTN_ADD = Target.the("Button to create a new category")
            .locatedBy("//*[@data-target='#ADD_BLOG_CAT']");

    public static final Target TXT_CATEGORY_NAME = Target.the("Button to create a new category")
            .locatedBy("(//*[@name='name'])[1]");
    public static final Target TXT_VIETNAMESE = Target.the("Button to create a new category")
            .locatedBy("(//*[@name='translated[vi][name]'])[1]");
    public static final Target TXT_RUSSIAN = Target.the("Button to create a new category")
            .locatedBy("(//*[@name='translated[ru][name]'])[1]");
    public static final Target TXT_ARABIC = Target.the("Button to create a new category")
            .locatedBy("(//*[@name='translated[ar][name]'])[1]");
    public static final Target TXT_FARSI = Target.the("Button to create a new category")
            .locatedBy("(//*[@name='translated[fa][name]'])[1]");
    public static final Target TXT_TURKISH = Target.the("Button to create a new category")
            .locatedBy("(//*[@name='translated[tr][name]'])[1]");
    public static final Target TXT_FRENCH = Target.the("Button to create a new category")
            .locatedBy("(//*[@name='translated[fr][name]'])[1]");
    public static final Target TXT_SPANISH = Target.the("Button to create a new category")
            .locatedBy("(//*[@name='translated[es][name]'])[1]");
    public static final Target TXT_GERMAN = Target.the("Button to create a new category")
            .locatedBy("(//*[@name='translated[de][name]'])[1]");

    public static final Target BTN_COMPLETE = Target.the("Button to submit")
            .locatedBy("(//*[@class='btn btn-primary'])[1]");

    public static final Target BTN_SEARCH = Target.the("Button to search a category")
            .locatedBy("//*[@class='xcrud-search-toggle btn btn-default']");

    public static final Target TXT_SEARCH = Target.the("Texto to search a category")
            .locatedBy("(//*[@name='phrase'])[1]");

    public static final Target BTN_GO = Target.the("Texto to search a category")
            .locatedBy("//*[@class='xcrud-action btn btn-primary']");

    public static final Target RESULT = Target.the("Texto to search a category")
            .locatedBy("//*[@class='xcrud-current xcrud-num']//following::td[text()='Escritura'][1]");

}
