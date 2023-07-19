package guru.qa.config;

import com.codeborne.selenide.Configuration;
import guru.qa.helpers.TestLoggerHelper;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;
import java.util.Objects;

public class HardcodedWebConfig extends WebConfig {

    @Override
    public void runWebConfig() {
        Configuration.pageLoadStrategy = "eager";

        Configuration.holdBrowserOpen = false;

        Configuration.browserSize = "1920x1080";

        // Change to true if you need remote execution
        Configuration.remote = false ? "https://user1:1234@selenoid.autotests.cloud/wd/hub" : null;

        Configuration.baseUrl = "https://demoqa.com/";

        if (!Objects.isNull(Configuration.remote))
        {
            // Configuration with no reference on Jenkins:
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", true
            ));
            Configuration.browserCapabilities = capabilities;

            TestLoggerHelper.logToLoggerAndToCustomLog("Set configuration.browserCapabilities: " + Configuration.browserCapabilities + "\n");
        }

    }

}