package org.sathiz.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/org/sathiz/features/home.feature",
        glue = "HomeSteps.java")
public class JunitRunnerForMyDust {

}
