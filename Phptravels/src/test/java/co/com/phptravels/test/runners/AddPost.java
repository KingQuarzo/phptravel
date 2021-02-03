package co.com.phptravels.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/add_post.feature",
        glue = "co.com.phptravels.test.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class AddPost {
}
