package mavenDemo.testRunner;

import org.testng.annotations.*;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = "src/test/resources/features", glue = { 
		"mavenDemo/stepDefinition" }, plugin = {
		"pretty", "html:target/cucumber-reports/cucumber-pretty",
		"json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/rerun.txt" })
public class TestRunner {
	private TestNGCucumberRunner testNgCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNgCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "runs cucumber features", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNgCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNgCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void testDownClass() {
		testNgCucumberRunner.finish();
	}

}
