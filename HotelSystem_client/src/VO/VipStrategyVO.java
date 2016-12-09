package VO;

import java.util.ArrayList;

public class VipStrategyVO {

	private ArrayList<VipVO> vipStrategyVOList = new ArrayList<VipVO>();
	
	public VipStrategyVO(){}
	public VipStrategyVO(VipVO v1,VipVO v2,VipVO v3,VipVO v4,VipVO v5){
		super();
		this.vipStrategyVOList.add(v1);
		this.vipStrategyVOList.add(v2);
		this.vipStrategyVOList.add(v3);
		this.vipStrategyVOList.add(v4);
		this.vipStrategyVOList.add(v5);
	}
    public VipStrategyVO(ArrayList<VipVO> vips){
    	super();
    	this.vipStrategyVOList = vips;
    }
	public ArrayList<VipVO> getVipStrategyVOList() {
		return vipStrategyVOList;
	}

	public void setVipStrategyVOList(ArrayList<VipVO> vipStrategyVOList) {
		this.vipStrategyVOList = vipStrategyVOList;
	}
	
	
}
