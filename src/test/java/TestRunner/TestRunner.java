package TestRunner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import DriverFactory.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/Features/Batch.feature",
    glue = {"StepDefinition", "Hooks"},
    //tags = "@excel",
    plugin = {
        "pretty",
        "html:target/cucumber-Reports.html",
        "json:target/cucumber.json",
        "junit:target/Cucumber.xml",
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
    },
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browser")
    public void setupBrowser(String browser) {

        DriverFactory.setBrowser(browser);

        System.out.println(
            "TESTNG BROWSER = " + browser +
            " | THREAD = " + Thread.currentThread().getId()
        );
    }

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}