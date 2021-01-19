package co.com.phptravels.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_EMAIL = Target.the("Test to insert email")
            .locatedBy("(//*[@placeholder='Email'])[1]");
    public static final Target TXT_PASSWORD = Target.the("Text to insert passsword")
            .locatedBy("//*[@name='password']");
    public static final Target BTN_LOGIN = Target.the("Button to login")
            .locatedBy("//*[@type='submit']");

    public LoginPage() {
    }
}
