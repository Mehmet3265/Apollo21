package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "html:target/cucumber-report.html",
                "rerun:target.rerun.txt",
                "json:target/cucumber.json",
                "junit:target/junit/junit-report.xml",
                "me.jvt.cucumber.report.PrettyReports:target.cucumber"
        },
        features = "src/test/resources/features",
        glue = "step_definitions",
        dryRun = false,
        tags = "@BRT-796 or @BRT-798 or @BRT-799",
        publish = true
)
//@BRT-796 or @BRT-798 or @BRT-799

public class CukesRunner {

}





