package runner.org;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import base.org.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
                      //feature file path                            //stepdefinition paackage name
@CucumberOptions(features="D:\\jigar\\java\\back\\demo\\src\\test\\java\\Feature\\dominos.feature", glue="stepdefintion.org")
public class RunClass extends BaseClass{

	@BeforeClass
	
	public static void start() {
		
		driver=new ChromeDriver();
	}
	
	
	
}
