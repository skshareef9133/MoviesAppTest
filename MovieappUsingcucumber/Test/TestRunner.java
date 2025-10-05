package MoviesAppPages.MovieappUsingcucumber.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/MoviesAppPages/MovieappUsingcucumber/Features",
                 glue = {"MoviesAppPages/MovieappUsingcucumber/Steps"})

public class TestRunner extends AbstractTestNGCucumberTests {
}

//import org.junit.runner.RunWith;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.Cucumber;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "src/test/java/MoviesAppPages.MovieappUsingcucumber/Features",
//        glue = {"MoviesAppPages.MovieappUsingcucumber/Steps"},
//        plugin = {
//                "pretty",
//                "html:target/cucumber-html.html",
//                "junit:target/cucumber-xml.xml"
//        }
//)
//
//public class TestRunner{
//
//}
