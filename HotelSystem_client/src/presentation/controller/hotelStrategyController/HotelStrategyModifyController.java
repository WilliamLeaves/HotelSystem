package presentation.controller.hotelStrategyController;

import VO.HotelInfoVO;
import VO.HotelStaffVO;
import VO.HotelStrategyVO;
import blservice.HotelStrategy_blservice;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import main.Main;

public class HotelStrategyModifyController {

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
	private Label hotelName;
	@FXML
	private TextArea InputStrategyInfo;

	private Main mainscene;
	private HotelInfoVO hotel;
	private HotelStaffVO hotelStaff;
	private HotelStrategyVO hotelStrategy;
	private HotelStrategy_blservice service;

	public HotelStrategyModifyController() {

	}

	public void HotelStrategyModifyShow() {
		this.leftIdLabel.setText(this.hotelStaff.getId());
		this.leftNameLabel.setText(this.hotelStaff.getUsername());
		this.hotelName.setText(this.hotelStaff.getHotelName());
		// this.strategyInfo.setText(this.service.getHotelStrategy(this.hotel.getHotelID()));
	}

	public void initialize(Main main, HotelStaffVO hotelStaff, HotelInfoVO hotel) {
		// TODO Auto-generated method stub
		this.mainscene = main;
		this.hotelStaff = hotelStaff;
		this.hotel = hotel;
		this.HotelStrategyModifyShow();
	}

	public void handleSave() {
		// this.service.modifyHotelStrategy(this.hotelStrategy);
		this.mainscene.showHotelStrategyViewScene(this.hotelStaff, hotel);
	}

	public void handleback() {
		this.mainscene.showHotelStrategyViewScene(this.hotelStaff, hotel);
	}
}
