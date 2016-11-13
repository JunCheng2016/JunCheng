package businesslogic.Orderbl;

import po.ResultMessage;

public class GetOrderController {
	private Order order;
	
	public GetOrderController (Order o) {
		order=o;
	}
	
	public OrderItem getOrder(String oid) {
		return order.getOrder(oid);
	}
}
