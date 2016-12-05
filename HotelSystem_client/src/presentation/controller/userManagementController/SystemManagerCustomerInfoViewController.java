package presentation.controller.userManagementController;

import VO.CustomerVO;
import blservice.UserInfo_blservice;
import blservice.impl.UserInfo_bl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import main.Main;
import other.ResultMessage;

public class SystemManagerCustomerInfoViewController {
	
	@FXML
	private Button modifyInfo;
	@FXML
	private Button modifyState;//更改用户状态（冻结/解冻）
	@FXML
	private Button back;
	@FXML
	private Label idLabel;
	@FXML
	private Label nameLabel;
	@FXML
	private Label memberLabel;
	@FXML
	private Label birthdayLabel;
	@FXML
	private Label companyLabel;
	@FXML
	private Label creditLabel;
	@FXML
	private Label stateLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Label leftIdLabel;
	@FXML
	private ImageView leftImage;
	@FXML
	private ImageView image;
	
	private Main mainsence;
	private CustomerVO Customer;
	public UserInfo_blservice blservice;

	public SystemManagerCustomerInfoViewController() {
		blservice = new UserInfo_bl();
	}

	public void initialize() {
	}
	
	public void SystemManagerCustomerInfoViewShow(Main mainScene){
	}
}
