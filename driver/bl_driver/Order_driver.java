package bl_driver;

import businesslogic.OrderLimit;
import businesslogic.OrderServiceImpl;
import businesslogicservice.OrderService;
import po.OrderPO;
import vo.OrderVO;

public class Order_driver {
	public void drive(OrderService os){
		os.addOrder(new OrderPO());
		os.getInfo("ASD");
		os.getOrder(new OrderLimit());
		os.updateOrder(new OrderVO());
	}
	public static void main(String[] args){
		Order_driver od=new Order_driver();
		OrderService os=new OrderServiceImpl();
		od.drive(os);
	}
}
