package github;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork {

    @Test
    void shouldFindWiki() {
        // открыть браузер на странице гитхаб
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".wiki-rightbar").$$("li").last().$("button").click();
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));

    }
}