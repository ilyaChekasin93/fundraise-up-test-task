package com.fundraiseup.page;

import com.fundraiseup.browser.element.Button;
import com.fundraiseup.browser.element.Element;
import com.fundraiseup.browser.element.Frame;
import com.fundraiseup.browser.element.TextField;
import com.fundraiseup.browser.engine.BrowserEngine;
import org.junit.jupiter.api.Assertions;

public class CreditCardPage extends BaseDonationPage {

    private final Frame cardNumberInputFrame =
            donationWidgetFrame.findFrame("//iframe[@title='Secure card number input frame']");
    private final TextField cardNumberField =
            cardNumberInputFrame.findTextField("//input[@placeholder='Card number']");
    private final Frame expirationDateInputFrame =
            donationWidgetFrame.findFrame("//iframe[@title='Secure expiration date input frame']");
    private final TextField dateField =
            expirationDateInputFrame.findTextField("//input[@placeholder='MM / YY']");
    private final Frame cvcInputFrame =
            donationWidgetFrame.findFrame("//iframe[@title='Secure CVC input frame']");
    private final TextField cvcTextField =
            cvcInputFrame.findTextField("//input[@placeholder='CVC']");
    private final Button continueButton = donationWidgetFrame.findButton("//button[@qa='pay-button']");
    private final Element errorMessage = donationWidgetFrame.findElement("//div[@qa='error-message']");

    public CreditCardPage(BrowserEngine browserEngine) {
        super(browserEngine);
    }

    public CreditCardPage sendCardNumber(String value) {
        cardNumberField.sendKeys(value);

        return this;
    }

    public CreditCardPage sendCardDate(String value) {
        dateField.sendKeys(value);

        return this;
    }

    public CreditCardPage sendCVC(String value) {
        cvcTextField.sendKeys(value);

        return this;
    }

    public PersonalInformationPage clickOnContinue() {
        continueButton.click();

        return new PersonalInformationPage(browserEngine);
    }

    public CreditCardPage containsErrorMessage(String value) {
        Assertions.assertTrue(errorMessage.getTextContent().contains(value));

        return this;
    }
}
