package com.fundraiseup.browser.element.impl;

import com.fundraiseup.browser.element.*;
import com.microsoft.playwright.FrameLocator;

public class FrameImpl implements Frame {

    private final FrameLocator frameLocator;

    public FrameImpl(FrameLocator frameLocator) {
        this.frameLocator = frameLocator;
    }

    public Element findElement(String selector) {
        return new ElementImpl(frameLocator.locator(selector));
    }

    public TextField findTextField(String selector) {
        return new TextFieldImpl(frameLocator.locator(selector));
    }

    public Button findButton(String selector) {
        return new ButtonImpl(frameLocator.locator(selector));
    }

    public DropDownList findDropDownList(String selector) {
        return new DropDownListImpl(frameLocator.locator(selector));
    }

    public Checkbox findCheckbox(String selector) {
        return new CheckboxImpl(frameLocator.locator(selector));
    }

    public Frame findFrame(String selector) {
        return new FrameImpl(frameLocator.frameLocator(selector));
    }
}
