package com.fundraiseup.page;

import com.fundraiseup.browser.element.Frame;
import com.fundraiseup.browser.engine.BrowserEngine;

public abstract class BaseDonationPage extends BasePage {

    protected final Frame donationWidgetFrame = browserEngine.findFrame("//iframe[@title='Donation Widget']");

    public BaseDonationPage(BrowserEngine browserEngine) {
        super(browserEngine);
    }

}
