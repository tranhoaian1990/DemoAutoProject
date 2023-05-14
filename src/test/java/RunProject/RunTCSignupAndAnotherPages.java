package RunProject;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/ProjectSignUp.feature", glue = {"StepsProject"})
public class RunTCSignupAndAnotherPages {

}
