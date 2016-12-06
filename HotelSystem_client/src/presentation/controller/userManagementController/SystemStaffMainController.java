package presentation.controller.userManagementController;

import java.util.Date;

import VO.OrderVO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import main.Main;

public class SystemStaffMainController {

	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button ExceptionOrderManagement;
	@FXML
	private Button creditManagement;
	@FXML
	private Button makeSystemStrategy;
	@FXML
	private Button adcviceManagement;
	@FXML
	private Button maintainPersonalInfo;// 维护个人信息
	@FXML
	private Button exit;
	@FXML
	private Label districtName;
	@FXML
	private TableView<OrderVO> orderTable;
	@FXML
	private TableColumn<OrderVO, String> customerId;
	@FXML
	private TableColumn<OrderVO, String> hotelId;
	@FXML
	private TableColumn<OrderVO, String> orderId;//房间数量和类型
	@FXML
	private TableColumn<OrderVO, Date> arriveTime;//简介
	@FXML
	private TableColumn<OrderVO, String> orderDuration;//订单时长
	
	public SystemStaffMainController() {
	}
	
	public void SystemStaffMainShow(Main mainScene) {
		leftIdLabel.setText("123");		
	}	
}
