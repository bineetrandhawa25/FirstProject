import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BINEET\\Desktop\\Selenium\\Browser drivers\\chromedriver.exe");
		
		WebDriver dev = new ChromeDriver();
		dev.manage().window().maximize();
		
		dev.get("https://demoqa.com/");
	
		//dev.close();
	}

}
