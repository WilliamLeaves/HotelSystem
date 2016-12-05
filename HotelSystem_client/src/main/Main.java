package main;

import java.io.IOException;

import VO.CustomerVO;
import VO.HotelInfoVO;
import VO.HotelStaffVO;
import VO.OrderVO;
import VO.SystemManagerVO;
import VO.SystemStaffVO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import presentation.controller.hotelController.BookHotelController;
import presentation.controller.hotelController.HotelInfoController;
import presentation.controller.hotelController.HotelStaffHotelInfoModifyController;
import presentation.controller.hotelController.HotelStaffHotelInfoViewController;
import presentation.controller.hotelController.HotelViewController;
import presentation.controller.hotelStrategyController.HotelStrategyModifyController;
import presentation.controller.hotelStrategyController.HotelStrategyViewController;
import presentation.controller.loginController.LoginController;
import presentation.controller.orderController.CustomerHotelAssessmentController;
import presentation.controller.orderController.CustomerOrderInfoViewController;
import presentation.controller.orderController.CustomerOrderViewController;
import presentation.controller.orderController.HotelStaffManagementOrderController;
import presentation.controller.orderController.HotelStaffOrderViewController;
import presentation.controller.registerController.RegisterController;
import presentation.controller.userInfoController.CustomerInfoController;
import presentation.controller.userInfoController.CustomerInfoModifyController;
import presentation.controller.userInfoController.CustomerMemberModifyController;
import presentation.controller.userInfoController.CustomerPasswordModifyController;
import presentation.controller.userInfoController.HotelStaffInfoController;
import presentation.controller.userInfoController.HotelStaffInfoModifyController;
import presentation.controller.userInfoController.HotelStaffPasswordModifyController;
import presentation.controller.userInfoController.SystemManagerInfoController;
import presentation.controller.userInfoController.SystemManagerInfoModifyController;
import presentation.controller.userInfoController.SystemManagerPasswordModifyController;
import presentation.controller.userInfoController.SystemStaffInfoController;
import presentation.controller.userInfoController.SystemStaffInfoModifyController;
import presentation.controller.userInfoController.SystemStaffPasswordModifyController;

public class Main extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;
	private BorderPane loginLayout;
	private BorderPane registerLayout;

	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("HotelSystem");
		// initRootLayout();
		this.showCustomerInfoScene(new CustomerVO());
		// this.showHotelStaffInfoScene(new HotelStaffVO());
		// this.showSystemStaffInfoScene(new SystemStaffVO());
		// this.showSystemManagerInfoScene(new SystemManagerVO());
		// this.showCustomerBookHotelScene(new CustomerVO(), new HotelInfoVO());
		// this.showCustomerHotelViewScene(new CustomerVO());
		// this.showCustomerMainScene(new CustomerVO());
		// this.showLoginScene();
	}

	public void Exit() {
		this.primaryStage.close();
	}

	/**
	 * 显示登录界面
	 */
	public void showLoginScene() {
		try {
			this.initLoginLayout();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/login_ui/LoginScene.fxml"));
			AnchorPane LoginScene = (AnchorPane) loader.load();
			loginLayout.setCenter(LoginScene);

			// get Controller
			LoginController LoginController = loader.getController();
			LoginController.initialize(this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 显示注册界面
	 */
	public void showRegisterScene() {
		try {
			this.initRegisterLayout();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/Register_ui/RegisterScene.fxml"));
			AnchorPane RegisterScene = (AnchorPane) loader.load();
			registerLayout.setCenter(RegisterScene);

			// get Controller
			RegisterController RegisterController = loader.getController();
			RegisterController.initialize(this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示客户用户的维护个人信息界面
	 * 
	 * @param customer
	 *            接受从其他界面传过来的CustomerVO 对象作为参数
	 */
	public void showCustomerInfoScene(CustomerVO customer) {
		// TODO Auto-generated method stub
		try {
			this.initRootLayout();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/userInfo_ui/CustomerInfoScene.fxml"));
			AnchorPane customerInfoScene = (AnchorPane) loader.load();
			rootLayout.setCenter(customerInfoScene);

			// get Controller
			CustomerInfoController customerInfoController = loader.getController();
			customerInfoController.initialize(this, customer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示客户用户的修改个人信息界面
	 * 
	 * @param customer
	 *            接受从其他界面传过来的CustomerVO 对象作为参数
	 */
	public void showCustomerModifyScene(CustomerVO customer) {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/userInfo_ui/CustomerInfoModifyScene.fxml"));
			AnchorPane customerInfoModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(customerInfoModifyScene);

			// get Controller
			CustomerInfoModifyController customerInfoModifyController = loader.getController();
			customerInfoModifyController.initialize(this, customer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示客户用户的修改密码界面
	 * 
	 * @param customer
	 *            接受从其他界面传过来的CustomerVO 对象作为参数
	 */
	public void showCustomerPasswordModifyScene(CustomerVO customer) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(
					Main.class.getResource("/presentation/view/userInfo_ui/CustomerPasswordModifyScene.fxml"));
			AnchorPane customerPasswordModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(customerPasswordModifyScene);

			// get Controller
			CustomerPasswordModifyController customerPasswordModifyController = loader.getController();
			customerPasswordModifyController.initialize(this, customer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示客户用户的注册会员界面
	 * 
	 * @param customer
	 *            接受从其他界面传过来的CustomerVO 对象作为参数
	 */
	public void showCustomerMemberModifyScene(CustomerVO customer) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/userInfo_ui/CustomerMemberModifyScene.fxml"));
			AnchorPane customerMemberModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(customerMemberModifyScene);

			// get Controller
			CustomerMemberModifyController customerMemberModifyController = loader.getController();
			customerMemberModifyController.initialize(this, customer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示酒店工作人员的维护个人信息界面
	 * 
	 * @param hotelStaff
	 *            接受从其他界面传过来的HotelStaffVO 对象作为参数
	 */
	public void showHotelStaffInfoScene(HotelStaffVO hotelStaff) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/userInfo_ui/HotelStaffInfoScene.fxml"));
			AnchorPane HotelStaffInfoScene = (AnchorPane) loader.load();
			rootLayout.setCenter(HotelStaffInfoScene);

			// get Controller
			HotelStaffInfoController HotelStaffInfoController = loader.getController();
			HotelStaffInfoController.initialize(this, hotelStaff);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示酒店工作人员修改个人信息界面
	 * 
	 * @param hotelStaff
	 *            接受从其他界面传来的HotalStaffVO 对象作为参数
	 */
	public void showHotelStaffInfoModifyScene(HotelStaffVO hotelStaff) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/userInfo_ui/HotelStaffInfoModifyScene.fxml"));
			AnchorPane HotelStaffInfoModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(HotelStaffInfoModifyScene);

			// get Controller
			HotelStaffInfoModifyController HotelStaffInfoModifyController = loader.getController();
			HotelStaffInfoModifyController.initialize(this, hotelStaff);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示酒店工作人员修改密码界面
	 * 
	 * @param hotelStaff
	 *            接受从其他界面传来的HotalStaffVO 对象作为参数
	 */
	public void showHotelStaffPasswordModifyScene(HotelStaffVO hotelStaff) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(
					Main.class.getResource("/presentation/view/userInfo_ui/HotelStaffPasswordModifyScene.fxml"));
			AnchorPane HotelStaffPasswordModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(HotelStaffPasswordModifyScene);

			// get Controller
			HotelStaffPasswordModifyController HotelStaffPasswordModifyController = loader.getController();
			HotelStaffPasswordModifyController.initialize(this, hotelStaff);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示网站营销人员维护个人信息界面
	 * 
	 * @param systemStaff
	 *            接受从其他界面传来的SystemStaffVO 对象作为参数
	 */
	public void showSystemStaffInfoScene(SystemStaffVO systemStaff) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/userInfo_ui/SystemStaffInfoScene.fxml"));
			AnchorPane SystemStaffInfoModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(SystemStaffInfoModifyScene);

			// get Controller
			SystemStaffInfoController SystemStaffInfoController = loader.getController();
			SystemStaffInfoController.initialize(this, systemStaff);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示网站营销人员修改个人信息界面
	 * 
	 * @param systemStaff
	 *            接受从其他界面传来的SystemStaffVO 对象作为参数
	 */
	public void showSystemStaffInfoModifyScene(SystemStaffVO systemStaff) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(
					Main.class.getResource("/presentation/view/userInfo_ui/SystemStaffInfoModifyScene.fxml"));
			AnchorPane SystemStaffInfoModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(SystemStaffInfoModifyScene);

			// get Controller
			SystemStaffInfoModifyController SystemStaffInfoModifyController = loader.getController();
			SystemStaffInfoModifyController.initialize(this, systemStaff);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示网站营销人员修改密码界面
	 * 
	 * @param systemStaff
	 *            接受从其他界面传来的SystemStaffVO 对象作为参数
	 */
	public void showSystemStaffPasswordModifyScene(SystemStaffVO systemStaff) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(
					Main.class.getResource("/presentation/view/userInfo_ui/SystemStaffPasswordModifyScene.fxml"));
			AnchorPane SystemStaffPasswordModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(SystemStaffPasswordModifyScene);

			// get Controller
			SystemStaffPasswordModifyController SystemStaffPasswordModifyController = loader.getController();
			SystemStaffPasswordModifyController.initialize(this, systemStaff);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示网站营销人员维护个人信息界面
	 * 
	 * @param systemManager
	 *            接受从其他界面传来的SystemManagerVO 对象作为参数
	 */
	public void showSystemManagerInfoScene(SystemManagerVO systemManager) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/userInfo_ui/SystemManagerInfoScene.fxml"));
			AnchorPane SystemManagerInfoScene = (AnchorPane) loader.load();
			rootLayout.setCenter(SystemManagerInfoScene);

			// get Controller
			SystemManagerInfoController SystemManagerInfoController = loader.getController();
			SystemManagerInfoController.initialize(this, systemManager);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示网站营销人员修改个人信息界面
	 * 
	 * @param systemManager
	 *            接受从其他界面传来的SystemManagerVO 对象作为参数
	 */
	public void showSystemManagerInfoModifyScene(SystemManagerVO systemManager) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(
					Main.class.getResource("/presentation/view/userInfo_ui/SystemManagerInfoModifyScene.fxml"));
			AnchorPane SystemManagerInfoModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(SystemManagerInfoModifyScene);

			// get Controller
			SystemManagerInfoModifyController SystemManagerInfoModifyController = loader.getController();
			SystemManagerInfoModifyController.initialize(this, systemManager);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示网站营销人员修改密码界面
	 * 
	 * @param systemManager
	 *            接受从其他界面传来的SystemManagerVO 对象作为参数
	 */
	public void showSystemManagerPasswordModifyScene(SystemManagerVO systemManager) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(
					Main.class.getResource("/presentation/view/userInfo_ui/SystemManagerPasswordModifyScene.fxml"));
			AnchorPane SystemManagerPasswordModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(SystemManagerPasswordModifyScene);

			// get Controller
			SystemManagerPasswordModifyController SystemManagerPasswordModifyController = loader.getController();
			SystemManagerPasswordModifyController.initialize(this, systemManager);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示客户用户主界面，接受来自其他界面的customerVO对象
	 * 
	 * @param customer
	 */
	public void showCustomerMainScene(CustomerVO customer) {
		try {
			this.initRootLayout();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/Main/CustomerMainScene.fxml"));
			AnchorPane CustomerMainScene = (AnchorPane) loader.load();
			rootLayout.setCenter(CustomerMainScene);

			// get Controller
			CustomerMainController CustomerMainController = loader.getController();
			CustomerMainController.initialize(this, customer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示客户用户预定酒店客房界面
	 * 
	 * @param customer
	 *            来自其他界面的customerVO对象
	 * @param hotel
	 *            来自其他界面的hotelVO对象
	 */
	public void showCustomerBookHotelScene(CustomerVO customer, HotelInfoVO hotel) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/hotel_ui/BookHotelScene.fxml"));
			AnchorPane BookHotelScene = (AnchorPane) loader.load();
			rootLayout.setCenter(BookHotelScene);

			// get Controller
			BookHotelController BookHotelController = loader.getController();
			BookHotelController.initialize(this, customer, hotel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示客户用户查看酒店详情界面
	 * 
	 * @param customer
	 * @param hotel
	 */
	public void showCustomerHotelInfoScene(CustomerVO customer, HotelInfoVO hotel) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/hotel_ui/HotelInfoScene.fxml"));
			AnchorPane HotelInfoScene = (AnchorPane) loader.load();
			rootLayout.setCenter(HotelInfoScene);

			// get Controller
			HotelInfoController HotelInfoController = loader.getController();
			HotelInfoController.initialize(this, customer, hotel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示客户用户查看酒店列表界面
	 * 
	 * @param customer
	 * @param hotel
	 */
	public void showCustomerHotelViewScene(CustomerVO customer) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/hotel_ui/HotelViewScene.fxml"));
			AnchorPane HotelViewScene = (AnchorPane) loader.load();
			rootLayout.setCenter(HotelViewScene);

			// get Controller
			HotelViewController HotelViewController = loader.getController();
			HotelViewController.initialize(this, customer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示客户用户查看订单列表界面
	 * 
	 * @param customer
	 */
	public void showCustomerOrderViewScene(CustomerVO customer) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/order_ui/CustomerOrderViewScene.fxml"));
			AnchorPane CustomerOrderViewScene = (AnchorPane) loader.load();
			rootLayout.setCenter(CustomerOrderViewScene);

			// get Controller
			CustomerOrderViewController CustomerOrderViewController = loader.getController();
			CustomerOrderViewController.initialize(this, customer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示客户用户查看订单详情界面
	 * 
	 * @param customer
	 * @param orderVO
	 */
	public void showCustomerOrderInfoViewScene(CustomerVO customer, OrderVO orderVO) {
		// TODO Auto-generated method stub
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/order_ui/CustomerOrderInfoViewScene.fxml"));
			AnchorPane CustomerOrderInfoViewScene = (AnchorPane) loader.load();
			rootLayout.setCenter(CustomerOrderInfoViewScene);

			// get Controller
			CustomerOrderInfoViewController CustomerOrderInfoViewController = loader.getController();
			CustomerOrderInfoViewController.initialize(this, customer, orderVO);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示客户用户评价订单界面
	 * 
	 * @param customer
	 * @param hotel
	 * @param order
	 */
	public void showHotelAssessmentScene(CustomerVO customer, HotelInfoVO hotel, OrderVO order) {
		// TODO Auto-generated method stub
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/order_ui/CustomerHotelAssessmentScene.fxml"));
			AnchorPane CustomerHotelAssessmentScene = (AnchorPane) loader.load();
			rootLayout.setCenter(CustomerHotelAssessmentScene);

			// get Controller
			CustomerHotelAssessmentController CustomerHotelAssessmentController = loader.getController();
			CustomerHotelAssessmentController.initialize(this, customer, hotel, order);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示酒店工作人员主界面
	 * 
	 * @param hotelStaff
	 */
	public void showHotelStaffMainScene(HotelStaffVO hotelStaff) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/main/HotelStaffMainScene.fxml"));
			AnchorPane HotelStaffMainScene = (AnchorPane) loader.load();
			rootLayout.setCenter(HotelStaffMainScene);

			// get Controller
			HotelStaffMainController HotelStaffMainController = loader.getController();
			HotelStaffMainController.initialize(this, hotelStaff);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示酒店工作人员酒店订单显示界面
	 * 
	 * @param hotelStaff
	 */
	public void showHotelStaffOrderViewScene(HotelStaffVO hotelStaff) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/order_ui/HotelStaffOrderViewScene.fxml"));
			AnchorPane HotelStaffOrderViewScene = (AnchorPane) loader.load();
			rootLayout.setCenter(HotelStaffOrderViewScene);

			// get Controller
			HotelStaffOrderViewController HotelStaffOrderViewController = loader.getController();
			HotelStaffOrderViewController.initialize(this, hotelStaff);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示酒店工作人员管理酒店订单界面
	 * 
	 * @param hotelStaff
	 * @param order
	 */
	public void showHotelStaffManagementOrderScene(HotelStaffVO hotelStaff, OrderVO order) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(
					Main.class.getResource("/presentation/view/order_ui/HotelStaffManagementOrderScene.fxml"));
			AnchorPane HotelStaffManagementOrderScene = (AnchorPane) loader.load();
			rootLayout.setCenter(HotelStaffManagementOrderScene);

			// get Controller
			HotelStaffManagementOrderController HotelStaffManagementOrderController = loader.getController();
			HotelStaffManagementOrderController.initialize(this, hotelStaff, order);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示酒店工作人员维护酒店信息界面
	 * 
	 * @param hotel
	 */
	public void showHotelStaffHotelInfoViewScene(HotelInfoVO hotel) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/presentation/view/hotel_ui/HotelStaffHotelInfoViewScene.fxml"));
			AnchorPane HotelStaffHotelInfoViewScene = (AnchorPane) loader.load();
			rootLayout.setCenter(HotelStaffHotelInfoViewScene);

			// get Controller
			HotelStaffHotelInfoViewController HotelStaffHotelInfoViewController = loader.getController();
			HotelStaffHotelInfoViewController.initialize(this, hotel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示酒店工作人员修改酒店信息界面
	 * 
	 * @param hotel
	 */
	public void showHotelStaffHotelInfoModifyScene(HotelInfoVO hotel) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(
					Main.class.getResource("/presentation/view/hotel_ui/HotelStaffHotelInfoModifyScene.fxml"));
			AnchorPane HotelStaffHotelInfoModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(HotelStaffHotelInfoModifyScene);

			// get Controller
			HotelStaffHotelInfoModifyController HotelStaffHotelInfoModifyController = loader.getController();
			HotelStaffHotelInfoModifyController.initialize(this, hotel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示酒店工作人员制定酒店营销策略界面
	 * 
	 * @param hotel
	 */
	public void showHotelStrategyViewScene(HotelInfoVO hotel) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(
					Main.class.getResource("/presentation/view/hotelStrategy_ui/HotelStrategyViewScene.fxml"));
			AnchorPane HotelStrategyViewScene = (AnchorPane) loader.load();
			rootLayout.setCenter(HotelStrategyViewScene);

			// get Controller
			HotelStrategyViewController HotelStrategyViewController = loader.getController();
			HotelStrategyViewController.initialize(this, hotel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * show 显示酒店工作人员修改酒店营销策略界面
	 * 
	 * @param hotel
	 */
	public void showHotelStrategyModifyScene(HotelInfoVO hotel) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(
					Main.class.getResource("/presentation/view/hotelStrategy_ui/HotelStrategyModifyScene.fxml"));
			AnchorPane HotelStrategyModifyScene = (AnchorPane) loader.load();
			rootLayout.setCenter(HotelStrategyModifyScene);

			// get Controller
			HotelStrategyModifyController HotelStrategyModifyController = loader.getController();
			HotelStrategyModifyController.initialize(this, hotel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void initRootLayout() {
		// TODO Auto-generated method stub
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();

			Scene scene = new Scene(rootLayout);
			this.primaryStage.setScene(scene);
			this.primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void initLoginLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("LoginLayout.fxml"));
			loginLayout = (BorderPane) loader.load();

			Scene scene = new Scene(loginLayout);
			this.primaryStage.setScene(scene);
			this.primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void initRegisterLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("RegisterLayout.fxml"));
			registerLayout = (BorderPane) loader.load();

			Scene scene = new Scene(registerLayout);
			this.primaryStage.setScene(scene);
			this.primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
