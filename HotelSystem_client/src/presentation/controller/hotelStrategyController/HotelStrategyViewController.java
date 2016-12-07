package presentation.controller.hotelStrategyController;

import VO.HotelInfoVO;
import VO.HotelStaffVO;
import blservice.HotelStrategy_blservice;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import main.Main;

public class HotelStrategyViewController {

	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button modifyHotelStrategy;
	@FXML
	private Button back;
	@FXML
	private Label hotelName;
	@FXML
	private Text strategyInfo;

	private Main mainscene;
	private HotelInfoVO hotel;
	private HotelStaffVO hotelStaff;
	private HotelStrategy_blservice service;

	public HotelStrategyViewController() {

	}

	public void HotelStrategyViewShow() {
		this.leftIdLabel.setText(this.hotelStaff.getId());
		this.leftNameLabel.setText(this.hotelStaff.getUsername());
		this.hotelName.setText(this.hotelStaff.getHotelName());
		//this.strategyInfo.setText(this.service.getHotelStrategy(this.hotel.getHotelID()));
	}

	public void initialize(Main main, HotelStaffVO staff, HotelInfoVO hotel) {
		// TODO Auto-generated method stub
		this.mainscene = main;
		this.hotelStaff = staff;
		this.hotel = hotel;
		this.HotelStrategyViewShow();
	}

	public void handleModify() {

		this.mainscene.showHotelStrategyModifyScene(hotelStaff, hotel);
	}

	public void handleBack() {
		this.mainscene.showHotelStaffMainScene(hotelStaff);
	}
}
