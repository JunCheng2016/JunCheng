package businesslogicservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import businesslogic.OrderLimit;
import businesslogic.ResultMessage;
import po.OrderPO;
import vo.OrderVO;

public interface OrderService {
	
	public ArrayList<OrderVO> getOrder(OrderLimit limit);	
	
	public OrderPO getInfo(String ID);
	
	public ResultMessage addOrder(OrderPO po);

	public ResultMessage updateOrder(OrderVO vo);
	
	
}
