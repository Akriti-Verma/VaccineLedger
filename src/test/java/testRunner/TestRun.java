package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\Alljavaprograms\\VACCINE\\src\\test\\resources\\Features",
		glue= {"stepDefination"}
		)

public class TestRun {
	
	
}
