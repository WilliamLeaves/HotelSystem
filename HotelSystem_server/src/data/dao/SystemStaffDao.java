package data.dao;


import PO.SystemStaffPO;

public interface SystemStaffDao {
	public boolean addStaff(SystemStaffPO staffPO);
	public boolean updateStaff(SystemStaffPO staffPO);
	public boolean deleteStaff(SystemStaffPO staffPO);
	public SystemStaffPO findStaff(String staffID);
}
