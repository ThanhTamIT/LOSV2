package pageuis.sale;

public class DCNewCasePageUI {
	public class DCNewCasePage {
		public static final String BTN_TRA_CUU_CIC = "//button[@id='form[btnGetS37Report]']";
		public static final String BTN_XEM_BAO_CAO_S37 = "//button[@id='form[btnViewS37Report]']";
		public static final String BTN_CLOSE = "//button[text()='CLOSE']";
		public static final String DRD_KET_QUA_S37 = "//select[@id='form[s37Result]']";
		public static final String EDT_TCTD_S37 = "//input[@id='form[s37CINumber]']";
		public static final String EDT_DATE_UPDATE_S37 = "//input[@id='form[s37UpdateDate]']";
		public static final String INPUT_IMG_S37 	= "//span[@class='btn btn-default fileinput-button']";
		public static final String RDO_BLACKLIST_NO = "//span[text()='Không có trong blacklist']//preceding-sibling::input";
		public static final String RDO_BLACKLIST_YES = "//span[text()='Có trong blacklist']//preceding-sibling::input";
		public static final String DRD_DUPLICATE = "//select[@name='tblDuplidate_length']";
		public static final String SEARCH_BOX = "//input[@type='search']";
		public static final String BTN_NEXT = "//a[@class='paginate_button next']";
		public static final String BTN_PREVIOUS = "//a[@class='paginate_button previous']"; 
		public static final String RDO_DUPLICATE_NO = "//span[text()='Không trùng lặp']//preceding-sibling::input";
		public static final String RDO_DUPLICATE_YES = "//span[text()='Trùng lặp']//preceding-sibling::input";
		public static final String RDO_HOSO1_YES = "//span[text()='Đầy đủ']//preceding-sibling::input";
		public static final String RDO_HOSO1_NO = "//span[text()='Chưa đầy đủ']//preceding-sibling::input";
		public static final String RDO_HOSO2_YES = "//span[text()='Tốt, rõ nét']//preceding-sibling::input";
		public static final String RDO_HOSO2_NO = "//span[text()='Không tốt']//preceding-sibling::input";
		public static final String RDO_HOSO3_YES = "//span[text()='Nhất quán']//preceding-sibling::input";
		public static final String RDO_HOSO3_NO = "//span[text()='Không nhất quán']//preceding-sibling::input";
		public static final String RDO_HOSO4_YES = "//span[text()='Hoàn toàn chính xác so với hồ sơ']//preceding-sibling::input";
		public static final String RDO_HOSO4_NO = "//span[text()='Chưa hoàn toàn chính xác so với hồ sơ']//preceding-sibling::input";
		public static final String BTN_CHECK_ID_TAMPERING = "//button[@id='form[btnCheckIdTampering]']";
		public static final String DRD_TAMPERING_CONFIRM = "//select[@id='form[idTampering][1][idTamperingDcConfirm]']";
		public static final String EDT_TAMPERING_COMMENT = "//textarea[@id='form[idTampering][1][idTamperingDcComment]']";
		public static final String BTN_SYSTEM_SUGGEST = "//button[@id='form[btnSuggest]']";
		public static final String DRD_OPINION_DC = "//select[@id='form[dcDecision]']";
		public static final String EDT_COMMENT_DC = "//textarea[@id='form[dcComment]']";
		public static final String BTN_SAVE = "//button[@id='form[btnSave]']";
		public static final String BTN_COMPLETE = "//button[@id='form[submit0000000001]']";

	}

}
