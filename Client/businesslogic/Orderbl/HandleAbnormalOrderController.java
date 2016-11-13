package businesslogic.Orderbl;

import po.ResultMessage;

public class HandleAbnormalOrderController {
	private Order order;
	
	public HandleAbnormalOrderController (Order o) {
		order=o;
	}
	
	public ResultMessage handleAbnormalOrder(String oid) {
		return order.handleAbnormalOrder(oid);
	}
}
