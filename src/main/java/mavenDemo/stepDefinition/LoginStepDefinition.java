package mavenDemo.stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.*;
import mavenDemo.testBase.TestBase;
import mavenDemo.testBase.*;
import mavenDemo.stepDefinition.*;

public class LoginStepDefinition extends TestBase {
	


	@Given("^Iam on the Login page URL \"([^\"]*)\"$")
	public void iam_on_the_Login_page_URL(String url) throws Throwable {
		driver.get(url);
		//comment
	}

	@And("^I click on the signIn button$")
	public void i_click_on_the_signIn_button() throws Throwable {
		driver.findElement(
				By.className("gmail-nav__nav-link gmail-nav__nav-link__sign-in"))
				.click();

	}

	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String email) throws Throwable {

		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys(email);
		

	}

	@When("^I click the next button$")
	public void i_click_the_next_button() throws Throwable {
		driver.findElement(By.className("RveJvd snByac")).click();
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String password) throws Throwable {

		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys(password);
		;
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I should see application HomePage$")
	public void i_should_see_application_HomePage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I should see text messages on HomePage$")
	public void i_should_see_text_messages_on_HomePage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

}
