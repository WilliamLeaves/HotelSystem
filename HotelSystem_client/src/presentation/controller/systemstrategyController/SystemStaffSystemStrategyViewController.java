package presentation.controller.systemstrategyController;

import VO.SystemStrategyVO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import main.Main;

public class SystemStaffSystemStrategyViewController {

	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button modifyStrategy;
	@FXML
	private Button viewMemberDiscount;
	@FXML
	private Button viewFestivelDiscount;
	@FXML
	private Button viewOtherDiscount;
	@FXML
	private Button back;
	@FXML
	private Label buttonLabel;
	@FXML
    private TableView<SystemStrategyVO> systemStrategyTable;
    @FXML
    private TableColumn<SystemStrategyVO, String> nameOfStrategy;
    @FXML
    private TableColumn<SystemStrategyVO, String> descriptionOfStrategy;
    @FXML
    private TableColumn<SystemStrategyVO, String> stateOfStrategy;
    
    public SystemStaffSystemStrategyViewController(){		
	}
	
	public void SystemStaffSystemStrategyViewShow(Main mainScene) {

	}
}
