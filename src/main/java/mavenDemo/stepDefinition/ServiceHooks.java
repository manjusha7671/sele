package mavenDemo.stepDefinition;

import mavenDemo.testBase.TestBase;
import cucumber.api.java.*;
//import cucumber.enums.*;

public class ServiceHooks {

	TestBase testBase;
	
	
	@Before
	public void initializeTest(){
		testBase = new TestBase();
		testBase.selectBrowser("chrome");
	}
	
	@After
	public void endTest(){
		testBase.driver.quit();
	}
}
