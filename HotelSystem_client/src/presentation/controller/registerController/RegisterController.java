package presentation.controller.registerController;

import VO.CustomerVO;
import VO.UserVO;
import blservice.Register_blservice;
import blservice.UserInfo_blservice;
import blservice.impl.Register_bl;
import blservice.impl.UserInfo_bl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import main.Main;

public class RegisterController {

	@FXML
	private TextField name;
	@FXML
	private TextField password;
	@FXML
	private TextField confirmPassword;
	@FXML
	private MenuButton setDistrict;
	@FXML
	private MenuItem setDistrictItem1;
	@FXML
	private MenuItem setDistrictItem2;
	@FXML
	private DatePicker birthday;
	@FXML
	private Button confirm;
	@FXML
	private Button cancel;
	@FXML
	private Label errorLabel;

	private Main mainScene;
	private UserVO user;
	private UserInfo_blservice user_blservice;
	private Register_blservice registerService;

	public RegisterController() {

	}

	public void initialize(Main main) {
		// TODO Auto-generated method stub
		user_blservice = new UserInfo_bl();
		registerService = new Register_bl();
		this.mainScene = main;
	}

	public void RegisterShow() {
		this.errorLabel.setVisible(false);
	}

	public void handleComfirm() {
		String userNameInField = this.name.getText();
		String userPasswordInField = this.password.getText();
		String userPasswordConfirmInField = this.confirmPassword.getText();
		String userBirthdayInField = this.birthday.getPromptText();

		// 条件判断语句
		boolean isPasswordReady = false;
		boolean isNameReady = false;

		if (userNameInField != "") {
			isNameReady = true;
		} else {
			this.errorLabel.setVisible(true);
			this.errorLabel.setText("请输入用户名！");
		}

		if (userPasswordInField != "") {
			if (userPasswordInField.equals(userPasswordConfirmInField)) {
				isPasswordReady = true;
			} else {
				this.errorLabel.setVisible(true);
				this.errorLabel.setText("两次输入的密码不一致！");
			}

		} else {
			this.errorLabel.setVisible(true);
			this.errorLabel.setText("请输入密码！");
		}

		if (isPasswordReady && isNameReady == true) {
			// bl层创建新用户
			{
				//this.registerService.addRegister(userNameInField, userPasswordInField,this.setDistrict.getText(),)
			}
			this.mainScene.showCustomerMainScene(new CustomerVO());
		}
	}

	public void handleCancel() {
		this.mainScene.showLoginScene();
	}

	public void handleDistrictMenuItem1() {
		this.setDistrict.setText(this.setDistrictItem1.getText());
	}

	public void handleDistrictMenuItem2() {
		this.setDistrict.setText(this.setDistrictItem2.getText());
	}

}
