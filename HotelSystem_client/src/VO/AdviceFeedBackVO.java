package VO;

import PO.AdviceFeedBackPO;
import other.AdviceFeedBackState;

public class AdviceFeedBackVO {
	
     private AdviceFeedBackState state;
     private String AdviceFeedBack_content;
     private String AdviceId;
     
     public AdviceFeedBackVO(){
    	 super();
     }
     
     public AdviceFeedBackVO(AdviceFeedBackPO advicefeedbackpo){
    	 this.AdviceFeedBack_content = advicefeedbackpo.getAdviceFeedBack_content();
    	 this.state = advicefeedbackpo.getState();
    	 this.AdviceId = advicefeedbackpo.getAdviceId();
     }

	public AdviceFeedBackState getState() {
		return state;
	}

	public String getAdviceFeedBack_content() {
		return AdviceFeedBack_content;
	}
     
	public String getAdviceId(){
		return AdviceId;
	}
}
