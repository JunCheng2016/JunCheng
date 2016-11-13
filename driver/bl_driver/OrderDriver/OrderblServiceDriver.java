package bl_driver.OrderDriver;

import po.ResultMessage;
import vo.OrderVO;
import businesslogicservice.OrderService;
import po.OrderPO;

public class OrderblServiceDriver {
	public void getOrderDrive(OrderService orderService ){
		OrderPO po =orderService.getInfo("00000");
		if(po!=null ){
			System.out.println("order exist\n");
		}
		orderService.endGetOrder();
	}
	
	public void  makeOrderDrive(OrderService orderService){
		OrderPO po=new OrderPO();
		ResultMessage resultMessage =orderService.addOrder(po);
		if(resultMessage==ResultMessage.Success){
			System.out.println	("add success");
		}
		orderService.endMakeOrder();
	}
	
	public void cancelOrderDrive(OrderService orderService) {
		OrderVO vo=new OrderVO();
		ResultMessage resultMessage=orderService.updateOrder(vo);
		if (resultMessage==ResultMessage.Success) {
			System.out.println	("cancel success");
		}
		orderService.endCancelOrder();
	}
	
	public void evaluateOrderDrive(OrderService orderService) {
		OrderVO vo=new OrderVO();
		ResultMessage resultMessage=orderService.updateOrder(vo);
		if (resultMessage==ResultMessage.Success) {
			System.out.println("evaluate success");
		}
		orderService.endCancelOrder();
	}
	
	public void   handleAbnormalOrderDrive(OrderService orderService) {
		OrderVO vo=new OrderVO();
		ResultMessage resultMessage=orderService.updateOrder(vo);
		if (resultMessage==ResultMessage.Success) {
			System.out.println("evaluate success");
		}
		orderService.endHandleAbnormalOrder();
	}
	
	public void   ExecuteOrderDrive(OrderService orderService) {
		OrderVO vo=new OrderVO();
		ResultMessage resultMessage=orderService.updateOrder(vo);
		if (resultMessage==ResultMessage.Success) {
			System.out.println("evaluate success");
		}
		orderService.endExecuteOrder();
	}
}