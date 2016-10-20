
package uk.co.automatictester.jwebfwk.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
 
@CucumberOptions(features = "src/test/resources/features/Download.feature",
        glue = "uk.co.automatictester.jwebfwk.glue",
        format = {"pretty"})

public class DownloadFeatureRunner extends AbstractTestNGCucumberTests {
	
}
