package com.fundraiseup.page;

import com.fundraiseup.browser.element.Button;
import com.fundraiseup.browser.element.Frame;
import com.fundraiseup.browser.engine.BrowserEngine;

public class MainPage extends BasePage {

    private static final String BASE_URL = "https://data.fundraiseup.com/qa-test-7R58U3/";

    private final Frame donateButtonFrame = browserEngine.findFrame("//iframe[@title='Donate Button']");
    private final Button giveNowButton = donateButtonFrame.findButton("//div[@qa='fun-element']");

    public MainPage(BrowserEngine browserEngine) {
        super(browserEngine);
        browserEngine.navigate(BASE_URL);
    }

    public DonatePage clickOnGiveNowButton() {
        giveNowButton.click();

        return new DonatePage(browserEngine);
    }
}
