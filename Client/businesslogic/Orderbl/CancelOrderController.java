package businesslogic.Orderbl;

import po.ResultMessage;

public class CancelOrderController {
	private Order order;
	public CancelOrderController (Order o) {
		order=o;
	}
	public ResultMessage cancelOrder(String oid) {
		return order.cancelOrder(oid);
	}
}
