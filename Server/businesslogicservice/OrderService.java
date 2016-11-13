package businesslogicservice;
import java.util.ArrayList;

import businesslogic.OrderLimit;
import po.OrderPO;
import po.ResultMessage;
import vo.OrderVO;

public interface OrderService {
	
	public ArrayList<OrderVO> getOrder(OrderLimit limit);	
	
	public OrderPO getInfo(String ID);
	
	public ResultMessage addOrder(OrderPO po);

	public ResultMessage updateOrder(OrderVO vo);

	public void endGetOrder();

	public void endMakeOrder();

	public void endCancelOrder();

	public void endHandleAbnormalOrder();

	public void endExecuteOrder();
	
	
}
