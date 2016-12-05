package presentation.controller.userManagementController;

import VO.HotelStaffVO;
import blservice.UserInfo_blservice;
import blservice.impl.UserInfo_bl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import main.Main;

public class SystemManagerHotelStaffInfoViewController {

	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button modifyInfo;
	@FXML
	private Button changeState;
	@FXML
	private Button back;
	@FXML
	private Label idLabel;
	@FXML
	private Label nameLabel;
	@FXML
	private Label hotelId;
	@FXML
	private Label hotelName;
	@FXML
	private ImageView image;

	private Main mainScene;
	private UserInfo_blservice blservice;
	private HotelStaffVO hotelStaff;
	
	public SystemManagerHotelStaffInfoViewController() {
		blservice = new UserInfo_bl();
	}
	
	public void SystemManagerHotelStaffInfoViewShow(Main mainScene) {
		this.mainScene = mainScene;
	}
	
}
