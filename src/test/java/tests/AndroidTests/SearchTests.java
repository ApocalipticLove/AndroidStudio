package tests.AndroidTests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.By.id;

public class SearchTests extends TestBase {

    @Test
    @Tag("android")
    void searchTest() {
        back();
        step("Type search", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("BrowserStack");
        });
        step("Verify content found", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
    }

    @Test
    @Tag("android")
    void gettingStartedWikiTest() {
        step("Onboard language options verify and go next page", () -> {
            $(id("org.wikipedia.alpha:id/secondaryTextView")).shouldHave(text("We’ve found the following on your device:"));
            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Onboard feed options verify and go next page", () -> {
            $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("New ways to explore"));
            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Onboard sync options verify and go next page", () -> {
            $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("Reading lists with sync"));
            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });
        step("Onboard send data options verify and go next page", () -> {
            $(id("org.wikipedia.alpha:id/secondaryTextView")).shouldHave(text("Help make the app better by letting us know how you use it."+
                    " Data collected is anonymous. Learn more"));
            $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
        });
        step("Wiki home page check ", () -> {
            $(id("org.wikipedia.alpha:id/search_container")).shouldBe(visible);
        });

    }
}
