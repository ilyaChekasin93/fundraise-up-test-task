package com.fundraiseup;

import com.fundraiseup.base.TestBase;
import com.fundraiseup.di.RequiresInjection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static com.fundraiseup.base.TestConstant.*;

@RequiresInjection
@Execution(ExecutionMode.CONCURRENT)
public class PayFormTest extends TestBase {

    @Test
    public void firstSimpleTest() {
        mainPage.clickOnGiveNowButton()
                .clickOnMonthlyButton()
                .sendAmount(VALID_AMOUNT_VALUE)
                .selectCurrency(USD)
                .clickOnDonateButton()
                .turnOffCoverTransactionCostsCheckbox()
                .clickOnCreditCardButton()
                .sendCardNumber(NOT_VALID_CARD_NUMBER)
                .sendCardDate(CART_DATE)
                .sendCVC(NOT_VALID_CVC)
                .clickOnContinue()
                .sengFirstname(FIRSTNAME)
                .sendLastname(LASTNAME)
                .sendEmail(EMAIL)
                .clickOnPayButtonWithError()
                .containsErrorMessage(CARD_DECLINED_ERROR_MESSAGE);
    }

    @Test
    public void secondSimpleTest() {
        mainPage.clickOnGiveNowButton()
                .clickOnMonthlyButton()
                .sendAmount(VALID_AMOUNT_VALUE)
                .selectCurrency(USD)
                .clickOnDonateButton()
                .turnOffCoverTransactionCostsCheckbox()
                .clickOnCreditCardButton()
                .sendCardNumber(NOT_VALID_CARD_NUMBER)
                .sendCardDate(CART_DATE)
                .sendCVC(NOT_VALID_CVC)
                .clickOnContinue()
                .sengFirstname(FIRSTNAME)
                .sendLastname(LASTNAME)
                .sendEmail(EMAIL)
                .clickOnPayButtonWithError()
                .containsErrorMessage(CARD_DECLINED_ERROR_MESSAGE);
    }

}
