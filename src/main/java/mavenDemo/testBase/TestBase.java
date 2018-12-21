package mavenDemo.testBase;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

//	import cucumber.enums.Browsers;
//	import cucumber.enums.OS;

	public class TestBase {
		public  WebDriver driver;

		public void selectBrowser(String browser) {
//			if (System.getProperty("os.name").contains(
//					OS.WINDOW.name().toLowerCase())) {
				if (browser.equals("chrome")) {
					System.setProperty("webdriver.chrome.driver",
							System.getProperty("user.dir")
									+ "/src/test/resources/drivers/chromedriver.exe");

					this.driver = new ChromeDriver();
					
				}

			}
//		}
	

}
