package dataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import businesslogic.OrderLimit;
import po.OrderPO;

public interface OrderDataService {
	public boolean insert(OrderPO po) throws RemoteException;
	
	public OrderPO  find(String ID) throws RemoteException;
	
	public ArrayList<OrderPO> list(OrderLimit listLimit)throws RemoteException;

	public boolean update(OrderPO po) throws RemoteException;
}
