package presentation.view.adviceFeedBack_ui;

import java.util.ArrayList;

import VO.AdviceFeedBackVO;
import other.ResultMessage;

public interface AdviceReplyControllerService {

	public ArrayList<AdviceFeedBackVO> getUnprocessedAdvice(String systemstaffId);
	
	public ArrayList<AdviceFeedBackVO> getProcessedAdvice(String systemstaffId);
	
	public ResultMessage setStateOfAdvice(String Adviceid);
}
