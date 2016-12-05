package presentation.controller.orderController;

import VO.HotelStaffVO;
import VO.OrderVO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import main.Main;

public class HotelStaffManagementOrderController {

	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button setToException;//设置为异常订单
	@FXML
	private Button setToDone;//设置为已执行订单
	@FXML
	private Button back;
	@FXML
	private Label IdLabel;
	@FXML
	private Label nameLabel;
	@FXML
	private Label hotelName;
	@FXML
	private Label roomType;
	@FXML
	private Label roomNumber;
	@FXML
	private Label orderDuration;//订单时长
	@FXML
	private Label arriveTime;//订单时长
	@FXML
	private Label orderPayment;
	@FXML
	private Label stateOfOrder;
	
	public HotelStaffManagementOrderController() {

	}

	public void HotelStaffManagementOrderShow(Main mainScene) {

	}

	public void initialize(Main main, HotelStaffVO hotelStaff, OrderVO order) {
		// TODO Auto-generated method stub
		
	}
}
