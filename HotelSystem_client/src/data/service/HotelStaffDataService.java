package data.service;

import java.rmi.RemoteException;

import PO.HotelStaffPO;

public interface HotelStaffDataService {
	public boolean addStaff(HotelStaffPO staffPO)throws RemoteException;
	public boolean updateStaff(HotelStaffPO staffPO)throws RemoteException;
	public boolean deleteStaff(HotelStaffPO staffPO)throws RemoteException;
	public HotelStaffPO findStaff(String staffID)throws RemoteException;
}
