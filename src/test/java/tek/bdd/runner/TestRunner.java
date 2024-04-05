package tek.bdd.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "tek.bdd.steps",
        tags = "@Smoke",
        dryRun = false,
       plugin = {
        "pretty",
              "html:target/html_report/report.html",
               "json:target/jsonReports/report.json"

      }
)
public class TestRunner {
}
