package data.dao;

import PO.VipPO;

public interface VipDao {

	public boolean makeVip(VipPO vipPO);
	
	public VipPO getVip(int grade);
	
	public boolean updateVip(VipPO vipPO);
}
