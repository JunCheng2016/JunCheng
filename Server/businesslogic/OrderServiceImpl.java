package businesslogic;

import java.util.ArrayList;

import businesslogicservice.OrderService;
import po.OrderPO;
import vo.OrderVO;

public class OrderServiceImpl implements OrderService{
	
	private ArrayList<OrderVO> OrderVo;
	private OrderVO OrderVO;
	private OrderPO OrderPO;
	public ArrayList<OrderVO> getOrder(OrderLimit limit) {
		if(limit != null){
			return OrderVo;
		}else{
			return null;
		}
	}	
	
	public OrderPO getInfo(String ID) {
		if(ID=="01"){
			return OrderPO;
		}else{
			return null;
		}
	}
	
	public ResultMessage addOrder(OrderPO po) {
		if(po!=null){
			return ResultMessage.Success;
		}else{
			return ResultMessage.Failure;
		}
	}

	public ResultMessage updateOrder(OrderVO vo) {
		if(vo!=null){
			return ResultMessage.Success;
		}else{
			return ResultMessage.Failure;
		}
	}

}
