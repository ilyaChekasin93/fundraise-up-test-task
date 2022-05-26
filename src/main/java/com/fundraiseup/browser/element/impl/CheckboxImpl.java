package com.fundraiseup.browser.element.impl;

import com.fundraiseup.browser.element.Checkbox;
import com.microsoft.playwright.Locator;

public class CheckboxImpl extends ElementImpl implements Checkbox {

    public CheckboxImpl(Locator locator) {
        super(locator);
    }

    public Boolean isActivate() {
        return Boolean.valueOf(locator.getAttribute("aria-checked"));
    }

    public void turnOn() {
        if (!isActivate()) {
            locator.click();
        }
    }

    public void turnOff() {
        if (isActivate()) {
            locator.click();
        }
    }
}
