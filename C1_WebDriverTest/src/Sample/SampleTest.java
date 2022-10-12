package Sample;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class SampleTest {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\Vcentry\\C1_WebDriverTest\\browser\\chromedriver.exe");
			WebDriver wd= new ChromeDriver();//webdriver is interface, chromedriver is class... we r merging these two
			wd.get("http://automationpractice.com/index.php");
		}

	}



