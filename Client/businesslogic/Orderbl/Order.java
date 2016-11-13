package businesslogic.Orderbl;

import businesslogic.Strategybl.Strategy;
import dataservice.OrderDataService;
import po.OrderPO;
import po.ResultMessage;

public class Order {
	/**0表示未执行，1表示已执行，2表示订单已经取消,3表示异常,4表示已处理的异常的订单*/
	private int statue;
	private String orderID;
	private String userID;
	private String hotelID;
	private Strategy strategy;
	private String evaluation;
	private double price;
	private OrderItem orderItem;
	private OrderList orderList=new OrderList();
	/*private OrderDataService oDataService=new OrderDataServiceImpl();*/
	
	public Order (String orderid,int sta,String userid,String hotelid,Strategy strate,double pri) {
		//新建订单时候的初始对象
		OrderPO po=new OrderPO(orderid,sta,userid,hotelid,strate,pri);
		orderItem=new OrderItem(po);
	}
	
	/**通过id从数据库中获取对象*/
	public Order(String id){
		orderID=id;
	}
	
	public Order(OrderPO po){
		//对应po
	}
	
	public OrderItem getOrder(String oid) {
		OrderItem orderItem  =new OrderItem(oid);
		System.out.println("sucess");
		return orderItem;
	}
	
	public OrderList getOrderList () {
		OrderPO po = null;
		while(po!=null){
			OrderItem item =new OrderItem(po);
			orderList.addOrderItem(item);
		}
		System.out.println("sucess");
		return orderList;
	}
	
	/**在数据库中新增订单信息*/
	public ResultMessage addOrder(OrderItem orderItem){
		System.out.println("sucess");
		if (true) {
			//更新数据
			return ResultMessage.Success;
		}else{
			return ResultMessage.Failure;
		}
	}
	
	/**通过ID取消订单*/
	public ResultMessage cancelOrder(String orderid){
		Order order=new Order(orderid);
		System.out.println("sucess");
		if(order.statue==0){
			order.statue=3;
			return ResultMessage.Success;
			//需要更新order
		}else{
			return ResultMessage.Failure;
		}
	}
	
	public ResultMessage evaluateOrder(String evaluation,String oid) {
		Order order=new Order(oid);
		if (order.statue==1&&order.evaluation==null) {
			order.evaluation=evaluation;
			//需要更新order
			return ResultMessage.Success;
		}else{
			return ResultMessage.Failure;
		}
				
	}
	/**通过ID执行订单*/
	public ResultMessage executeOrder(String oid){
		Order order=new Order(oid);
		System.out.println("sucess");
		if(order.statue==0){
			order.statue=1;
			//更新数据order
			return ResultMessage.Success;
		}else{
			return ResultMessage.Failure;
		}
		
	}
	/**通过ID处理异常订单*/
	public ResultMessage handleAbnormalOrder(String oid){
		Order order =new Order(oid );
		System.out.println("sucess");
		if(order.statue==3){
			order.statue=4;
			return ResultMessage.Success;
			//更新数据
		}else{
			return ResultMessage.Failure;
		}
	}


}

