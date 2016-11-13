package businesslogic.Orderbl;

import java.util.ArrayList;

import po.ResultMessage;

public class OrderList {
	private ArrayList<OrderItem> orderList=new ArrayList<>();
	
	public ArrayList<OrderItem> getOrderList() {
		return orderList;
	}
	
	public ResultMessage  addOrderItem(OrderItem item) {
		try {
			orderList.add(item);
			return ResultMessage.Success;
		} catch (Exception e) {
			return ResultMessage.Failure;
		}
	}
	
}
