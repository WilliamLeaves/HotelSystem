package blservice;

import java.util.ArrayList;
import VO.SystemStrategyVO;

public interface SystemStrategy_blservice {
	 
//	public ArrayList<SystemStrategyVO> getAllSystemStrategys(String systemStaffID);
//	
//	public SystemStrategyVO getSystemStrategy(String systemStrategy_Name);
//	
//	public boolean deleteSystemStrategy(String systemStrategy_Name);
//	
//	public boolean modifySystemStrategy(SystemStrategyVO systemstrategyvo);
//	
//	public SystemStrategyVO makeSystemStrategy(SystemStrategyVO systemstrategyvo);
	
//	public SystemStrategy1VO makeSystemStrategy1(SystemStrategy1VO systemstrategy);
//
//	public boolean modifySystemStrategy1(SystemStrategy1VO systemstrategy);
	public ArrayList<SystemStrategyVO> getAllSystemStrategys();
	
	public SystemStrategyVO getSystemStrategy(String systemStrategy_Name);
	
	public boolean modifySystemStrategy(SystemStrategyVO systemstrategyvo);
	
	public boolean makeSystemStrategy(SystemStrategyVO systemstrategyvo);
	
	public boolean deleteSystemStrategy(SystemStrategyVO systemStrategyVO);
}
