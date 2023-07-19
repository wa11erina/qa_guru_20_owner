package guru.qa.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import guru.qa.config.OwnerWebConfig;
import guru.qa.helpers.Attach;
import guru.qa.helpers.TestLoggerHelper;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static guru.qa.helpers.TestSelenideConfigLogger.logSelenideMainConfigValues;

public class TestBase {
    @BeforeAll
    static void setUp() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        new OwnerWebConfig().runWebConfig();
        logSelenideMainConfigValues();
    }

    @AfterEach
    void addAttachments() {
        Attach.attachAsText("My custom log", TestLoggerHelper.getCustomLogs());
    }
}
