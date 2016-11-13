package businesslogic.Orderbl;

import businesslogic.Strategybl.Strategy;
import po.OrderPO;

public class OrderItem {
	/**0表示未执行，1表示已执行，2表示订单已经取消,3表示异常,4表示已处理的异常的订单*/
	private int statue;
	private String orderID;
	private String userID;
	private String hotelID;
	private Strategy strategy;
	private String evaluation;
	private double price;
	private OrderPO orderPO;
	
	public OrderItem (OrderPO po) {
		orderPO=po;
	}
	/*从数据库取到数据*/
	 public OrderItem(String oid) {
		orderID=oid;
		
	}
}
