package blservice;

import VO.CustomerVO;
import VO.HotelInfoVO;
import VO.HotelStaffVO;
import VO.SystemManagerVO;
import VO.SystemStaffVO;

//import java.util.ArrayList;
//import VO.CustomerVO;
//import VO.HotelInfoVO;
//import VO.HotelStaffVO;
//import VO.SystemStaffVO;

public interface UserManagement_blservice {

//	public CustomerVO getCustomer(String user_id);
//
//	public boolean modifyCustomerManagement(CustomerVO customer);
//
//	public ArrayList<HotelStaffVO> getHotelStaffManagement(String hotelstaff_id);
//
//	public boolean modifyHotelStaffManagement(HotelStaffVO hotelstaff);
//
//	public SystemStaffVO getSystemStaff(String systemstaff_id);
//
//	public boolean modifySystemStaffManagement(SystemStaffVO systemstaff);
//
//	public boolean addNewHotel(String hotel_id);
//
//	public boolean addHotelStaff(HotelInfoVO hotel,HotelStaffVO hotelstaff);
	
	public CustomerVO getCustomer(String customerId);
	
	public HotelStaffVO getHotelStaff(String hotelStaffId);
	
	public SystemStaffVO getSystemStaff(String systemStaffId);
	
	public SystemManagerVO getSystemManager(String systemManagerId);
	//网站管理人员修改用户信息
	public boolean modifyCustomer(CustomerVO customerVO);
	
	public boolean modifyHotelStaff(HotelStaffVO hotelStaffVO);
	
	public boolean modifySystemStaff(SystemStaffVO systemStaffVO);
	
	public boolean addSystemStaff(SystemStaffVO staffVO);
	
	public boolean addHotel(HotelInfoVO hotelInfoVO);
	
    public boolean addHotelStaff(HotelStaffVO hotelStaffVO);
}
