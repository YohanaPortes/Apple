package runner;

import org.junit.runner.RunWith;

import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import metodos.Metodos;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@test1",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty","html:target/cucumber-report.html"},
		snippets = SnippetType.CAMELCASE
		)		
		
public class ExecutaAcessorios extends Metodos{
	
	@Before
	public static void abrirNavegador() {
		abrirNavegador();
	}

}
