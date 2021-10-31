import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty",
		snippets = SnippetType.CAMELCASE,
		dryRun = true //valida o teste antes de executar
		)
public class Runner {

}
