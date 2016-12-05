package presentation.controller.userManagementController;

import VO.SystemStaffVO;
import VO.UserVO;
import blservice.UserInfo_blservice;
import blservice.impl.UserInfo_bl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import main.Main;

public class UserManagementController {

	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button viewUserInfo;
	@FXML
	private Button viewCustomerList;
	@FXML
	private Button viewHotelStaffList;
	@FXML
	private Button viewSystemStaffList;
	@FXML
	private Button back;
	@FXML
	private Label idLabel;
	@FXML
	private TextField inputSearchText;
	@FXML
	private Button searchButton;
	@FXML
    private TableView<UserVO> userTable;
    @FXML
    private TableColumn<UserVO, String> idColumn;
    @FXML
    private TableColumn<UserVO, String> nameColumn;
    @FXML
    private TableColumn<UserVO, String> identityColumn;//用户身份
    @FXML
    private TableColumn<UserVO, String> stateColumn;//在线状况
	
    private Main mainScene;
	private SystemStaffVO systemStaff;
	private UserInfo_blservice systemStaffInfoService;
	
	public UserManagementController(){
		systemStaffInfoService = new UserInfo_bl();
	}
	
	public void UserManagementShow(Main mainScene) {
		
	}
}
