package pageobjects.de;

import commons.BasePage;
import commons.BasePageUI;
import pageuis.de.DEPageUI;

import static commons.GlobalConstants.*;

public class DeNewcasePageObject extends BasePage {

    public void clickToAppCodeExpect(String appCode) {
        waitForElementVisible(BasePageUI.CASES_FRAME);
        switchToFrameIframe(BasePageUI.CASES_FRAME);
        waitForElementClickable(BasePageUI.TAB_UNASSIGNED);
        clickToElement(BasePageUI.TAB_UNASSIGNED);
        waitForElementVisible(BasePageUI.CASES_SUB_FRAME);
        switchToFrameIframe(BasePageUI.CASES_SUB_FRAME);
        overrideGlobalTimeout(LONG_TIMEOUT_THREE_MINUTE);
        doubleClick(BasePageUI.TXT_DYNAMIC_APP_CODE, appCode);
        overrideGlobalTimeout(LONG_TIMEOUT);
        waitForElementVisible(BasePageUI.CASES_OPEN_FRAME);
        switchToFrameIframe(BasePageUI.CASES_OPEN_FRAME);
        clickToElement(BasePageUI.BTN_CATCH);
    }

    public void inputFormInfoAboutTheLoanApplicant(String placeIssuancePoa, String datePoaIssue) {
        sleepInSecond(5);
        waitForElementVisible(BasePageUI.CASES_FRAME);
        switchToFrameIframe(BasePageUI.CASES_FRAME);
        switchToFrameIframe(BasePageUI.CASES_SUB_FRAME);
        switchToFrameIframe(BasePageUI.CASES_OPEN_FRAME);
        scrollToElement(DEPageUI.DRD_PARENRT_PLACE_ISSUANCE_POA);
        waitForElementVisible(DEPageUI.DRD_PARENRT_PLACE_ISSUANCE_POA);
        selectItemInCustomDropdown(DEPageUI.DRD_PARENRT_PLACE_ISSUANCE_POA, DEPageUI.DRD_ITEM_CHILD_ISSUE_PLACE, placeIssuancePoa);
        sendKeyToElement(DEPageUI.EDT_POA_ISSUE_DATE, datePoaIssue);

    }

    public void inputFormInfoLivingAddress(String addressWard, String addressDetail) {
        waitForElementVisible(DEPageUI.DRD_PARENT_ADDRESS_WARD);
        selectItemInCustomDropdown(DEPageUI.DRD_PARENT_ADDRESS_WARD, DEPageUI.DRD_ITEM_CHILD_ADDRESS_WARD, addressWard);
        sendKeyToElement(DEPageUI.EDT_DETAIL_ADDRESS, addressDetail);
        clickToElement(DEPageUI.CBX_SAME_AS_LIVING_ADDRESS);
    }

    public void inputFormTimeSpentLiving(String numberYear, String numberMonth) {
        waitForElementVisible(DEPageUI.EDT_TIME_LIVING_CURRENT_BASEON_YEAR);
        sendKeyToElement(DEPageUI.EDT_TIME_LIVING_CURRENT_BASEON_YEAR, numberYear);
        waitForElementVisible(DEPageUI.EDT_TIME_LIVING_CURRENT_BASEON_MONTH);
        sendKeyToElement(DEPageUI.EDT_TIME_LIVING_CURRENT_BASEON_MONTH, numberMonth);
    }

    public void inputFormInfoHouseMaritalStatusEduLevel(String accomodationType, String maritalStatus, String educationLevel) {
        waitForElementVisible(DEPageUI.DRD_ACCOMODATION_TYPE);
        selectItemInDefaultDropdown(DEPageUI.DRD_ACCOMODATION_TYPE, accomodationType);
        waitForElementVisible(DEPageUI.DRD_MARITAL_STATUS);
        selectItemInDefaultDropdown(DEPageUI.DRD_MARITAL_STATUS, maritalStatus);
        waitForElementVisible(DEPageUI.DRD_EDUCATION_LEVEL);
        selectItemInDefaultDropdown(DEPageUI.DRD_EDUCATION_LEVEL, educationLevel);
    }

    public void inputFormInfoJob(String jobName, String companyName) {
        waitForElementVisible(DEPageUI.DRD_JOB);
        selectItemInDefaultDropdown(DEPageUI.DRD_JOB, jobName);
        waitForElementVisible(DEPageUI.EDT_COMPANY_NAME);
        sendKeyToElement(DEPageUI.EDT_COMPANY_NAME, companyName);
    }

    public void confirmAdress(String confirmAddressLiving, String confirmAddressWorking) {
        clickToElement(DEPageUI.CBX_DYNAMIC_TEXT, confirmAddressLiving);
        clickToElement(DEPageUI.CBX_DYNAMIC_TEXT, confirmAddressWorking);
    }

    public void inputNumberPhoneCompany(String phoneComany) {
        waitForElementVisible(DEPageUI.EDT_COMPANY_PHONE_NUMBER);
        sendKeyToElement(DEPageUI.EDT_COMPANY_PHONE_NUMBER, phoneComany);
    }

    public void inputExperience(String timeWorkingBaseonYear, String timeWorkingBaseonMonth, String experienceBaseonYear, String experienceBaseonMonth) {
        waitForElementVisible(DEPageUI.EDT_TIME_WORKING_IN_YEAR);
        sendKeyToElement(DEPageUI.EDT_TIME_WORKING_IN_YEAR, timeWorkingBaseonYear);

        waitForElementVisible(DEPageUI.EDT_TIME_WORKING_IN_MONTH);
        sendKeyToElement(DEPageUI.EDT_TIME_WORKING_IN_MONTH, timeWorkingBaseonMonth);

        sendKeyToElement(DEPageUI.EDT_EXPERIENCE_IN_YEAR, experienceBaseonYear);
        waitForElementVisible(DEPageUI.EDT_EXPERIENCE_IN_YEAR);

        sendKeyToElement(DEPageUI.EDT_EXPERIENCE_IN_MONTH, experienceBaseonMonth);
        waitForElementVisible(DEPageUI.EDT_EXPERIENCE_IN_MONTH);

    }

    public void inputPositionAndLabourContractType(String position, String labourContractType) {
        waitForElementVisible(DEPageUI.DRD_POSITION);
        selectItemInDefaultDropdown(DEPageUI.DRD_POSITION, position);
        waitForElementVisible(DEPageUI.DRD_LABOUR_CONTRACT_TYPE);
        selectItemInDefaultDropdown(DEPageUI.DRD_LABOUR_CONTRACT_TYPE, labourContractType);
    }

    public void inputFirstRefPeople(String fullnameFirstRef, String refType, String phoneNumber, String fullnameSecondRef, String refTypeSencond, String phoneNumberRef2) {
        waitForElementVisible(DEPageUI.EDT_REF1_FULLNAME);
        sendKeyToElement(DEPageUI.EDT_REF1_FULLNAME, fullnameFirstRef);
        waitForElementVisible(DEPageUI.DRD_REF1_RALATIONSHIP);
        selectItemInDefaultDropdown(DEPageUI.DRD_REF1_RALATIONSHIP, refType);
        waitForElementVisible(DEPageUI.EDT_REF1_MOBILE_PHONE);
        sendKeyToElement(DEPageUI.EDT_REF1_MOBILE_PHONE, phoneNumber);

        waitForElementVisible(DEPageUI.EDT_REF2_FULLNAME);
        sendKeyToElement(DEPageUI.EDT_REF2_FULLNAME, fullnameSecondRef);
        waitForElementVisible(DEPageUI.DRD_REF2_RALATIONSHIP);
        selectItemInDefaultDropdown(DEPageUI.DRD_REF2_RALATIONSHIP, refTypeSencond);
        waitForElementVisible(DEPageUI.EDT_REF2_MOBILE_PHONE);
        sendKeyToElement(DEPageUI.EDT_REF2_MOBILE_PHONE, phoneNumberRef2);
    }

    public void inputMainFinancialCapacity(String cutomerIncome, String customerExpense, String customerNumberDepen, String salaryPamentType) {
        waitForElementVisible(DEPageUI.EDT_CUSTOMER_INCOME);
        sendKeyToElement(DEPageUI.EDT_CUSTOMER_INCOME, cutomerIncome);
        waitForElementVisible(DEPageUI.EDT_CUSTOMER_EXPENSE);
        sendKeyToElement(DEPageUI.EDT_CUSTOMER_EXPENSE, customerExpense);
        waitForElementVisible(DEPageUI.EDT_CUSTOMER_NUMBER_OF_DEPENDANTS);
        sendKeyToElement(DEPageUI.EDT_CUSTOMER_NUMBER_OF_DEPENDANTS, customerNumberDepen);
        waitForElementVisible(DEPageUI.DRD_SALARY_PAYMENT_TYPE);
        selectItemInDefaultDropdown(DEPageUI.DRD_SALARY_PAYMENT_TYPE, salaryPamentType);
    }
}
