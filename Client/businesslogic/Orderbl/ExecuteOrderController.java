package businesslogic.Orderbl;

import po.ResultMessage;

public class ExecuteOrderController {
	private Order order;
	
	public ExecuteOrderController (Order o) {
		order=o;
	}
	
	public ResultMessage executeOrder(String oid) {
		return order.executeOrder(oid);
	}
}
