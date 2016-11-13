package po;

import businesslogic.Orderbl.Order;
import businesslogic.Strategybl.Strategy;

public class OrderPO {
	private int statue;
	private String orderID;
	private String userID;
	private String hotelID;
	private Strategy strategy;
	private double price;
	
	public OrderPO (String orderid,int sta,String userid,String hotelid,Strategy strate,double pri) {
		this.statue=sta;
		this.userID =userid;
		this.hotelID=hotelid;
		this.orderID=orderid;
		this.strategy=strate;
		this.price=pri;
	}
	public OrderPO (String id){
		this.orderID=id;
	}
	
}
