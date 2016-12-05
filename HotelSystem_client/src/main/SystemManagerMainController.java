package main;

import java.util.Date;

import VO.OrderVO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

public class SystemManagerMainController {

	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button userManagment;
	@FXML
	private Button newHotel;
	@FXML
	private Button maintainPersonalInfo;// 维护个人信息
	@FXML
	private Button exit;
	@FXML
	private Label userAmount;
	@FXML
	private Label onlineUser;//在线用户
	@FXML
	private Label hotelAmount;//酒店数量
	@FXML
	private Label orderDone;//已执行订单总数
	
	public SystemManagerMainController() {
	}
	
	public void SystemManagerMainShow(Main mainScene) {
		leftIdLabel.setText("123");		
	}	
}
