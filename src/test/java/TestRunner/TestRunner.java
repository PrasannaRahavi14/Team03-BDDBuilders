package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	        features = "src/test/resources/Features/Batch.feature",
	        glue = {"StepDefinition"},
	        tags = "@1",
	        plugin = { "pretty", // Enhanced readable console logs
			        "html:target/cucumber-Reports.html", // HTML report
			        "json:target/cucumber.json", // JSON report for integrations
			        "junit:target/Cucumber.xml", // JUnit XML report
			        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", // Allure integration
			        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/extent-report" // Extent report
					},
	        monochrome = false
	        
	)
	public class TestRunner extends AbstractTestNGCucumberTests  {
		 @Override
		  @DataProvider(parallel = false)
		  public Object[][] scenarios()
		  { return super.scenarios();
		  }
	}

