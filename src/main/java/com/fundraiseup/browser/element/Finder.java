package com.fundraiseup.browser.element;

public interface Finder {

    Element findElement(String selector);

    TextField findTextField(String selector);

    Button findButton(String selector);

    DropDownList findDropDownList(String selector);

    Checkbox findCheckbox(String selector);

}
