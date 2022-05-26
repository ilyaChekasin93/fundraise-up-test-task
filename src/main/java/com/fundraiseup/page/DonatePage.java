package com.fundraiseup.page;

import com.fundraiseup.browser.element.Button;
import com.fundraiseup.browser.element.DropDownList;
import com.fundraiseup.browser.element.TextField;
import com.fundraiseup.browser.engine.BrowserEngine;

public class DonatePage extends BaseDonationPage {

    private final Button monthlyButton = donationWidgetFrame.findButton("//button[@data-qa='give-monthly']");
    private final TextField amountField = donationWidgetFrame.findTextField("//input[@data-qa='amount']");
    private final DropDownList currencyList =
            donationWidgetFrame.findDropDownList("//select[@data-qa='currency-selector']");
    private final Button donateButton = donationWidgetFrame.findButton("//button[@data-qa='donate-button']");

    public DonatePage(BrowserEngine browserEngine) {
        super(browserEngine);
    }

    public DonatePage clickOnMonthlyButton() {
        monthlyButton.click();

        return this;
    }

    public DonatePage sendAmount(String value) {
        amountField.sendKeys(value);

        return this;
    }

    public DonatePage selectCurrency(String value) {
        currencyList.selectOption(value);

        return this;
    }

    public PaymentOptionPage clickOnDonateButton() {
        donateButton.click();

        return new PaymentOptionPage(browserEngine);
    }

}
