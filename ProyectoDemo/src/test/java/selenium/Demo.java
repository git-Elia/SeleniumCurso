package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Demo {

	static WebDriver driver;
	
		public static void main(String[] args) {
			ChromeOptions opcion = new ChromeOptions();
			opcion.addArguments("--incognito");
			opcion.addArguments("--start-maximized");
			System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver(opcion);
			
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.close();
			
		/**	
			//Abrir ventana usando Firefox
			FirefoxOptions opcionFF = new FirefoxOptions();
			opcionFF.addArguments("--incognito");
			opcionFF.addArguments("--start-maximized");
			System.setProperty("webdriver.gecko.driver", "geckodriver\\geckodriver.exe");
			WebDriver driverFF= new FirefoxDriver(opcionFF);
			
			
			driverFF.get("https://opensource-demo.orangehrmlive.com/");
			driverFF.close();
			
			//Abrir ventana usando Edge
			EdgeOptions opcionEdge = new EdgeOptions();
			opcionEdge.addArguments("--incognito");
			opcionEdge.addArguments("--start-maximized");
			System.setProperty("webdriver.edge.driver", "edgedriver\\msedgedriver.exe");
			WebDriver driverEdge= new EdgeDriver(opcionEdge);
			
			
			driverEdge.get("https://opensource-demo.orangehrmlive.com/");
			driverEdge.close();
			*/
		}//main
}
