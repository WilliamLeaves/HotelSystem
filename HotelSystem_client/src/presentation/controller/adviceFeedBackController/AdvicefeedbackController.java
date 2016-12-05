package presentation.controller.adviceFeedBackController;

import java.util.ArrayList;

import VO.AdviceFeedBackVO;
import blservice.AdviceFeedBack_blservice;
import blservice.impl.AdviceFeedBack_bl;

public class AdvicefeedbackController{

	private AdviceFeedBack_blservice advicefeedbackblservice;
	public AdvicefeedbackController(){
		advicefeedbackblservice = new AdviceFeedBack_bl();
	}
	public ArrayList<AdviceFeedBackVO> getAllAdvice(String userID) {
		// TODO Auto-generated method stub
		return advicefeedbackblservice.getAllAdvice(userID);
	}

//	public ResultMessage addAdviceFeedBack(AdviceFeedBackVO advicefeedbackvo) {
//		// TODO Auto-generated method stub
//		return advicefeedbackblservice.addAdviceFeedBack(advicefeedbackvo);
//	}
//
//	public ResultMessage modifyAdviceFeedBack(AdviceFeedBackVO advicefeedbackvo) {
//		// TODO Auto-generated method stub
//		return advicefeedbackblservice.modifyAdviceFeedBack(advicefeedbackvo);
//	}
}
