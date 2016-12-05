package VO;

import java.util.Date;

import PO.SystemStaffPO;
import PO.SystemStrategyPO;

/**网站营销策略的名称
 * 网站营销策略的内容
 * 制定网站营销策略的网站营销人员的id
 * 网站营销策略的开始时间
 * 网站营销策略的结束时间
 * @author zhiting Xin
 *
 */
public class SystemStrategyVO {
	
     private String systemStrategy_name;
     private double discount;
     private Date begin_date;
     private Date end_date;
     private String systemStaffID;
     
     public SystemStrategyVO(){
     }
     
     public SystemStrategyVO(SystemStrategyPO systemstrategypo){
    	 super();
    	 this.systemStrategy_name = systemstrategypo.getSystemStrategy_name();
    	 this.discount = systemstrategypo.getDiscount();
    	 this.begin_date = systemstrategypo.getBegin_date();
    	 this.end_date = systemstrategypo.getEnd_date();
    	 this.systemStaffID = systemstrategypo.getSystemStaffId();
     }
     
     public String getStrategy_name(){
    	 return this.systemStrategy_name;
     }
     
     public double getDiscount(){
    	 return this.discount;
     }
     
     public Date getBegin_Date(){
    	 return this.begin_date;
     }
     
     public String getSystemStaffID() {
 		return this.systemStaffID;
 	}
     
     public Date getEnd_date() {
 		return end_date;
 	}
    
}
