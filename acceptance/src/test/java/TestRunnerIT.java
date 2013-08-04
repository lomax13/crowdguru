import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.Properties;

import static java.lang.ClassLoader.getSystemResourceAsStream;

@RunWith(Cucumber.class)
@Cucumber.Options(features={"src/test/resources/usecases"},tags ="@automated")
public class TestRunnerIT {
    //Load test properties so that tests could be invoked with properties both from Runner and maven
    @BeforeClass
    public static void initTestRunnerWithFileLoadedProperties() throws IOException {
        Properties testRunnerProperties = new Properties();
        testRunnerProperties.load(getSystemResourceAsStream("test.properties"));
        for(String key : testRunnerProperties.stringPropertyNames()) {
            System.setProperty(key, testRunnerProperties.getProperty(key));
        }
    }

}
