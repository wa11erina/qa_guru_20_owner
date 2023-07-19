package guru.qa.config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class OwnerWebConfig extends WebConfig {

    static DefaultWebConfig config = ConfigFactory.create(DefaultWebConfig.class, System.getProperties());

    @Override
    public void runWebConfig() {

        Configuration.holdBrowserOpen = true;
        Configuration.pageLoadStrategy = "eager";

        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.browserSize = config.getBrowserSize();
        Configuration.remote = config.getRemoteUrl();
        Configuration.baseUrl = config.getBaseUrl();

        // Configuration with no reference on Jenkins:
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;

    }
}
