package businesslogic.Orderbl;

import businesslogic.Strategybl.Strategy;
import dataservice.OrderDataService;
import po.OrderPO;
import po.ResultMessage;

public class Order {
	/**0��ʾδִ�У�1��ʾ��ִ�У�2��ʾ�����Ѿ�ȡ��,3��ʾ�쳣,4��ʾ�Ѵ�����쳣�Ķ���*/
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
		//�½�����ʱ��ĳ�ʼ����
		OrderPO po=new OrderPO(orderid,sta,userid,hotelid,strate,pri);
		orderItem=new OrderItem(po);
	}
	
	/**ͨ��id�����ݿ��л�ȡ����*/
	public Order(String id){
		orderID=id;
	}
	
	public Order(OrderPO po){
		//��Ӧpo
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
	
	/**�����ݿ�������������Ϣ*/
	public ResultMessage addOrder(OrderItem orderItem){
		System.out.println("sucess");
		if (true) {
			//��������
			return ResultMessage.Success;
		}else{
			return ResultMessage.Failure;
		}
	}
	
	/**ͨ��IDȡ������*/
	public ResultMessage cancelOrder(String orderid){
		Order order=new Order(orderid);
		System.out.println("sucess");
		if(order.statue==0){
			order.statue=3;
			return ResultMessage.Success;
			//��Ҫ����order
		}else{
			return ResultMessage.Failure;
		}
	}
	
	public ResultMessage evaluateOrder(String evaluation,String oid) {
		Order order=new Order(oid);
		if (order.statue==1&&order.evaluation==null) {
			order.evaluation=evaluation;
			//��Ҫ����order
			return ResultMessage.Success;
		}else{
			return ResultMessage.Failure;
		}
				
	}
	/**ͨ��IDִ�ж���*/
	public ResultMessage executeOrder(String oid){
		Order order=new Order(oid);
		System.out.println("sucess");
		if(order.statue==0){
			order.statue=1;
			//��������order
			return ResultMessage.Success;
		}else{
			return ResultMessage.Failure;
		}
		
	}
	/**ͨ��ID�����쳣����*/
	public ResultMessage handleAbnormalOrder(String oid){
		Order order =new Order(oid );
		System.out.println("sucess");
		if(order.statue==3){
			order.statue=4;
			return ResultMessage.Success;
			//��������
		}else{
			return ResultMessage.Failure;
		}
	}


}

