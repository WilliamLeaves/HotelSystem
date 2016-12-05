package presentation.controller.systemstrategyController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class SystemOtherStrategyModifyController {
	
	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button save;
	@FXML
	private Button delete;
	@FXML
	private Button back;
	@FXML
	private Label strategyType;
	@FXML
	private TextField nameOfStrategy;
	@FXML
	private TextArea descriptionOfStrategy;
	@FXML
	private TextField discountForCustomer;
	@FXML
	private RadioButton open;
	@FXML
	private RadioButton close;
}
