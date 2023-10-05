package pageobjects.de;

import commons.BasePage;
import commons.BasePageUI;
import pageuis.sale.SaleHomePageUI;

public class DeNewcasePageObject extends BasePage{

	public void clickToAppCodeExpect(String appcode) {
		waitForElementVisible(BasePageUI.CASES_FRAME);
		switchToFrameIframe(BasePageUI.CASES_FRAME);
		waitForElementVisible(BasePageUI.CASES_SUB_FRAME);
		switchToFrameIframe(BasePageUI.CASES_SUB_FRAME);
		doubleClick(BasePageUI.TXT_DYNAMIC_APP_CODE, appcode);
	}

	public void inputFormInfoAboutTheLoanApplicant() {
		
		
	}
	
	 


}
