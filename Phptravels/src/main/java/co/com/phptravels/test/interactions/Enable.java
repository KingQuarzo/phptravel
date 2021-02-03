package co.com.phptravels.test.interactions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static co.com.phptravels.test.userinterfaces.PostPage.TXT_BODY;

public class Enable implements Interaction {

    private String description;

    public Enable(String description) {
        this.description = description;
    }

    public static Enable frame(String description) {
        return new Enable(description);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        WaitUntil.the(TXT_BODY, WebElementStateMatchers.isEnabled()).forNoMoreThan(2).seconds();

        driver.switchTo().frame(0);
        driver.findElement(By.xpath(TXT_BODY.getCssOrXPathSelector())).sendKeys(description);
        driver.switchTo().defaultContent();

    }

}
