package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SolutionTest {

    @Test
    void checkTitle() {
        open("https://github.com");
        $("li.HeaderMenu-item:nth-child(2)").hover();
        $("a[href=\"/enterprise\"]").click();
        $("h1.h1-mktg").shouldBe(visible).
                shouldHave(text("Build like the best"));
    }
}
