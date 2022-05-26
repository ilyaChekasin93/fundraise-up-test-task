package com.fundraiseup.browser.manager;

import com.fundraiseup.browser.engine.BrowserEngine;

public interface BrowserManager {

    BrowserEngine openBrowser();

    void closeBrowser();

}
