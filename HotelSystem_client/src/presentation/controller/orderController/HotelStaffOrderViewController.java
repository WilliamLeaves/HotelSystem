package presentation.controller.orderController;

import java.util.Date;

import VO.HotelStaffVO;
import VO.OrderVO;
import VO.SystemStrategyVO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import main.Main;

public class HotelStaffOrderViewController {

	@FXML
	private ImageView myPicture;
	@FXML
	private Label leftIdLabel;
	@FXML
	private Label leftNameLabel;
	@FXML
	private Button viewOrderInfo;//查看订单详情
	@FXML
	private Button Undo;//未执行
	@FXML
	private Button Exception;//异常订单
	@FXML
	private Button Done;//已执行订单
	@FXML
	private Button back;
	@FXML
	private Label orderType;
	@FXML
	private Label hotelName;
	@FXML
    private TableView<OrderVO> orderTable;
    @FXML
    private TableColumn<OrderVO, String> orderId;
    @FXML
    private TableColumn<OrderVO, String> customerId;
    @FXML
    private TableColumn<OrderVO, String> orderTpye;//订单类型（房间类型/数量）
    @FXML
    private TableColumn<OrderVO, Date> arriveTime;//到达时间
    
    public HotelStaffOrderViewController() {

	}

	public void HotelStaffOrderViewShow(Main mainScene) {

	}

	public void initialize(Main main, HotelStaffVO hotelStaff) {
		// TODO Auto-generated method stub
		
	}
    
}
