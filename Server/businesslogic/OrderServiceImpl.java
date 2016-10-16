package businesslogic;

import java.util.ArrayList;

import po.OrderPO;
import vo.OrderVO;

public class OrderServiceImpl {
	
	private ArrayList<OrderVO> OrderVo;
	private OrderVO OrderVO;
	public ArrayList<OrderVO> getOrder(String type) {
		if(type=="1"||type=="2"){
			return OrderVo;
		}else{
			return null;
		}
	}	
	
	public OrderVO getInfo(String ID) {
		if(ID=="01"){
			return OrderVO;
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
