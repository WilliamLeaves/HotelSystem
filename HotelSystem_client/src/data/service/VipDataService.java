package data.service;

import java.rmi.RemoteException;

import PO.VipPO;

public interface VipDataService {

    public boolean makeVip(VipPO vipPO)throws RemoteException;
	
	public VipPO getVip(int grade)throws RemoteException;
	
	public boolean updateVip(VipPO vipPO)throws RemoteException;
}
