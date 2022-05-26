package com.fundraiseup.browser.engine;

import com.fundraiseup.browser.element.Finder;
import com.fundraiseup.browser.element.Frame;

public interface BrowserEngine extends Finder {

    void navigate(String url);

    Frame findFrame(String selector);
}
