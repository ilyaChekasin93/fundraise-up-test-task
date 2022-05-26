package com.fundraiseup.browser.element.impl;

import com.fundraiseup.browser.element.TextField;
import com.microsoft.playwright.Locator;

public class TextFieldImpl extends ElementImpl implements TextField {

    public TextFieldImpl(Locator locator) {
        super(locator);
    }

    public void sendKeys(String content) {
        locator.fill(content);
    }

}
