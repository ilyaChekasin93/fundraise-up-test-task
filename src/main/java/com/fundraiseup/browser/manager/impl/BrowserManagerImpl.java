package com.fundraiseup.browser.manager.impl;

import com.fundraiseup.browser.engine.BrowserEngine;
import com.fundraiseup.browser.engine.impl.BrowserEngineImpl;
import com.fundraiseup.browser.manager.BrowserManager;
import com.microsoft.playwright.*;

public class BrowserManagerImpl implements BrowserManager {

    private BrowserContext context;
    private Browser browser;

    public BrowserEngine openBrowser() {
        browser = getBrowserType().launch(getOptions());
        context = browser.newContext();

        return new BrowserEngineImpl(context.newPage());
    }

    public void closeBrowser() {
        context.close();
        browser.close();
    }

    private BrowserType getBrowserType() {
        return Playwright.create().chromium();
    }

    private BrowserType.LaunchOptions getOptions() {
        return new BrowserType.LaunchOptions().setHeadless(false);
    }

}
