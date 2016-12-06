package presentation.controller.systemstrategyController;

import VO.SystemStrategyVO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class SystemMemberStrategyModifyController {

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
	private Label strategyType;//±íÍ·
	@FXML
	private TextField nameOfStrategy;
	@FXML
	private TextArea descriptionOfStrategy;
	@FXML
	private TableView<SystemStrategyVO> systemStrategyTable;
	@FXML
	private TableColumn<SystemStrategyVO, String> creditColumn;
	@FXML
	private TableColumn<SystemStrategyVO, String> memberGrade;
	@FXML
	private TableColumn<SystemStrategyVO, String> discount;
	@FXML
	private Button edit;
	@FXML
	private RadioButton open;
	@FXML
	private RadioButton close;
}
