package dataservice;

import java.rmi.RemoteException;

import po.StrategyPO;

public interface StrategyDataService {

	public boolean insert(StrategyPO spo)throws RemoteException;
	
	public boolean update(String name, StrategyPO po)throws RemoteException;

	public boolean delete(StrategyPO spo)throws RemoteException;

	public StrategyPO find(String ID) throws RemoteException;
}

