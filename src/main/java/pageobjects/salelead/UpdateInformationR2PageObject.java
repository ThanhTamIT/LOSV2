package pageobjects.salelead;

import commons.BasePage;
import commons.BasePageUI;
import pageuis.sale.CreatNewCasePageUI;
import pageuis.salelead.UpdateInformationToSalePageUI;

public class UpdateInformationR2PageObject extends BasePage {

    public UpdateInformationR2PageObject() {
    }

    public SaleLeadHomePageObject clickContinueButton() {
        waitForElementVisible(BasePageUI.BTN_CONTINUE);
        clickToElement(BasePageUI.BTN_CONTINUE);
        return new SaleLeadHomePageObject();
    }

    public void inputDecisionUploadContract(String approve) {
        waitForAllElementVisible(BasePageUI.OPEN_CASES_FRAME);
        switchToFrameIframe(BasePageUI.OPEN_CASES_FRAME);
        waitForElementVisible(UpdateInformationToSalePageUI.INPUT_SL_DECISION_UPLOAD_CONTRACT);
        selectItemInDefaultDropdown(UpdateInformationToSalePageUI.INPUT_SL_DECISION_UPLOAD_CONTRACT, approve);
        waitForElementInvisible(CreatNewCasePageUI.MODAL_FADE);
        scrollToElement(UpdateInformationToSalePageUI.BTN_COMPLETE);
        waitForAllElementVisible(UpdateInformationToSalePageUI.BTN_COMPLETE);
        clickToElement(UpdateInformationToSalePageUI.BTN_COMPLETE);
    }
}
