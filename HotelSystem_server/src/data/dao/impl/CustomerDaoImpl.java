package data.dao.impl;

import PO.CustomerPO;
import data.dao.CustomerDao;
import other.hibernateUtil;

public class CustomerDaoImpl implements CustomerDao{

	public boolean addCustomer(CustomerPO customer) {
		try{
			hibernateUtil.add(customer);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteCustomer(CustomerPO customer) {
		try{
			hibernateUtil.delete(customer);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}	}

	public boolean updateCustomer(CustomerPO customer) {
		try{
			hibernateUtil.update(customer);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}	}

	public CustomerPO findCustomer(String customerID) {
		try{
			return (CustomerPO)hibernateUtil.findById(CustomerPO.class, customerID);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}	}
	
}
