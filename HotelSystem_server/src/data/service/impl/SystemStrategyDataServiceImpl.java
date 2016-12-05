package data.service.impl;

import java.rmi.RemoteException;

import PO.SystemStrategyPO;
import data.dao.DataFactory;
import data.dao.SystemStrategyDao;
import data.dao.impl.DataFactoryImpl;
import data.service.SystemStrategyDataService;

public class SystemStrategyDataServiceImpl implements SystemStrategyDataService {

	private DataFactory dataFactory;
	private SystemStrategyDao service;
	
	public SystemStrategyDataServiceImpl(){
		dataFactory = new DataFactoryImpl();
		service = dataFactory.getSystemStrategyDao();
	}
	public boolean add(SystemStrategyPO systemstrategy) throws RemoteException {
		return service.addSstrategy(systemstrategy);
	}

	public boolean delete(SystemStrategyPO systemstrategy) throws RemoteException {
		return service.deleteSstrategy(systemstrategy);
	}

	public boolean modify(SystemStrategyPO systemstrategy) throws RemoteException {
		return service.updateSstrategy(systemstrategy);
	}
	public SystemStrategyPO getSstrategy(String strategyName) throws RemoteException {
		return service.getSstrategy(strategyName);
	}

}
