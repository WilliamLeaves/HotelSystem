package presentation.controller.hotelController;

import VO.HotelInfoVO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import main.Main;

//ÐèÒª¸Ä***********************************
//

public class HotelStaffHotelInfoModifyController {

	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button  save;
	@FXML
	private Button back;
	@FXML
	private ImageView hotelPicture1;
	@FXML
	private ImageView hotelPicture2;
	@FXML
	private Button changePicture1;
	@FXML
	private Button changePicture2;
	@FXML
	private TextField hotelName;
	@FXML
	private TextField address;
//	@FXML
//	private Label district;
	@FXML
	private TextArea description;
	@FXML
	private MenuButton strategy;
	
	public HotelStaffHotelInfoModifyController() {

	}

	public void HotelStaffHotelInfoModifyShow(Main mainScene) {

	}

	public void initialize(Main main, HotelInfoVO hotel) {
		// TODO Auto-generated method stub
		
	}
	
}
