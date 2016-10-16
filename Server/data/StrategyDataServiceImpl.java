package data;

import java.rmi.RemoteException;

import po.StrategyPO;

public class StrategyDataServiceImpl {

	public boolean insert(StrategyPO spo)throws RemoteException {
		System.out.println("Insert succeed!");
		return true;
	}
	
	public boolean update(String name, StrategyPO po)throws RemoteException {
		System.out.println("Update succeed!");
		return true;
	}

	public boolean delete(StrategyPO spo)throws RemoteException {
		if(spo.equals(null)){
			System.out.println("Update failed!");
		}else{
			System.out.println("delete succeed!");
		}
		return true;
	}

	public StrategyPO find(String ID) throws RemoteException {
		if(ID!=null){
			System.out.println("Find succeed!");
		}else{
			System.out.println("Update failed!");
		}
		return null;
	}
}
