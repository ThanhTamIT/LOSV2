package pageobjects.salelead;

import commons.BasePage;
import commons.BasePageUI;
import pageuis.salelead.SaleLeadHomePageUI;

public class SaleLeadHomePageObject extends BasePage {

    public SaleLeadHomePageObject() {
    }

    public String getTextAccount() {
        waitForElementVisible(SaleLeadHomePageUI.TXT_ACCOUNT);
        return getElementText(SaleLeadHomePageUI.TXT_ACCOUNT);
    }

    public UpdateInformationToSalePageObject goToUpdateInfoPage(String appCode) {
        waitForAllElementVisible(BasePageUI.CASES_FRAME);
        switchToFrameIframe(BasePageUI.CASES_FRAME);
        switchToFrameIframe(BasePageUI.CASES_SUB_FRAME);
        /*Todo*/
        doubleClick(BasePageUI.ROW_DATA_APP_CODE, appCode);
//        doubleClick(SaleLeadHomePageUI.ROW_DATA_APP_CODE_TEST);
        return new UpdateInformationToSalePageObject();
    }
}
