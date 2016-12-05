package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import PO.AdviceFeedBackPO;
import PO.CustomerPO;
import PO.HotelPO;
import PO.HotelStaffPO;
import PO.HotelStrategyPO;
import PO.LoginPO;
import PO.OrderPO;
import PO.SystemManagerPO;
import PO.SystemStaffPO;
import PO.SystemStrategyPO;
import data.service.AdviceFeedBackDataService;
import data.service.CustomerDataService;
import data.service.HotelDataService;
import data.service.HotelStaffDataService;
import data.service.HotelStrategyDataService;
import data.service.LoginDataService;
import data.service.OrderDataService;
import data.service.SystemManagerDataService;
import data.service.SystemStaffDataService;
import data.service.SystemStrategyDataService;
import data.service.impl.AdviceFeedBackDataServiceImpl;
import data.service.impl.CustomerDataServiceImpl;
import data.service.impl.HotelDataServiceImpl;
import data.service.impl.HotelStaffDataServiceImpl;
import data.service.impl.HotelStrategyDataServiceImpl;
import data.service.impl.LoginDataServiceImpl;
import data.service.impl.OrderDataServiceImpl;
import data.service.impl.SystemManagerDataServiceImpl;
import data.service.impl.SystemStaffDataServiceImpl;
import data.service.impl.SystemStrategyDataServiceImpl;

public class DataRemoteObject extends UnicastRemoteObject implements LoginDataService
,OrderDataService,HotelStrategyDataService,SystemStrategyDataService,HotelDataService,AdviceFeedBackDataService
,HotelStaffDataService,SystemStaffDataService,SystemManagerDataService,CustomerDataService{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LoginDataService login;
	private OrderDataService orderdata;
	private HotelStrategyDataService hotelstrategy;
	private SystemStrategyDataService systemstrategy;
	private HotelDataService hotel;
	private AdviceFeedBackDataService advice;
	private SystemManagerDataService systemManagerDataService;
	private SystemStaffDataService systemStaffDataService;
	private CustomerDataService customerDataService;
	private HotelStaffDataService hotelStaffDataService;
	protected DataRemoteObject() throws RemoteException {
		customerDataService = new CustomerDataServiceImpl();
		hotelStaffDataService = new HotelStaffDataServiceImpl();
		systemManagerDataService = new SystemManagerDataServiceImpl();
		systemStaffDataService = new SystemStaffDataServiceImpl();
		login = new LoginDataServiceImpl();
		orderdata = new OrderDataServiceImpl();
		hotelstrategy = new HotelStrategyDataServiceImpl();
		systemstrategy = new SystemStrategyDataServiceImpl();
		hotel = new HotelDataServiceImpl();
		advice = new AdviceFeedBackDataServiceImpl();
	}
	public boolean addAdvice(AdviceFeedBackPO advicefeedback) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean updateAdvice(AdviceFeedBackPO advicefeedback) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public ArrayList<AdviceFeedBackPO> getAdvices(String userId, String type) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean add(HotelPO hotel) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean del(HotelPO hotel) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean update(HotelPO hotel) {
		// TODO Auto-generated method stub
		return false;
	}
	public ArrayList<HotelPO> getHotels(String strict, String type) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean add(SystemStrategyPO systemstrategy) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean delete(SystemStrategyPO systemstrategy) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean modify(SystemStrategyPO systemstrategy) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean add(HotelStrategyPO hotelstrategy) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean delete(HotelStrategyPO hotelstrategy) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean modify(HotelStrategyPO hotelstartegy) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public ArrayList<HotelStrategyPO> getAll(String hotelId) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean add(OrderPO order) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean update(OrderPO order) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean dalete(OrderPO order) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public OrderPO findorder(String orderId) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public List<OrderPO> findOrders(String userId, String type) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean confirm(String userId, String userPassword) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean add(LoginPO login) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean delete(LoginPO login) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean update(LoginPO login) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public HotelPO find(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}
	public HotelStrategyPO get(String hotelstrategyId) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public SystemStrategyPO getSstrategy(String strategyName) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean addCustomer(CustomerPO customer) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean deleteCustomer(CustomerPO customer) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean updateCustomer(CustomerPO customer) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public CustomerPO findCustomer(String customerID) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public SystemManagerPO findManager(String managerID) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean addManager(SystemManagerPO managerPO) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean deleteManager(SystemManagerPO systemManagerPO) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean updateManager(SystemManagerPO managerPO) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean addStaff(SystemStaffPO staffPO) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean updateStaff(SystemStaffPO staffPO) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean deleteStaff(SystemStaffPO staffPO) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public SystemStaffPO findStaff(String staffID) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean addStaff(HotelStaffPO staffPO) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean updateStaff(HotelStaffPO staffPO) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean deleteStaff(HotelStaffPO staffPO) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public HotelStaffPO findHotelStaff(String staffID) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
