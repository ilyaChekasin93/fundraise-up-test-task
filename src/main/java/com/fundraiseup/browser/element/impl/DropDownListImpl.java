package com.fundraiseup.browser.element.impl;

import com.fundraiseup.browser.element.DropDownList;
import com.microsoft.playwright.Locator;

public class DropDownListImpl extends ElementImpl implements DropDownList {

    public DropDownListImpl(Locator locator) {
        super(locator);
    }

    public void selectOption(String value) {
        locator.selectOption(value);
    }

}
