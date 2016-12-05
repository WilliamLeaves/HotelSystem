package presentation.controller.userManagementController;

import VO.CustomerVO;
import blservice.UserInfo_blservice;
import blservice.impl.UserInfo_bl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import main.Main;

public class SystemManagerCustomerInfoModifyController {
	
	@FXML
	private Button save;
	@FXML
	private Button back;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Label idLabel;
	@FXML
	private Label memberLabel;
	@FXML
	private Label creditLabel;
	@FXML
	private TextField nameTextField;
	@FXML
	private DatePicker datePicker;
	@FXML
	private TextField companyTextField;
	@FXML
	private Button loadPicture;
	
	private Main mainScene;
	private UserInfo_blservice blservice;
	private CustomerVO customer;
	
	public SystemManagerCustomerInfoModifyController() {
		blservice = new UserInfo_bl();
	}

	public void initialize() {
		
	}

	public void SystemManagerCustomerInfoModifyShow(Main m){
		String newName=this.nameTextField.getText();
	}
}

