package data.dao;

import java.util.ArrayList;

import PO.SystemStrategyPO;

public interface SystemStrategyDao {
	public boolean addSstrategy(SystemStrategyPO Sstrategy);
	public boolean deleteSstrategy(SystemStrategyPO Sstrategy);
	public boolean updateSstrategy(SystemStrategyPO Sstrategy);
	public SystemStrategyPO getSstrategy(String strategyName);
	public ArrayList<SystemStrategyPO> getAllStrategys();
}
