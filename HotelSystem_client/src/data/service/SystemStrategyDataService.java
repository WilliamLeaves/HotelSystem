package data.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.SystemStrategyPO;

public interface SystemStrategyDataService extends Remote {

	public boolean add(SystemStrategyPO systemstrategy)throws RemoteException;
	public boolean delete(SystemStrategyPO systemstrategy)throws RemoteException;
	public boolean modify(SystemStrategyPO systemstrategy)throws RemoteException;
	public SystemStrategyPO getSstrategy(String strategyName)throws RemoteException;
}
