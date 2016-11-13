package businesslogic.Orderbl;

import po.ResultMessage;

public class AddOrderController {
	private Order order;
	
	public ResultMessage addOrder(OrderItem item) {
		return order.addOrder(item);
	}
}
