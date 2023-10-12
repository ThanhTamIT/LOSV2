package pageobjects.salelead;

import commons.BasePage;
import commons.BasePageUI;
import pageuis.sale.CreatNewCasePageUI;

public class UpdateInformationToSalePageObject extends BasePage {

    public UpdateInformationToSalePageObject() {
    }

    public void checkRuleAndGoToConfirmPage(String slDecision) {
        waitForAllElementVisible(BasePageUI.OPEN_CASES_FRAME);
        switchToFrameIframe(BasePageUI.OPEN_CASES_FRAME);
        waitForAllElementVisible(BasePageUI.BTN_VALIDATE);
        scrollToElement(BasePageUI.BTN_VALIDATE);
        clickToElement(BasePageUI.BTN_VALIDATE);
        waitForPMModalLoadingInvisible();
        scrollToElement(BasePageUI.INPUT_SELECT_DECISION);
        selectItemInDefaultDropdown(BasePageUI.INPUT_SELECT_DECISION, slDecision);
        sleepInSecond(3);
        waitForElementInvisible(CreatNewCasePageUI.MODAL_FADE);
        sleepInSecond(3);
        scrollToBottomPage();
        waitForElementClickable(BasePageUI.BTN_COMPLETE);
        clickToElement(BasePageUI.BTN_COMPLETE);
    }

    public SaleLeadHomePageObject clickContinueButton() {
        waitForElementVisible(BasePageUI.BTN_CONTINUE);
        clickToElement(BasePageUI.BTN_CONTINUE);
        return new SaleLeadHomePageObject();
    }
}
