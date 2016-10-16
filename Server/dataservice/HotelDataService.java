package dataservice;

import java.rmi.RemoteException;

import po.HotelPO;

public interface HotelDataService {

	public HotelPO find(String ID) throws RemoteException;
	
	public boolean update(String ID, HotelPO po) throws RemoteException;
	
	public Boolean add(HotelPO po) throws RemoteException;
	
}
