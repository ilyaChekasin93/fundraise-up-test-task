package com.fundraiseup.page;

import com.fundraiseup.browser.element.Button;
import com.fundraiseup.browser.element.Checkbox;
import com.fundraiseup.browser.engine.BrowserEngine;

public class PaymentOptionPage extends BaseDonationPage {

    private final Checkbox coverTransactionCostsCheckbox =
            donationWidgetFrame.findCheckbox("//div[@data-qa='cover-fee-checkbox']");
    private final Button creditCardButton = donationWidgetFrame.findButton("//button[@data-qa='cc-button']");

    public PaymentOptionPage(BrowserEngine browserEngine) {
        super(browserEngine);
    }

    public PaymentOptionPage turnOffCoverTransactionCostsCheckbox() {
        coverTransactionCostsCheckbox.turnOff();

        return this;
    }

    public CreditCardPage clickOnCreditCardButton() {
        creditCardButton.click();

        return new CreditCardPage(browserEngine);
    }
}
