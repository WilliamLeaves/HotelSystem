package blservice.impl;

import RMI.RemoteHelper;
import blservice.VipStrategy_blService;
import data.service.VipDataService;

public class VipStrategy_blServiceImpl implements VipStrategy_blService{

	VipDataService vipDataService = RemoteHelper.getInstance().getVipDataService();
	public boolean makeVipStrategy(VipStrategyVO vipstrategy) {
		
		return false;
	}

	public boolean modifyVipStrategy(VipStrategyVO vipstrategy) {
		// TODO Auto-generated method stub
		return false;
	}

	public VipStrategyVO getVipStrategy() {
		
		return null;
	}

}
