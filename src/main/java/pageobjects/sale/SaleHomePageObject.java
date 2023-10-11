package pageobjects.sale;

import commons.BasePage;
import commons.BasePageUI;
import pageuis.sale.SaleHomePageUI;
import pageuis.salelead.SaleLeadHomePageUI;

public class SaleHomePageObject extends BasePage {

    public SaleHomePageObject() {
    }

    public String getTextAccount() {
        waitForElementVisible(SaleHomePageUI.TXT_ACCOUNT);
        return getElementText(SaleHomePageUI.TXT_ACCOUNT);
    }

    public NewCaseHomePageObject clickToIconCasesStartCase() {
        waitForAllElementVisible(BasePageUI.CASES_FRAME);
        switchToFrameIframe(BasePageUI.CASES_FRAME);
        clickToElement(SaleHomePageUI.ICON_CASES_START_CASE);
        return new NewCaseHomePageObject();
    }

    public UpdateInformationToAPPageObject goToUpdateInformationToAPPage(String appCode) {
        waitForAllElementVisible(BasePageUI.CASES_FRAME);
        switchToFrameIframe(BasePageUI.CASES_FRAME);
        switchToFrameIframe(BasePageUI.CASES_SUB_FRAME);
        doubleClick(BasePageUI.TXT_DYNAMIC_APP_CODE, appCode);
//        doubleClick(SaleLeadHomePageUI.ROW_DATA_APP_CODE_TEST);
        return new UpdateInformationToAPPageObject();
    }
}
