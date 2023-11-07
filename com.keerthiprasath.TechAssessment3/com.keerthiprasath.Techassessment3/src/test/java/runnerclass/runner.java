package runnerclass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="",features="src\\test\\resources\\Feature\\ Register.feature",glue="com.keerthiprasath.Techassessment3",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
	public class runner {
}

