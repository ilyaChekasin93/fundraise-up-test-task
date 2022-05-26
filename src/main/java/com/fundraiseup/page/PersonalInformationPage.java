package com.fundraiseup.page;

import com.fundraiseup.browser.element.Button;
import com.fundraiseup.browser.element.TextField;
import com.fundraiseup.browser.engine.BrowserEngine;

public class PersonalInformationPage extends BaseDonationPage {

    private final TextField firstnameField =
            donationWidgetFrame.findTextField("//input[@data-qa='personal-first-name']");
    private final TextField lastnameField =
            donationWidgetFrame.findTextField("//input[@data-qa='personal-last-name']");
    private final TextField emailField =
            donationWidgetFrame.findTextField("//input[@data-qa='personal-email']");
    private final Button payButton =
            donationWidgetFrame.findButton("//div[@data-qa='privacy-continue']//button[@qa='pay-button']");


    public PersonalInformationPage(BrowserEngine browserEngine) {
        super(browserEngine);
    }

    public PersonalInformationPage sengFirstname(String value) {
        firstnameField.sendKeys(value);

        return this;
    }

    public PersonalInformationPage sendLastname(String value) {
        lastnameField.sendKeys(value);

        return this;
    }

    public PersonalInformationPage sendEmail(String value) {
        emailField.sendKeys(value);

        return this;
    }

    public CreditCardPage clickOnPayButtonWithError() {
        payButton.click();

        return new CreditCardPage(browserEngine);
    }
}
