package presentation.view.adviceFeedBack_ui;

import java.util.ArrayList;

import VO.AdviceFeedBackVO;
import other.ResultMessage;

public interface AdviceFeedBackControllerService {
    
	public ArrayList<AdviceFeedBackVO> getAllAdvice(String userID);
	
	public ResultMessage addAdviceFeedBack(AdviceFeedBackVO advicefeedbackvo);
	
	public ResultMessage modifyAdviceFeedBack(AdviceFeedBackVO advicefeedbackvo);
	
}
