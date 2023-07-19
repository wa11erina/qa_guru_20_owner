package guru.qa.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class GitHubSearchTest extends TestBase {

    @Test
    void blueSkySocialGitHubSearch() {

        step("Open GitHub Main Page", () -> {
        open("https://github.com/");
        });

        step("Input 'bluesky social app' in the search field", () -> {
        $("[placeholder='Search or jump to...']").click();
        $("#query-builder-test").setValue("bluesky social app").pressEnter();

        });

        step("Click suitable search result link", () -> {
        $("[data-testid='results-list']").$(byText("bluesky-social/")).click();
        });

        step("Open Issues tab", () -> {
            $("#issues-tab").click();
        });

        step("Check that issue #1034 exists", () -> {
            $("#issue_1034").shouldHave(text("#1034"));
        });
    }
}

