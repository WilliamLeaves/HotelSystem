package presentation.controller.orderController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import main.Main;

public class SystemStaffOrderViewController {

	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button cancelOrder;
	@FXML
	private Button back;
	@FXML
	private Label IdLabel;//客户id
	@FXML
	private Label nameLabel;//客户姓名
	@FXML
	private Label nameOfHotel;//酒店名称
	@FXML
	private Label typeOfRoom;//房间类型
	@FXML
	private Label numberOfRoom;
	@FXML
	private Label durationOfOrder;//订单时长
	@FXML
	private Label timeOfArrive;//到达时间
	@FXML
	private Label actualPayment;//实际付款
	@FXML
	private Label stateOfOrder;//订单状态
	
	public SystemStaffOrderViewController() {
		
	}

	public void SystemStaffOrderViewShow(Main mainScene) {

	}

	
}
