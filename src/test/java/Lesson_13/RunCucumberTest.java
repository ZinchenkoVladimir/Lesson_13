package Lesson_13;

import Lesson_13.steps.Stepdefs;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        plugin = {"pretty"}
        features = "src/test/java/Lesson_13/feature",
        dryRun = false,
        strict = false,
        snippets = CucumberOptions.SnippetType.UNDERSCORE,
        monochrome = true,
        tags = "@Test_Scenario",
        glue={"src.test.java.Lesson_13.steps"}
)

public class RunCucumberTest extends AbstractTestNGCucumberTests {

//    private Stepdefs stepdefs = new Stepdefs();
//
//    public Stepdefs getStepdefs() {
//        return stepdefs;
//    }
}
