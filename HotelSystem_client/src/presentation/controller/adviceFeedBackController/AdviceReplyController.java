package presentation.controller.adviceFeedBackController;

import java.util.ArrayList;

import VO.AdviceFeedBackVO;
import blservice.AdviceFeedBack_blservice;
import blservice.impl.AdviceFeedBack_bl;

public class AdviceReplyController {

	private AdviceFeedBack_blservice advicefeedbackblservice;
	
	public AdviceReplyController(){
		advicefeedbackblservice = new AdviceFeedBack_bl();
	}
	public ArrayList<AdviceFeedBackVO> getUnprocessedAdvice(String systemstaffId) {
		// TODO Auto-generated method stub
		return advicefeedbackblservice.getUnprocessedAdvice(systemstaffId);
	}

	public ArrayList<AdviceFeedBackVO> getProcessedAdvice(String systemstaffId) {
		// TODO Auto-generated method stub
		return advicefeedbackblservice.getProcessedAdvice(systemstaffId);
	}

	// public ResultMessage setStateOfAdvice(String Adviceid) {
	// // TODO Auto-generated method stub
	// return advicefeedbackblservice.setStateOfAdvice(Adviceid);
	// }
	//
	// public ResultMessage addAdviceFeedback(AdviceFeedBackVO advice){
	//
	// return advicefeedbackblservice.addAdviceFeedBack(advice);
	// }

}
