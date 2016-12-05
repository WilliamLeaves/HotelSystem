package presentation.controller.systemstrategyController;

import blservice.impl.UserInfo_bl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import main.Main;

public class SystemStaffSystemStrategyModifyController{
	
	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button save;
	@FXML
	private Button back;
	@FXML
	private Label typeOfStrategy;
	@FXML
	private TextField nameOfStrategy;
	@FXML
	private TextArea descriptionOfStrategy;
	@FXML
	private TextField discountForCustomer;
	@FXML
	private MenuButton levelForNormal;
	@FXML
	private TextField discountForNormal;
	@FXML
	private MenuButton levelForCompany;
	@FXML
	private TextField discountForCompany;
	@FXML
	private RadioButton open;
	@FXML
	private RadioButton close;
	
	public SystemStaffSystemStrategyModifyController(){		
	}
	
	public void SystemStaffSystemStrategyModifyShow(Main mainScene) {

	}
}
