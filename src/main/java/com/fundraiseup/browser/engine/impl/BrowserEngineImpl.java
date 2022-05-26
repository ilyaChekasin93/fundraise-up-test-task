package com.fundraiseup.browser.engine.impl;

import com.fundraiseup.browser.engine.BrowserEngine;
import com.fundraiseup.browser.element.*;
import com.fundraiseup.browser.element.impl.*;
import com.microsoft.playwright.Page;

public class BrowserEngineImpl implements BrowserEngine {

    private final Page page;

    public BrowserEngineImpl(Page page) {
        this.page = page;
    }

    public void navigate(String url) {
        page.navigate(url);
    }

    public Frame findFrame(String selector) {
        return new FrameImpl(page.frameLocator(selector));
    }

    public Element findElement(String selector) {
        return new ElementImpl(page.locator(selector));
    }

    public TextField findTextField(String selector) {
        return new TextFieldImpl(page.locator(selector));
    }

    public Button findButton(String selector) {
        return new ButtonImpl(page.locator(selector));
    }

    public DropDownList findDropDownList(String selector) {
        return new DropDownListImpl(page.locator(selector));
    }

    public Checkbox findCheckbox(String selector) {
        return new CheckboxImpl(page.locator(selector));
    }
}
