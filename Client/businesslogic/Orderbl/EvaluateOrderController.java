package businesslogic.Orderbl;

import po.ResultMessage;

public class EvaluateOrderController {
	private Order order;
	
	public EvaluateOrderController (Order o) {
		order=o;
	}
	
	public ResultMessage evaluateOrder(String evaluation,String oid) {
		return order.evaluateOrder(evaluation,oid);
	}
	
}
