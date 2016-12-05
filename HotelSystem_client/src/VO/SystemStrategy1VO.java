package VO;

import PO.SystemStaffPO;
import PO.SystemStrategy1PO;

public class SystemStrategy1VO {

	private String systemStrategy_name;
	private int[] memberGrade;
	private String bussinessDistrict;
	private double[] discout;
	private String systemStaffid;
	
	public SystemStrategy1VO(){
		super();
	}
	
	public SystemStrategy1VO(SystemStrategy1PO systemstrategypo,SystemStaffPO systemstaff){
		super();
		this.bussinessDistrict=systemstrategypo.getBussinessDistrict();
		this.memberGrade = systemstrategypo.getMemberGrade();
		this.systemStaffid = systemstaff.getId();
		this.discout = systemstrategypo.getDiscout();
		this.systemStrategy_name = systemstrategypo.getSystemStrategy_name();
	}

	public String getSystemStrategy_name() {
		return systemStrategy_name;
	}

	public int[] getMemberGrade() {
		return memberGrade;
	}

	public String getBussinessDistrict() {
		return bussinessDistrict;
	}

	public double[] getDiscout() {
		return discout;
	}

	public String getSystemStaffid() {
		return systemStaffid;
	}
	
	
}
