package org.example.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://es.aliexpress.com")
public class HomePage extends PageObject {
    public static final Target SEARCH_BAR = Target
            .the("SEARCH_BAR")
            .located(By.id("search-key"));

    public static final Target SEARCH_BUTTON = Target
            .the("SEARCH_BUTTON")
            .located(By.className("search-button"));

    public static final Target DROPDOWN_CATEGORY = Target
            .the("DROPDOWN_CATEGORY")
            .located(By.id("search-dropdown-box"));
}
