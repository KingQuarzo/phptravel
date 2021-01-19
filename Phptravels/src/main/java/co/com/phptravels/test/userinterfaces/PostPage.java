package co.com.phptravels.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PostPage {

    public static final Target BTN_POST = Target.the("Option to create new post")
            .locatedBy("//*[@type='submit']");

    public static final Target LST_CATEGORY = Target.the("Option to create new post")
            .locatedBy("//*[@name='category']");

    public static final Target CATEGORY = Target.the("Option to create new post")
            .locatedBy("//*[@value='20' and text()=' Escritura ']");

    public static final Target LST_RELATED = Target.the("Option to create new post")
            .locatedBy("//*[@class='select2-input']");

    public static final Target RELATED = Target.the("Option to create new post")
            .locatedBy("//*[@value='17' and text()='Where to Eat in Rome During Holidays']");

    public static final Target TXT_TITLE = Target.the("Option to create new post")
            .locatedBy("//*[@class='form-control posttitle']");

    public static final Target TXT_PERMALINK = Target.the("Option to create new post")
            .locatedBy("//*[@class='form-control pull-right permalink']");

    public static final Target TXT_BODY = Target.the("Option to create new post")
            .locatedBy("(//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders'])[1]");

    public static final Target TXT_KEYWORDS = Target.the("Option to create new post")
            .locatedBy("(//*[@class='form-control'])[1]");

    public static final Target TXT_DESCRIPTION = Target.the("Option to create new post")
            .locatedBy("(//*[@class='form-control'])[2]");

    public static final Target BTN_SUBMIT = Target.the("Option to create new post")
            .locatedBy("//*[@type='submit']");


}
