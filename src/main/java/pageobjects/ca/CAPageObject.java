package pageobjects.ca;

import commons.BasePage;
import commons.BasePageUI;
import pageuis.ca.CAPageUI;
import pageuis.cb.CBPageUI;

public class CAPageObject extends BasePage {
    public CAPageObject() {
    }

    public void evaluateLoanPurpose(String bill1, String bill2, String bill3) {
        waitForElementVisible(BasePageUI.CASES_FRAME);
        switchToFrameIframe(BasePageUI.CASES_FRAME);
        switchToFrameIframe(BasePageUI.CASES_SUB_FRAME);
        switchToFrameIframe(BasePageUI.CASES_OPEN_FRAME);
        waitForElementVisible(CAPageUI.EDT_BILL_AMOUNT1);
        scrollToElement(CAPageUI.EDT_BILL_AMOUNT1);
        sendKeyToElement(CAPageUI.EDT_BILL_AMOUNT1, bill1);
        waitForElementVisible(CAPageUI.EDT_BILL_AMOUNT2);
        sendKeyToElement(CAPageUI.EDT_BILL_AMOUNT2, bill2);
        waitForElementVisible(CAPageUI.EDT_BILL_AMOUNT3);
        sendKeyToElement(CAPageUI.EDT_BILL_AMOUNT3, bill3);
    }

    public void verifyPersonalInformation(String passportNumber, String idCardNumberOther, String passpord, String passpordComment, String martialStatus, String mobilePhone,
                                          String mobilePhoneDuration, String mobilePhoneDurationOther, String mobilePhoneOther, String education, String email, String livingTimeInMonth, String livingTimeInYear,
                                          String temporaryAddressStreet, String accomodationType) {
        scrollToElement(CAPageUI.EDT_PASSPORT_NUMBER);
        waitForElementVisible(CAPageUI.EDT_PASSPORT_NUMBER);
        sendKeyToElement(CAPageUI.EDT_PASSPORT_NUMBER, passportNumber);
        waitForElementVisible(CAPageUI.EDT_PASSPORT_NUMBER);
        sendKeyToElement(CAPageUI.EDT_IDCARD_NUMBER_OTHER, idCardNumberOther);
        waitForElementVisible(CAPageUI.DRD_PASSPORD);
        selectDropdownByText(CAPageUI.DRD_PASSPORD, passpord);
        waitForElementVisible(CAPageUI.EDT_PASSPORD);
        sendKeyToElement(CAPageUI.EDT_PASSPORD, passpordComment);
        waitForElementVisible(CAPageUI.DRD_MARTIAL_STATUS);
        selectDropdownByText(CAPageUI.DRD_MARTIAL_STATUS, martialStatus);
        waitForElementVisible(CAPageUI.DRD_EDUCATION);
        selectDropdownByText(CAPageUI.DRD_EDUCATION, education);
        scrollToElement(CAPageUI.RDO_MOBILE_OWNER_STATUS_YES);
        waitForElementVisible(CAPageUI.RDO_MOBILE_OWNER_STATUS_YES);
        clickToElement(CAPageUI.RDO_MOBILE_OWNER_STATUS_YES);
        waitForElementVisible(CAPageUI.EDT_MOBILE_PHONE);
        sendKeyToElement(CAPageUI.EDT_MOBILE_PHONE, mobilePhone);
        waitForElementVisible(CAPageUI.EDT_MOBILE_PHONE_DURATION);
        sendKeyToElement(CAPageUI.EDT_MOBILE_PHONE_DURATION, mobilePhoneDuration);
        waitForElementVisible(CAPageUI.EDT_MOBILE_PHONE_OTHER);
        sendKeyToElement(CAPageUI.EDT_MOBILE_PHONE_OTHER, mobilePhoneOther);
        waitForElementVisible(CAPageUI.EDT_MOBILE_PHONE_DURATION_OTHER);
        sendKeyToElement(CAPageUI.EDT_MOBILE_PHONE_DURATION_OTHER, mobilePhoneDurationOther);
        waitForElementVisible(CAPageUI.RDO_MOBILE_ZALO_TYPE_1);
        clickToElement(CAPageUI.RDO_MOBILE_ZALO_TYPE_1);
        waitForElementVisible(CAPageUI.EDT_EMAIL);
        sendKeyToElement(CAPageUI.EDT_EMAIL, email);
        scrollToElement(CAPageUI.EDT_TEMPORARY_ADDRESS_STREET);
        waitForElementVisible(CAPageUI.EDT_TEMPORARY_ADDRESS_STREET);
        sendKeyToElement(CAPageUI.EDT_TEMPORARY_ADDRESS_STREET, temporaryAddressStreet);
        waitForElementVisible(CAPageUI.EDT_LIVING_TIME_IN_YEAR);
        sendKeyToElement(CAPageUI.EDT_LIVING_TIME_IN_YEAR, livingTimeInYear);
        waitForElementVisible(CAPageUI.EDT_LIVING_TIME_IN_MONTH);
        sendKeyToElement(CAPageUI.EDT_LIVING_TIME_IN_MONTH, livingTimeInMonth);
        waitForElementVisible(CAPageUI.DRD_ACCOMMODATION_TYPE);
        selectDropdownByText(CAPageUI.DRD_ACCOMMODATION_TYPE, accomodationType);
        waitForElementVisible(CAPageUI.RDO_PERNAMENT_ADDRESS_STATUS_YES);
        clickToElement(CAPageUI.RDO_PERNAMENT_ADDRESS_STATUS_YES);

    }


    public void appraisalOfIncomeAndExpenditure(String job, String companyName, String companyPhoneNumber, String companyPhoneNumberExt, String companyTaxNumber,
                                                String customerExpense, String customerMainIncome, String department, String position, String bussinessAddress, String salaryMonthRevice, String salaryPaymentType,
                                                String labourContractType, String workingInMonth, String workingInYear, String experienceInMonth, String experienceInYear, String numberOfDependant, String incomeResource, String industry) {
        scrollToElement(CAPageUI.DRD_JOB);
        waitForElementVisible(CAPageUI.DRD_JOB);
        selectDropdownByText(CAPageUI.DRD_JOB, job);
        waitForElementVisible(CAPageUI.EDT_COMPANY_NAME);
        sendKeyToElement(CAPageUI.EDT_COMPANY_NAME, companyName);
        waitForElementVisible(CAPageUI.EDT_DEPARTMENT);
        sendKeyToElement(CAPageUI.EDT_DEPARTMENT, department);
        waitForElementVisible(CAPageUI.DRD_POSITION);
        selectDropdownByText(CAPageUI.DRD_POSITION, position);
        waitForElementVisible(CAPageUI.DRD_INDUSTRY);
        selectDropdownByText(CAPageUI.DRD_INDUSTRY, industry);
        waitForElementVisible(CAPageUI.EDT_COMPANY_PHONE_NUMBER);
        sendKeyToElement(CAPageUI.EDT_COMPANY_PHONE_NUMBER, companyPhoneNumber);
        waitForElementVisible(CAPageUI.EDT_COMPANY_PHONE_NUMBER_EXT);
        sendKeyToElement(CAPageUI.EDT_COMPANY_PHONE_NUMBER_EXT, companyPhoneNumberExt);
        waitForElementVisible(CAPageUI.EDT_COMPANY_TAX_NUMBER);
        sendKeyToElement(CAPageUI.EDT_COMPANY_TAX_NUMBER, companyTaxNumber);
        waitForElementVisible(CAPageUI.DRD_BUSSINESS_ADDRESS);
        selectDropdownByText(CAPageUI.DRD_BUSSINESS_ADDRESS, bussinessAddress);
        waitForElementVisible(CAPageUI.DRD_SALARY_PAYMENT_TYPE);
        selectDropdownByText(CAPageUI.DRD_SALARY_PAYMENT_TYPE, salaryPaymentType);
        waitForElementVisible(CAPageUI.EDT_SALARY_MONTH_REVICE);
        sendKeyToElement(CAPageUI.EDT_SALARY_MONTH_REVICE, salaryMonthRevice);
        waitForElementVisible(CAPageUI.DRD_LABOUR_CONTRACT_TYPE);
        selectDropdownByText(CAPageUI.DRD_LABOUR_CONTRACT_TYPE, labourContractType);
        waitForElementVisible(CAPageUI.EDT_WORKING_IN_YEAR);
        sendKeyToElement(CAPageUI.EDT_WORKING_IN_YEAR, workingInYear);
        waitForElementVisible(CAPageUI.EDT_WORKING_IN_MONTH);
        sendKeyToElement(CAPageUI.EDT_WORKING_IN_MONTH, workingInMonth);
        waitForElementVisible(CAPageUI.EDT_EXPERIENECE_IN_YEAR);
        sendKeyToElement(CAPageUI.EDT_EXPERIENECE_IN_YEAR, experienceInYear);
        waitForElementVisible(CAPageUI.EDT_EXPERIENECE_IN_MONTH);
        sendKeyToElement(CAPageUI.EDT_EXPERIENECE_IN_MONTH, experienceInMonth);
        waitForElementVisible(CAPageUI.RDO_WORKING_ADDRESS_STATUS_YES);
        clickToElement(CAPageUI.RDO_WORKING_ADDRESS_STATUS_YES);
        waitForElementVisible(CAPageUI.RDO_COMPANY_ADDRESS_STATUS_YES);
        clickToElement(CAPageUI.RDO_COMPANY_ADDRESS_STATUS_YES);
        scrollToElement(CAPageUI.EDT_CUSTOMER_MAIN_INCOME);
        waitForElementVisible(CAPageUI.EDT_CUSTOMER_MAIN_INCOME);
        sendKeyToElement(CAPageUI.EDT_CUSTOMER_MAIN_INCOME, customerMainIncome);
        scrollToElement(CAPageUI.EDT_NUMBER_OF_DEPENDANT);
        waitForElementVisible(CAPageUI.EDT_NUMBER_OF_DEPENDANT);
        sendKeyToElement(CAPageUI.EDT_NUMBER_OF_DEPENDANT, numberOfDependant);
        waitForElementVisible(CAPageUI.EDT_CUSTOMER_EXPENSE);
        sendKeyToElement(CAPageUI.EDT_CUSTOMER_EXPENSE, customerExpense);
        waitForElementVisible(CAPageUI.DRD_INCOME_RESOURCE);
        selectDropdownByText(CAPageUI.DRD_INCOME_RESOURCE, incomeResource);
    }

    public void evaluateReferences(String re1FullName, String re1MobilePhone, String re1Relationship, String re2FullName, String re2MobilePhone, String re2Relationship) {

        scrollToElement(CAPageUI.EDT_RE_1_FULLNAME);
        waitForElementVisible(CAPageUI.EDT_RE_1_FULLNAME);
        sendKeyToElement(CAPageUI.EDT_RE_1_FULLNAME, re1FullName);
        waitForElementVisible(CAPageUI.EDT_RE_1_MOBILEPHONE);
        sendKeyToElement(CAPageUI.EDT_RE_1_MOBILEPHONE, re1MobilePhone);
        waitForElementVisible(CAPageUI.DRD_RE_1_RELATIONSHIP);
        selectDropdownByText(CAPageUI.DRD_RE_1_RELATIONSHIP, re1Relationship);
        waitForElementVisible(CAPageUI.EDT_RE_2_FULLNAME);
        sendKeyToElement(CAPageUI.EDT_RE_2_FULLNAME, re2FullName);
        waitForElementVisible(CAPageUI.EDT_RE_2_MOBILEPHONE);
        sendKeyToElement(CAPageUI.EDT_RE_2_MOBILEPHONE, re2MobilePhone);
        waitForElementVisible(CAPageUI.DRD_RE_2_RELATIONSHIP);
        selectDropdownByText(CAPageUI.DRD_RE_2_RELATIONSHIP, re2Relationship);
    }


    public void accessFamilyInformation(String s37CINumberSpouse, String s37ResultSpouse, String s37UpdateDateSpouse, String spouseCompanyName, String spouseCompanyPhoneNumber,
                                        String spouseIdCardNumber, String spouseInCome, String spouseMobliePhone, String spouseName) {

        scrollToElement(CAPageUI.EDT_SPOUSE_NAME);
        waitForElementVisible(CAPageUI.EDT_SPOUSE_NAME);
        sendKeyToElement(CAPageUI.EDT_SPOUSE_NAME, spouseName);
        waitForElementVisible(CAPageUI.EDT_SPOUSE_MOBILEPHONE);
        sendKeyToElement(CAPageUI.EDT_SPOUSE_MOBILEPHONE, spouseMobliePhone);
        waitForElementVisible(CAPageUI.EDT_SPOUSE_ID_CARD_NUMBER);
        sendKeyToElement(CAPageUI.EDT_SPOUSE_ID_CARD_NUMBER, spouseIdCardNumber);
        waitForElementVisible(CAPageUI.EDT_SPOUSE_INCOME);
        sendKeyToElement(CAPageUI.EDT_SPOUSE_INCOME, spouseInCome);
        waitForElementVisible(CAPageUI.EDT_SPOUSE_COMPANY_NAME);
        sendKeyToElement(CAPageUI.EDT_SPOUSE_COMPANY_NAME, spouseCompanyName);
        waitForElementVisible(CAPageUI.EDT_SPOUSE_COMPANY_PHONE_NUMBER);
        sendKeyToElement(CAPageUI.EDT_SPOUSE_COMPANY_PHONE_NUMBER, spouseCompanyPhoneNumber);
        waitForElementVisible(CAPageUI.BTN_CHECK_CIC_S37);
        clickToElementByJS(CAPageUI.BTN_CHECK_CIC_S37);
        waitForElementVisible(CAPageUI.BTN_CLOSE);
        clickToElement(CAPageUI.BTN_CLOSE);
        waitForElementVisible(CAPageUI.DRD_S37_RESULT_SPOUSE);
        selectDropdownByText(CAPageUI.DRD_S37_RESULT_SPOUSE, s37ResultSpouse);
        waitForElementVisible(CAPageUI.EDT_S37_CINUMBER_SPOUSE);
        sendKeyToElement(CAPageUI.EDT_S37_CINUMBER_SPOUSE, s37CINumberSpouse);
        waitForElementVisible(CAPageUI.EDT_S37_UPDATE_DATE_SPOUSE);
        sendKeyToElement(CAPageUI.EDT_S37_UPDATE_DATE_SPOUSE, s37UpdateDateSpouse);
    }


    public void PCBResult(String itemPCBResult, String numberContractPending, String numberContractReject, String numberContractCancel, String numberContractComplete,
                          String numberOverDueDay, String numberOverDueLoanAmount, String numberOverDueDayMax, String numberOverDueLoanAmountMax, String numberOverDueDateMax, String numberReQuestIn3Month,
                          String numberRejectIn3Month, String numberRejectIn6Month, String numberRequestIn6Month, String numberPCB, String numberOtherPCB, String loanAmountST, String emist, String termst,
                          String loanAmountMT, String emimt, String termmt, String otherLoanAmountST, String otherEmist, String otherTermst, String otherLoanAmountMT, String otherEmiMT, String otherTermMT,
                          String creditCardLoanAmount, String pcbScoreOption, String pcbScaleScoreOption, String riskassesmentOption, String pcbUpdateDate) {

        waitForElementVisible(CBPageUI.BTN_CHECK_PCB);
        scrollToElement(CBPageUI.BTN_CHECK_PCB);
        clickToElement(CBPageUI.BTN_CHECK_PCB);
        waitForPMModalLoadingInvisible();
        waitForElementVisible(CBPageUI.RDO_PCB_YES);
        scrollToElement(CBPageUI.RDO_PCB_YES);
        clickToElementByJS(CBPageUI.RDO_PCB_YES);
        sleepInSecond(5);
        waitForPMModalLoadingVisible();
        waitForPMModalLoadingInvisible();
        sleepInSecond(5);
        scrollToElement(CBPageUI.EDT_CONTRACT_PENDING);
        waitForElementVisible(CBPageUI.EDT_CONTRACT_PENDING);
        sendkeyToElementByJS(CBPageUI.EDT_CONTRACT_PENDING, numberContractPending);
        waitForElementVisible(CBPageUI.DRD_PCB_RESULT);
        scrollToElement(CBPageUI.DRD_PCB_RESULT);
        selectDropdownByText(CBPageUI.DRD_PCB_RESULT, itemPCBResult);
        waitForElementVisible(CBPageUI.EDT_PCB_CONTRACT_REJECT);
        scrollToElement(CBPageUI.EDT_PCB_CONTRACT_REJECT);
        sendKeyToElement(CBPageUI.EDT_PCB_CONTRACT_REJECT, numberContractReject);
        waitForElementVisible(CBPageUI.EDT_PCB_CONTRACT_CANCEL);
//		scrollToElement(CBPageUI.EDT_PCB_CONTRACT_CANCEL);
        sendKeyToElement(CBPageUI.EDT_PCB_CONTRACT_CANCEL, numberContractCancel);
        waitForElementVisible(CBPageUI.EDT_PCB_CONTRACT_COMPLETE);
//		scrollToElement(CBPageUI.EDT_PCB_CONTRACT_COMPLETE);
        sendKeyToElement(CBPageUI.EDT_PCB_CONTRACT_COMPLETE, numberContractComplete);
        waitForElementVisible(CBPageUI.EDT_PCB_CONTRACT_COMPLETE);
        scrollToElement(CBPageUI.EDT_PCB_CONTRACT_COMPLETE);
        sendKeyToElement(CBPageUI.EDT_PCB_CONTRACT_COMPLETE, numberContractComplete);
        waitForElementVisible(CBPageUI.EDT_PCB_OVERDUEDAY_NUMBER);
        scrollToElement(CBPageUI.EDT_PCB_OVERDUEDAY_NUMBER);
        sendKeyToElement(CBPageUI.EDT_PCB_OVERDUEDAY_NUMBER, numberOverDueDay);
        waitForElementVisible(CBPageUI.EDT_PCB_OVER_DUE_LOAN_AMOUNT);
        scrollToElement(CBPageUI.EDT_PCB_OVER_DUE_LOAN_AMOUNT);
        sendKeyToElement(CBPageUI.EDT_PCB_OVER_DUE_LOAN_AMOUNT, numberOverDueLoanAmount);
        waitForElementVisible(CBPageUI.EDT_PCB_OVERDUEDAYMAX_NUMBER);
        scrollToElement(CBPageUI.EDT_PCB_OVERDUEDAYMAX_NUMBER);
        sendKeyToElement(CBPageUI.EDT_PCB_OVERDUEDAYMAX_NUMBER, numberOverDueDayMax);
        waitForElementVisible(CBPageUI.EDT_PCB_OVER_DUE_LOAN_AMOUNT_MAX);
        scrollToElement(CBPageUI.EDT_PCB_OVER_DUE_LOAN_AMOUNT_MAX);
        sendKeyToElement(CBPageUI.EDT_PCB_OVER_DUE_LOAN_AMOUNT_MAX, numberOverDueLoanAmountMax);
        waitForElementVisible(CBPageUI.EDT_PCB_OVERDUEDATEMAX);
        scrollToElement(CBPageUI.EDT_PCB_OVERDUEDATEMAX);
        sendKeyToElement(CBPageUI.EDT_PCB_OVERDUEDATEMAX, numberOverDueDateMax);
        waitForElementVisible(CBPageUI.EDT_PCB_NUMBER_REQUEST_IN_3_MONTH);
        scrollToElement(CBPageUI.EDT_PCB_NUMBER_REQUEST_IN_3_MONTH);
        sendKeyToElement(CBPageUI.EDT_PCB_NUMBER_REQUEST_IN_3_MONTH, numberReQuestIn3Month);
        waitForElementVisible(CBPageUI.EDT_PCB_NUMBER_REJECT_IN_3_MONTH);
        scrollToElement(CBPageUI.EDT_PCB_NUMBER_REJECT_IN_3_MONTH);
        sendKeyToElement(CBPageUI.EDT_PCB_NUMBER_REJECT_IN_3_MONTH, numberRejectIn3Month);
        waitForElementVisible(CBPageUI.EDT_PCB_NUMBER_REQUEST_IN_6_MONTH);
        scrollToElement(CBPageUI.EDT_PCB_NUMBER_REQUEST_IN_6_MONTH);
        sendKeyToElement(CBPageUI.EDT_PCB_NUMBER_REQUEST_IN_6_MONTH, numberRequestIn6Month);
        waitForElementVisible(CBPageUI.EDT_PCB_NUMBER_REJECT_IN_6_MONTH);
        scrollToElement(CBPageUI.EDT_PCB_NUMBER_REJECT_IN_6_MONTH);
        sendKeyToElement(CBPageUI.EDT_PCB_NUMBER_REJECT_IN_6_MONTH, numberRejectIn6Month);
        waitForElementVisible(CBPageUI.EDT_PCB_NUMBER);
        scrollToElement(CBPageUI.EDT_PCB_NUMBER);
        sendKeyToElement(CBPageUI.EDT_PCB_NUMBER, numberPCB);
        waitForElementVisible(CBPageUI.EDT_PCB_OTHER_NUMBER);
        scrollToElement(CBPageUI.EDT_PCB_OTHER_NUMBER);
        sendKeyToElement(CBPageUI.EDT_PCB_OTHER_NUMBER, numberOtherPCB);
        waitForElementVisible(CBPageUI.EDT_PCB_LOAN_AMOUNTST);
        scrollToElement(CBPageUI.EDT_PCB_LOAN_AMOUNTST);
        sendKeyToElement(CBPageUI.EDT_PCB_LOAN_AMOUNTST, loanAmountST);
        waitForElementVisible(CBPageUI.EDT_PCB_EMIST);
        scrollToElement(CBPageUI.EDT_PCB_EMIST);
        sendKeyToElement(CBPageUI.EDT_PCB_EMIST, emist);
        waitForElementVisible(CBPageUI.EDT_PCB_TERMST);
        scrollToElement(CBPageUI.EDT_PCB_TERMST);
        sendKeyToElement(CBPageUI.EDT_PCB_TERMST, termst);
        waitForElementVisible(CBPageUI.EDT_PCB_LOAN_AMOUNTMT);
        scrollToElement(CBPageUI.EDT_PCB_LOAN_AMOUNTMT);
        sendKeyToElement(CBPageUI.EDT_PCB_LOAN_AMOUNTMT, loanAmountMT);
        waitForElementVisible(CBPageUI.EDT_PCB_EMIMT);
        scrollToElement(CBPageUI.EDT_PCB_EMIMT);
        sendKeyToElement(CBPageUI.EDT_PCB_EMIMT, emimt);
        waitForElementVisible(CBPageUI.EDT_PCB_TERMMT);
        scrollToElement(CBPageUI.EDT_PCB_TERMMT);
        sendKeyToElement(CBPageUI.EDT_PCB_TERMMT, termmt);
        waitForElementVisible(CBPageUI.EDT_PCB_OTHER_LOAN_AMOUNT_ST);
        scrollToElement(CBPageUI.EDT_PCB_OTHER_LOAN_AMOUNT_ST);
        sendKeyToElement(CBPageUI.EDT_PCB_OTHER_LOAN_AMOUNT_ST, otherLoanAmountST);
        waitForElementVisible(CBPageUI.EDT_PCB_OTHER_EMIST);
        scrollToElement(CBPageUI.EDT_PCB_OTHER_EMIST);
        sendKeyToElement(CBPageUI.EDT_PCB_OTHER_EMIST, otherEmist);
        waitForElementVisible(CBPageUI.EDT_PCB_OTHER_TERMST);
        scrollToElement(CBPageUI.EDT_PCB_OTHER_TERMST);
        sendKeyToElement(CBPageUI.EDT_PCB_OTHER_TERMST, otherTermst);
        waitForElementVisible(CBPageUI.EDT_PCB_OTHER_LOAN_AMOUNTMT);
        scrollToElement(CBPageUI.EDT_PCB_OTHER_LOAN_AMOUNTMT);
        sendKeyToElement(CBPageUI.EDT_PCB_OTHER_LOAN_AMOUNTMT, otherLoanAmountMT);
        waitForElementVisible(CBPageUI.EDT_PCB_OTHER_EMIMT);
        scrollToElement(CBPageUI.EDT_PCB_OTHER_EMIMT);
        sendKeyToElement(CBPageUI.EDT_PCB_OTHER_EMIMT, otherEmiMT);
        waitForElementVisible(CBPageUI.EDT_PCB_OTHER_TERMMT);
        scrollToElement(CBPageUI.EDT_PCB_OTHER_TERMMT);
        sendKeyToElement(CBPageUI.EDT_PCB_OTHER_TERMMT, otherTermMT);
        waitForElementVisible(CBPageUI.EDT_PCB_CREDIT_CARD_LOAN_AMOUNT);
        scrollToElement(CBPageUI.EDT_PCB_CREDIT_CARD_LOAN_AMOUNT);
        sendKeyToElement(CBPageUI.EDT_PCB_CREDIT_CARD_LOAN_AMOUNT, creditCardLoanAmount);
        waitForElementVisible(CBPageUI.DRD_PCB_SCORE);
        scrollToElement(CBPageUI.DRD_PCB_SCORE);
        selectDropdownByText(CBPageUI.DRD_PCB_SCORE, pcbScoreOption);
        waitForElementVisible(CBPageUI.DRD_PCB_SCALE_SCORE);
        scrollToElement(CBPageUI.DRD_PCB_SCALE_SCORE);
        selectDropdownByText(CBPageUI.DRD_PCB_SCALE_SCORE, pcbScaleScoreOption);
        waitForElementVisible(CBPageUI.DRD_PCB_RISKASSESMENT);
        scrollToElement(CBPageUI.DRD_PCB_RISKASSESMENT);
        selectDropdownByText(CBPageUI.DRD_PCB_RISKASSESMENT, riskassesmentOption);
        waitForElementVisible(CBPageUI.EDT_PCB_UPDATE_DATE);
        scrollToElement(CBPageUI.EDT_PCB_UPDATE_DATE);
        sendKeyToElement(CBPageUI.DRD_PCB_RISKASSESMENT, pcbUpdateDate);
    }


    public void CICResult(String CICDrdOption, String img1PCBPath, String img2PCBPath, String img1CICPath, String img2CICPath) {
        waitForElementVisible(CBPageUI.DRD_CIC_RESULT);
        scrollToElement(CBPageUI.DRD_CIC_RESULT);
        selectDropdownByText(CBPageUI.DRD_CIC_RESULT, CICDrdOption);
//        waitForElementVisible(CBPageUI.CHECKBOX_BANK_OCB);
//        scrollToElement(CBPageUI.CHECKBOX_BANK_OCB);
//        clickToElement(CBPageUI.CHECKBOX_BANK_OCB);
//        waitForElementVisible(CBPageUI.CHECKBOX_OTHER);
//        scrollToElement(CBPageUI.CHECKBOX_OTHER);
//        clickToElement(CBPageUI.CHECKBOX_OTHER);

//		scrollToElement(CBPageUI.INPUT_PCB_RESULT_IMG2);
//		waitForElementVisible(CBPageUI.INPUT_PCB_RESULT_IMG2);
        uploadImage(CAPageUI.INPUT_CIC_IMG_1, img1CICPath);
        waitForElementVisible(CAPageUI.INPUT_CIC_IMG_1_NAME);


//		scrollToElement(CBPageUI.INPUT_CIC_RESULT_IMG1);
//		waitForElementVisible(CBPageUI.INPUT_CIC_RESULT_IMG1);
        uploadImage(CAPageUI.INPUT_CIC_IMG_2, img2CICPath);
        waitForElementVisible(CAPageUI.INPUT_CIC_IMG_2_NAME);

//		scrollToElement(CBPageUI.INPUT_CIC_RESULT_IMG2);
//		waitForElementVisible(CBPageUI.INPUT_CIC_RESULT_IMG2);
        uploadImage(CAPageUI.INPUT_PCB_IMG_1, img1PCBPath);
        waitForElementVisible(CAPageUI.INPUT_PCB_IMG_1_NAME);

//		scrollToElement(CBPageUI.INPUT_FILE_S37_IMG);
//		waitForElementVisible(CBPageUI.INPUT_FILE_S37_IMG);
        uploadImage(CAPageUI.INPUT_PCB_IMG_2, img2PCBPath);
        waitForElementVisible(CAPageUI.INPUT_PCB_IMG_2_NAME);

//		sleepInSecond(60);

    }


    public void additionalApparaisalInformation(String taxCodeResult, String socialNetworkResult, String healtInsuranceResult, String s37PCBRelative) {

        scrollToElement(CAPageUI.DRD_TAX_CODE_RESULT);
        waitForElementVisible(CAPageUI.DRD_TAX_CODE_RESULT);
        selectDropdownByText(CAPageUI.DRD_TAX_CODE_RESULT, taxCodeResult);
        waitForElementVisible(CAPageUI.DRD_SOCIAL_NETWORK_RESULT);
        selectDropdownByText(CAPageUI.DRD_SOCIAL_NETWORK_RESULT, socialNetworkResult);
        waitForElementVisible(CAPageUI.DRD_HEALT_INSURANCE_RESULT);
        selectDropdownByText(CAPageUI.DRD_HEALT_INSURANCE_RESULT, healtInsuranceResult);
        waitForElementVisible(CAPageUI.DRD_HEALT_INSURANCE_RESULT);
        selectDropdownByText(CAPageUI.DRD_HEALT_INSURANCE_RESULT, healtInsuranceResult);
        sendKeyToElement(CAPageUI.EDT_S37_PCB_RELATIVE, s37PCBRelative);
    }


    public void concludeCA(String emimtBank, String emimtOther, String emistBank, String emistOther, String loanConsumerCA, String loanTermCA,
                           String caDescision, String commentCA, String creditHistory, String customerEmimtFC, String customerEmistFC) {
        scrollToElement(CAPageUI.EDT_CUSTOMER_EMIST_BANK);
        waitForElementVisible(CAPageUI.EDT_CUSTOMER_EMIST_BANK);
        sendKeyToElement(CAPageUI.EDT_CUSTOMER_EMIST_BANK, emistBank);
        waitForElementVisible(CAPageUI.EDT_CUSTOMER_EMIMT_BANK);
        sendKeyToElement(CAPageUI.EDT_CUSTOMER_EMIMT_BANK, emimtBank);
        waitForElementVisible(CAPageUI.EDT_CUSTOMER_EMISTFC);
        sendKeyToElement(CAPageUI.EDT_CUSTOMER_EMISTFC, customerEmistFC);
        waitForElementVisible(CAPageUI.EDT_CUSTOMER_EMIMTFC);
        sendKeyToElement(CAPageUI.EDT_CUSTOMER_EMIMTFC, customerEmimtFC);
        waitForElementVisible(CAPageUI.EDT_CUSTOMER_EMIST_OTHER);
        sendKeyToElement(CAPageUI.EDT_CUSTOMER_EMIST_OTHER, emistOther);
        waitForElementVisible(CAPageUI.EDT_CUSTOMER_EMIMT_OTHER);
        sendKeyToElement(CAPageUI.EDT_CUSTOMER_EMIMT_OTHER, emimtOther);
        scrollToElement(CAPageUI.EDT_LOAN_CONSUMER_CA);
        waitForElementVisible(CAPageUI.EDT_LOAN_CONSUMER_CA);
        sendKeyToElement(CAPageUI.EDT_LOAN_CONSUMER_CA, loanConsumerCA);
        waitForElementVisible(CAPageUI.DRD_LOAN_TERM_CA);
        selectDropdownByText(CAPageUI.DRD_LOAN_TERM_CA, loanTermCA);
        waitForElementVisible(CAPageUI.DRD_CA_CREDIT_HISTORY);
        selectDropdownByText(CAPageUI.DRD_CA_CREDIT_HISTORY, creditHistory);
        waitForElementVisible(CAPageUI.RDO_CONTRACT_PAYMENT_IN_6_MONTH_YES);
        clickToElement(CAPageUI.RDO_CONTRACT_PAYMENT_IN_6_MONTH_YES);
        waitForElementVisible(CAPageUI.RDO_MATCHING_CREDIT_INFO_ADDRESS_YES);
        clickToElement(CAPageUI.RDO_MATCHING_CREDIT_INFO_ADDRESS_YES);
        waitForElementVisible(CAPageUI.RDO_MATCHING_CREDIT_INFO_PHONE_YES);
        clickToElement(CAPageUI.RDO_MATCHING_CREDIT_INFO_PHONE_YES);
        scrollToElement(CBPageUI.BTN_SYSTEM_SUGGEST);
        waitForElementVisible(CBPageUI.BTN_SYSTEM_SUGGEST);
        clickToElement(CBPageUI.BTN_SYSTEM_SUGGEST);
        waitForPMModalLoadingInvisible();
        waitForElementVisible(CBPageUI.BTN_OK);
        clickToElementByJS(CBPageUI.BTN_OK);
        waitForElementVisible(CAPageUI.DRD_CA_DECISION);
        selectDropdownByText(CAPageUI.DRD_CA_DECISION, caDescision);
        waitForElementVisible(CAPageUI.BTN_CA_CHECK_CODE_FIELD);
        clickToElement(CAPageUI.BTN_CA_CHECK_CODE_FIELD);
        sleepInSecond(3);
        waitForPMModalLoadingInvisible();
//        scrollToElement(CAPageUI.RDO_CA_CHECK_CODE_FIELD);
//        waitForElementVisible(CAPageUI.RDO_CA_CHECK_CODE_FIELD);
//        clickToElementByJS(CAPageUI.RDO_CA_CHECK_CODE_FIELD);
//		waitForElementVisible(CAPageUI.EDT_CA_COMMENT);
//		sendKeyToElement(CAPageUI.EDT_CA_COMMENT, commentCA);

    }
}
	
	
	
		
	


