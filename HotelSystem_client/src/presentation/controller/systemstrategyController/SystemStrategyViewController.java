package presentation.controller.systemstrategyController;

import VO.SystemStaffVO;
import VO.SystemStrategyVO;
import blservice.SystemStrategy_blservice;
import blservice.impl.SystemStrategy_bl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import main.Main;

public class SystemStrategyViewController {

	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button viewHolidayDiscount;
	@FXML
	private Button viewMemberDiscount;
	@FXML
	private Button viewVIPDiscount;
	@FXML
	private Button viewOtherDiscount;
	@FXML
	private Button back;
	@FXML
	private Label discountListLabel;
	@FXML
    private TableView<SystemStrategyVO> systemStrategyTable;
    @FXML
    private TableColumn<SystemStrategyVO, String> nameOfStrategy;
    @FXML
    private TableColumn<SystemStrategyVO, String> descriptionOfStrategy;
    @FXML
    private TableColumn<SystemStrategyVO, String> stateOfStrategy;
    @FXML
	private Button addStrategy;
	@FXML
	private Button modifyStrategy;
    
    private Main mainScene;
    private SystemStaffVO systemStaffVO;
    private SystemStrategyVO systemStrategyVO;
    private SystemStrategy_blservice systemStrategy_blservice;
    private ObservableList<SystemStrategyVO> systemStrategyData = FXCollections.observableArrayList();
    
    public SystemStrategyViewController(){		
    	systemStrategy_blservice = new SystemStrategy_bl();
	}
	
    public void initialize(Main mainScene,SystemStaffVO systemStaffVO) {
		this.mainScene = mainScene;
		this.systemStaffVO = systemStaffVO;
		SystemStrategyViewShow(mainScene);
	}
	public void SystemStrategyViewShow(Main mainScene) {
		//×ó±ßÀ¸
		leftIdLabel.setText(systemStaffVO.getId());
		leftNameLabel.setText(systemStaffVO.getUsername());
		//ÓÒ±ßÀ¸
		systemStrategy_blservice.getAllSystemStrategys(systemStaffID);
	}
}
