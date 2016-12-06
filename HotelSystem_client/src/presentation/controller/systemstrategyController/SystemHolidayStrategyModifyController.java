package presentation.controller.systemstrategyController;

import VO.OrderVO;
import VO.SystemStrategyVO;
import blservice.impl.UserInfo_bl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import main.Main;

public class SystemHolidayStrategyModifyController{
	
	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button save;
	@FXML
	private Button delete;
	@FXML
	private Button back;
	@FXML
	private Label strategyType;//大标题
	@FXML
	private TextField nameOfStrategy;
	@FXML
	private TextArea descriptionOfStrategy;
	@FXML
	private DatePicker startDate;
	@FXML
	private TextField startTime;
	@FXML
	private DatePicker endDate;
	@FXML
	private TextField endTime;
	@FXML
	private TextField discountForCustomer;//优惠额度
	@FXML
	private RadioButton open;
	@FXML
	private RadioButton close;
	
	public SystemHolidayStrategyModifyController(){		
	}
	
	public void SystemStaffSystemStrategyModifyShow(Main mainScene) {
		

	}
}
