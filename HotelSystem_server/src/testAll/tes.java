package testAll;

import PO.AdviceFeedBackPO;
import data.service.AdviceFeedBackDataService;
import data.service.impl.AdviceFeedBackDataServiceImpl;
import other.AdviceFeedBackState;

public class tes {

	public static void main(String [] args)throws Exception{
		AdviceFeedBackDataService adviceFeedBackDataService = new AdviceFeedBackDataServiceImpl();
		AdviceFeedBackPO adviceFeedBackPO = new  AdviceFeedBackPO();
		adviceFeedBackPO.setAdviceFeedBack_content("adua64565");
		adviceFeedBackPO.setState(AdviceFeedBackState.PROCESSED);
		adviceFeedBackPO.setSystemStaffId("151250170");
		adviceFeedBackPO.setUserId("151250169");
		adviceFeedBackDataService.updateAdvice(adviceFeedBackPO);
	}
}
