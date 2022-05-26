package com.fundraiseup.page;

import com.fundraiseup.browser.engine.BrowserEngine;

public abstract class BasePage {

    protected final BrowserEngine browserEngine;

    public BasePage(BrowserEngine browserEngine) {
        this.browserEngine = browserEngine;
    }

}
