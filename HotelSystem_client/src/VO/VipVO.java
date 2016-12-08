package VO;

import PO.VipPO;

public class VipVO {
	private int mincredit;
	private int maxcredit;
    private int Vipgrade;
    private double discount;
    public VipVO(VipPO vipPO){
    	this.maxcredit = vipPO.getMaxcredit();
    	this.mincredit = vipPO.getMincredit();
    	this.discount = vipPO.getDiscount();
    	this.Vipgrade = vipPO.getVipgrade();
    }
    public int getMincredit() {
		return mincredit;
	}
	public void setMincredit(int mincredit) {
		this.mincredit = mincredit;
	}
	public int getMaxcredit() {
		return maxcredit;
	}
	public void setMaxcredit(int maxcredit) {
		this.maxcredit = maxcredit;
	}
	public int getVipgrade() {
		return Vipgrade;
	}
	public void setVipgrade(int vipgrade) {
		Vipgrade = vipgrade;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
    
}
