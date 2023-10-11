package pageuis.ca;

public class CAPageUI {
	
	//Block Tham Dinh Thong Tin Ca Nhan
	public static final String EDT_BILL_AMOUNT1 = "//input[@id='form[billAmount1]']";
	public static final String EDT_BILL_AMOUNT2 = "//input[@id='form[billAmount2]']";
	public static final String EDT_BILL_AMOUNT3 = "//input[@id='form[billAmount3]']";
	public static final String EDT_PASSPORT_NUMBER = "//input[@id='form[passportNumber]']";
	public static final String EDT_IDCARD_NUMBER_OTHER = "//input[@id='form[idCardNumberOther]']";
	public static final String DRD_PASSPORD = "//select[@id='form[passportId][1][passportReasonCode]']";
	public static final String EDT_PASSPORD = "//input[@id='form[passportId][1][passportValueReason]']";
	public static final String DRD_MARTIAL_STATUS = "//select[@id='form[maritalStatus]']";
	public static final String DRD_EDUCATION = "//select[@id='form[education]']";
	public static final String RDO_MOBILE_OWNER_STATUS_YES = "//span[text()='Chính chủ']//preceding-sibling::input[@id='form[mobileOwnerStatus]']";
	public static final String RDO_MOBILE_OWNER_STATUS_NO = "//span[text()='Không chính chủ']//preceding-sibling::input[@id='form[mobileOwnerStatus]']";
	public static final String EDT_MOBILE_PHONE = "//input[@id='form[mobilePhone]']";
	public static final String EDT_MOBILE_PHONE_DURATION = "//input[@id='form[mobilePhoneDuration]']";
	public static final String EDT_MOBILE_PHONE_OTHER = "//input[@id='form[mobilePhoneOther]']";
	public static final String EDT_MOBILE_PHONE_DURATION_OTHER = "//input[@id='form[mobilePhoneOtherDuration]']";
	public static final String RDO_MOBILE_ZALO_TYPE_1 = "//span[text()='Giống số điện thoại 1']//preceding-sibling::input[@id='form[mobileZaloType]']";
	public static final String RDO_MOBILE_ZALO_TYPE_2 = "//span[text()='Giống số điện thoại 2']//preceding-sibling::input[@id='form[mobileZaloType]']";
	public static final String RDO_MOBILE_ZALO_TYPE_3 = "//span[text()='Khác']//preceding-sibling::input[@id='form[mobileZaloType]']";
	public static final String EDT_EMAIL = "//input[@id='form[email]']";
	public static final String EDT_TEMPORARY_ADDRESS_STREET = "//input[@id='form[temporaryAddressStreet]']";
	public static final String EDT_LIVING_TIME_IN_YEAR = "//input[@id='form[livingTimeInYear]']";
	public static final String EDT_LIVING_TIME_IN_MONTH = "//input[@id='form[livingTimeInMonth]']";
	public static final String DRD_ACCOMMODATION_TYPE = "//select[@id='form[accommodationType]']";
	public static final String RDO_PERNAMENT_ADDRESS_STATUS_YES = "//span[text()='Giống địa chỉ sinh sống']//preceding-sibling::input[@id='form[permanentAddressStatus]']";
	public static final String RDO_PERNAMENT_ADDRESS_STATUS_NO = "//span[text()='Khác địa chỉ sinh sống']//preceding-sibling::input[@id='form[permanentAddressStatus]']";
	
	//Block Tham Dinh Thu Nhap, Chi Tieu
	public static final String DRD_JOB = "//select[@id='form[job]']";
	public static final String EDT_COMPANY_NAME = "//input[@id='form[companyName]']";
	public static final String EDT_DEPARTMENT = "//input[@id='form[department]']";
	public static final String DRD_POSITION = "//select[@id='form[position]']";
	public static final String DRD_INDUSTRY = "//select[@id='form[industry]']";
	public static final String EDT_COMPANY_PHONE_NUMBER = "//input[@id='form[companyPhoneNumber]']";
	public static final String EDT_COMPANY_PHONE_NUMBER_EXT = "//input[@id='form[companyPhoneNumberExt]']";
	public static final String EDT_COMPANY_TAX_NUMBER = "//input[@id='form[companyTaxNumber]']";
	public static final String DRD_BUSSINESS_ADDRESS = "//select[@id='form[businessAddress]']";
	public static final String DRD_SALARY_PAYMENT_TYPE = "//select[@id='form[salaryPaymentType]']";
	public static final String EDT_SALARY_MONTH_REVICE = "//input[@id='form[salaryMonthyReceive]']";
	public static final String DRD_LABOUR_CONTRACT_TYPE = "//select[@id='form[labourContractType]']";
	public static final String EDT_WORKING_IN_YEAR = "//input[@id='form[workingInYear]']";
	public static final String EDT_WORKING_IN_MONTH = "//input[@id='form[workingInMonth]']";
	public static final String EDT_EXPERIENECE_IN_YEAR = "//input[@id='form[experienceInYear]']";
	public static final String EDT_EXPERIENECE_IN_MONTH = "//input[@id='form[experienceInMonth]']";
	public static final String RDO_WORKING_ADDRESS_STATUS_YES = "//span[text()='Giống địa chỉ sinh sống']//preceding-sibling::input[@id='form[workingAddressStatus]']";
	public static final String RDO_WORKING_ADDRESS_STATUS_NO = "//span[text()='Khác địa chỉ sinh sống']//preceding-sibling::input[@id='form[workingAddressStatus]']";
	public static final String RDO_COMPANY_ADDRESS_STATUS_YES = "//span[text()='Giống địa chỉ làm việc']//preceding-sibling::input[@id='form[companyAddressStatus]']";
	public static final String RDO_COMPANY_ADDRESS_STATUS_NO = "//span[text()='Khác địa chỉ làm việc']//preceding-sibling::input[@id='form[workingAddressStatus]']";
	public static final String EDT_NUMBER_OF_DEPENDANT = "//input[@id='form[numberOfDependants]']";
	public static final String EDT_CUSTOMER_MAIN_INCOME = "//input[@id='form[customerMainIncome]']";
	public static final String EDT_CUSTOMER_EXPENSE = "//input[@id='form[customerExpense]']";
	public static final String DRD_INCOME_RESOURCE = "//select[@id='form[incomeResource]']";
	
	//Block Tham Dinh Nguoi Tham Chieu
	public static final String EDT_RE_1_FULLNAME = "//input[@id='form[ref1FullName]']";
	public static final String EDT_RE_2_FULLNAME = "//input[@id='form[ref2FullName]']";
	public static final String EDT_RE_1_MOBILEPHONE = "//input[@id='form[ref1MobilePhone]']";
	public static final String EDT_RE_2_MOBILEPHONE = "//input[@id='form[ref2MobilePhone]']";
	public static final String DRD_RE_1_RELATIONSHIP = "//select[@id='form[ref1Relationship]']";
	public static final String DRD_RE_2_RELATIONSHIP = "//select[@id='form[ref2Relationship]']";
	
	//Block Tham Dinh Thong Tin Gia Dinh
	public static final String EDT_SPOUSE_NAME = "//input[@id='form[spouseName]']";
	public static final String EDT_SPOUSE_MOBILEPHONE = "//input[@id='form[spouseMobilePhone]']";
	public static final String EDT_SPOUSE_ID_CARD_NUMBER = "//input[@id='form[spouseIdCardNumber]']";
	public static final String EDT_SPOUSE_INCOME = "//input[@id='form[spouseIncome]']";
	public static final String EDT_SPOUSE_COMPANY_NAME = "//input[@id='form[spouseCompanyName]']";
	public static final String EDT_SPOUSE_COMPANY_PHONE_NUMBER = "//input[@id='form[spouseCompanyPhoneNumber]']";
	public static final String BTN_CHECK_CIC_S37 = "//button[@id='form[btnGetS37ReportSpouse]']";
	public static final String BTN_CLOSE = "//button[text()='CLOSE']";
	public static final String DRD_S37_RESULT_SPOUSE = "//select[@id='form[s37ResultSpouse]']";
	public static final String EDT_S37_CINUMBER_SPOUSE = "//input[@id='form[s37CINumberSpouse]']";
	public static final String EDT_S37_UPDATE_DATE_SPOUSE = "//input[@id='form[s37UpdateDateSpouse]']";
	
	
	//Block Thong Tin Tham Dinh Bo Sung
	public static final String DRD_TAX_CODE_RESULT = "//select[@id='form[taxCodeResult]']";
	public static final String DRD_SOCIAL_NETWORK_RESULT = "//select[@id='form[socialNetworkResult]']";
	public static final String DRD_HEALT_INSURANCE_RESULT = "//select[@id='form[healthInsuranceResult]']";
	public static final String EDT_TAX_CODE_ISSUE_DATE = "//input[@id='form[taxCodeIssueDate]']";
	public static final String EDT_CUSTOMER_TAX_CODE = "//input[@id='form[customerTaxCode]']";
	public static final String EDT_TAX_CODE_ISSUE_PLACE = "//input[@id='form[taxCodeIssuePlace]']";
	public static final String EDT_S37_PCB_RELATIVE = "//textarea[@id='form[s37PcbRelative]']";
	
	
	//Block Ket Qua PCB
	public static final String INPUT_CIC_IMG_1 = "//form[@id='CallAppraisalCICResultPhoto']//input[@type='file']";
	public static final String INPUT_CIC_IMG_2 = "//form[@id='CallAppraisalOtherCICResultPhoto']//input[@type='file']";
	public static final String INPUT_PCB_IMG_1 = "//form[@id='CallAppraisalPCBResultPhoto']//input[@type='file']";
	public static final String INPUT_PCB_IMG_2 = "//form[@id='CallAppraisalPOtherCBResultPhoto']//input[@type='file']";
	
	//
	public static final String INPUT_CIC_IMG_1_NAME = "//form[@id='CallAppraisalCICResultPhoto']//a";
	public static final String INPUT_CIC_IMG_2_NAME = "//form[@id='CallAppraisalOtherCICResultPhoto']//a";
	public static final String INPUT_PCB_IMG_1_NAME = "//form[@id='CallAppraisalPCBResultPhoto']//a";
	public static final String INPUT_PCB_IMG_2_NAME = "//form[@id='CallAppraisalPOtherCBResultPhoto']//a";
	
	
	
	//Block Ket Luan
	public static final String EDT_CUSTOMER_EMIST_BANK = "//input[@id='form[customerEmiSTBank]']";
	public static final String EDT_CUSTOMER_EMIMT_BANK = "//input[@id='form[customerEmiMTBank]']";
	public static final String EDT_CUSTOMER_EMISTFC = "//input[@id='form[customerEmiSTFC]']";
	public static final String EDT_CUSTOMER_EMIMTFC = "//input[@id='form[customerEmiMTFC]']";
	public static final String EDT_CUSTOMER_EMIST_OTHER = "//input[@id='form[customerEmiSTOther]']";
	public static final String EDT_CUSTOMER_EMIMT_OTHER = "//input[@id='form[customerEmiMTOther]']";
	public static final String EDT_LOAN_CONSUMER_CA = "//input[@id='form[loanConsumerCA]']";
	public static final String DRD_LOAN_TERM_CA = "//select[@id='form[loanTermCA]']";
	public static final String DRD_CA_CREDIT_HISTORY = "//select[@id='form[caCreditHistory]']";
	public static final String RDO_CONTRACT_PAYMENT_IN_6_MONTH_YES = "//span[text()='Có']//preceding-sibling::input[@id='form[hasContractRepaymentIn6Month]']";
	public static final String RDO_MATCHING_CREDIT_INFO_PHONE_YES = "//span[text()='Có']//preceding-sibling::input[@id='form[matchingCreditInfoPhone]']";
	public static final String RDO_MATCHING_CREDIT_INFO_ADDRESS_YES = "//span[text()='Có']//preceding-sibling::input[@id='form[matchingCreditInfoAddress]']";
	public static final String DRD_CA_DECISION = "//select[@id='form[caDecision]']";
	public static final String EDT_CA_COMMENT = "//textarea[@id='form[caComment]']";
	public static final String BTN_CA_CHECK_CODE_FIELD = "//button[@id='form[btnCheckCodeField]']";
	public static final String RDO_CA_CHECK_CODE_FIELD = "//span[text()='NO - Miễn thẩm định địa bàn']//preceding-sibling::input[@name='form[arrFieldAppraisalCode][]']";
			



}
