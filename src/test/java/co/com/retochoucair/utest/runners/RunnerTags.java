package co.com.retochoucair.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/User_register.feature",
        tags = "@stories",
        glue = "co.com.retochoucair.utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags{

}