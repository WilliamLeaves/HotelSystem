package PO;

import java.util.Date;

import VO.SystemStrategyVO;

public class SystemStrategyPO {

	private String systemStrategy_name;
	private String systemStaffId;
    private double discount;
    private Date begin_date;
    private Date end_date;
    
    public SystemStrategyPO(){
    }
    public SystemStrategyPO(SystemStrategyVO systemStrategyVO){
    	this.systemStrategy_name = systemStrategyVO.getStrategy_name();
    	this.systemStaffId = systemStrategyVO.getSystemStaffID();
    	this.discount = systemStrategyVO.getDiscount();
    	this.begin_date = systemStrategyVO.getBegin_Date();
    	this.end_date = systemStrategyVO.getEnd_date();
    }
    public SystemStrategyPO(String systemstrategy_name,double count,Date begin,Date end,String systemStaffID){
    	this.systemStrategy_name=systemstrategy_name;
    	this.discount = count;
    	this.begin_date = begin;
    	this.end_date =end;
    	this.systemStaffId = systemStaffID;
    }
    
	public String getSystemStrategy_name() {
		return systemStrategy_name;
	}
	
	public void setSystemStrategy_name(String systemStrategy_name) {
		this.systemStrategy_name = systemStrategy_name;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public void setDiscount(double count) {
		this.discount = count;
	}
	
	public Date getBegin_date() {
		return begin_date;
	}
	
	public void setBegin_date(Date begin_date) {
		this.begin_date = begin_date;
	}
	
	public Date getEnd_date() {
		return end_date;
	}
	
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getSystemStaffId() {
		return systemStaffId;
	}
	public void setSystemStaffId(String systemStaffId) {
		this.systemStaffId = systemStaffId;
	}

}
