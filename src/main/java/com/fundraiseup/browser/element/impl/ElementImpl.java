package com.fundraiseup.browser.element.impl;

import com.fundraiseup.browser.element.*;
import com.microsoft.playwright.Locator;

public class ElementImpl implements Element {

    protected final Locator locator;

    public ElementImpl(Locator locator) {
        this.locator = locator;
    }

    public Element findElement(String selector) {
        return new ElementImpl(locator.locator(selector));
    }

    public TextField findTextField(String selector) {
        return new TextFieldImpl(locator.locator(selector));
    }

    public Button findButton(String selector) {
        return new ButtonImpl(locator.locator(selector));
    }

    public DropDownList findDropDownList(String selector) {
        return new DropDownListImpl(locator.locator(selector));
    }

    public Checkbox findCheckbox(String selector) {
        return new CheckboxImpl(locator.locator(selector));
    }

    public void click() {
        locator.click();
    }

    public String getTextContent() {
        return locator.textContent();
    }
}
