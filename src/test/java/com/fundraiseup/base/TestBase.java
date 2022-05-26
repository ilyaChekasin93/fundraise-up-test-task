package com.fundraiseup.base;

import com.fundraiseup.browser.manager.BrowserManager;
import com.fundraiseup.page.MainPage;
import com.google.inject.Inject;
import org.junit.jupiter.api.AfterEach;

public class TestBase {

    @Inject
    protected MainPage mainPage;

    @Inject
    protected BrowserManager browserManager;

    @AfterEach
    public void afterTest() {
        browserManager.closeBrowser();
    }

}
