package dataservice;

import java.rmi.RemoteException;

import businesslogic.ResultMessage;
import po.HotelPO;

public interface HotelDataService {

	public HotelPO find(String ID) throws RemoteException;
	
	public ResultMessage update(String ID, HotelPO po) throws RemoteException;
	
	public ResultMessage add(HotelPO po) throws RemoteException;
	
}
