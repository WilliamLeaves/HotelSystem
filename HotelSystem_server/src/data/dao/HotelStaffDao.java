package data.dao;

import PO.HotelStaffPO;

public interface HotelStaffDao {
	public boolean addStaff(HotelStaffPO staffPO);
	public boolean updateStaff(HotelStaffPO staffPO);
	public boolean deleteStaff(HotelStaffPO staffPO);
	public HotelStaffPO findStaff(String staffID);
}
