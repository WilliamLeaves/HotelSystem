package data.dao.impl;

import PO.SystemStrategyPO;
import data.dao.SystemStrategyDao;
import other.hibernateUtil;

public class SystemStrategyDaoImpl implements SystemStrategyDao{

	public boolean addSstrategy(SystemStrategyPO Sstrategy) {
		try{
			hibernateUtil.add(Sstrategy);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteSstrategy(SystemStrategyPO Sstrategy) {
		try{
			hibernateUtil.delete(Sstrategy);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}

	}

	public boolean updateSstrategy(SystemStrategyPO Sstrategy) {
		try{
			hibernateUtil.update(Sstrategy);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
}

	public SystemStrategyPO getSstrategy(String strategyName) {
		try{
			return (SystemStrategyPO)hibernateUtil.findById(SystemStrategyPO.class, strategyName);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
}

}
