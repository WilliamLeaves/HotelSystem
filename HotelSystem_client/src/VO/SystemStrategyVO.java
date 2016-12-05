package VO;

import java.time.LocalDateTime;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import other.StrategyState;
import other.SystemStrategyType;

/**网站营销策略的名称
 * 网站营销策略的内容
 * 制定网站营销策略的网站营销人员的id
 * 网站营销策略的开始时间
 * 网站营销策略的结束时间
 * @author zhiting Xin
 *
 */
public class SystemStrategyVO {
	
     private String systemStrategyName;
     private SystemStrategyType systemStrategyType;
     private String systemStrategyDescription;
    private StrategyState strategyState;
     private double discount;
     private LocalDateTime begin_date;
     private LocalDateTime end_date;
     private String systemStaffID;
     
     public SystemStrategyVO(){
     }
     
//     public SystemStrategyVO(SystemStrategyPO systemstrategypo){
//    	 super();
//    	 this.systemStrategy_name = systemstrategypo.getSystemStrategy_name();
//    	 this.discount = systemstrategypo.getDiscount();
//    	 this.begin_date = systemstrategypo.getBegin_date();
//    	 this.end_date = systemstrategypo.getEnd_date();
//    	 this.systemStaffID = systemstrategypo.getSystemStaffId();
//     }
//       
     public double getDiscount(){
    	 return this.discount;
     }
     
     public LocalDateTime getBegin_Date(){
    	 return this.begin_date;
     }
     
     public String getSystemStaffID() {
 		return this.systemStaffID;
 	}
     
     public LocalDateTime getEnd_date() {
 		return end_date;
 	}
     
	public String getSystemStrategyDescription() {
		return systemStrategyDescription;
	}

	public void setSystemStrategyDescription(String systemStrategyDescription) {
		this.systemStrategyDescription = systemStrategyDescription;
	}

	public String getSystemStrategyName() {
		return systemStrategyName;
	}

	public void setSystemStrategyName(String systemStrategyName) {
		this.systemStrategyName = systemStrategyName;
	}

	public SystemStrategyType getSystemStrategyType() {
		return systemStrategyType;
	}

	public void setSystemStrategyType(SystemStrategyType systemStrategyType) {
		this.systemStrategyType = systemStrategyType;
	}

	public StrategyState getStrategyState() {
		return strategyState;
	}

	public void setStrategyState(StrategyState strategyState) {
		this.strategyState = strategyState;
	}
    //ui属性
	public StringProperty getStrategyNameProperty() {
		return new SimpleStringProperty(this.systemStrategyName);
	}
	
	public StringProperty getStrategyDescriptionProperty() {
		return new SimpleStringProperty(this.systemStrategyDescription);
	}
	public StringProperty getStrategyStateProperty() {
		return new SimpleStringProperty(String.valueOf(this.systemStrategyType));
	}
}
