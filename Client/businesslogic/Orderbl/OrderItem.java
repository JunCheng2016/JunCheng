package businesslogic.Orderbl;

import businesslogic.Strategybl.Strategy;
import po.OrderPO;

public class OrderItem {
	/**0��ʾδִ�У�1��ʾ��ִ�У�2��ʾ�����Ѿ�ȡ��,3��ʾ�쳣,4��ʾ�Ѵ�����쳣�Ķ���*/
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
	/*�����ݿ�ȡ������*/
	 public OrderItem(String oid) {
		orderID=oid;
		
	}
}
