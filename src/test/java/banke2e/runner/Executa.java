package banke2e.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import banke2e.drivers.Driver;
import banke2e.metodos.Metodos;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;






@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		tags = "@login",
		glue = "banke2e.steps",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:target/cucumber-report.html"}
		)
public class Executa extends Driver{
	Metodos metodo = new Metodos();
	
	
	
	public static void iniciarTeste() {
		
		String navegador = "Chrome";
		
		if(navegador == "Chrome") {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("***** url solicitada Chrome *****");
		}else {
			
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		System.out.println("***** url solicitada Firefox *****");
		}

		driver.get("http://52.2.114.98/");
		driver.manage().window().maximize();
		
	
		
	}

}
