package data;

import java.rmi.RemoteException;
import java.util.ArrayList;

import businesslogic.OrderLimit;
import po.OrderPO;

public class OrderDataServiceImpl {

	public boolean insert(OrderPO po) throws RemoteException {
		return false;
}
	
	public OrderPO  find(String ID) throws RemoteException {
		return null;
	}
	
	public ArrayList<OrderPO> list(OrderLimit listLimit)throws RemoteException {
		return null;
	}

	public boolean update(OrderPO po) throws RemoteException {
		return false;
	}
}
