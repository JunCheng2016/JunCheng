package dataservice;

import java.rmi.RemoteException;

import po.MemberPO;

public interface MemberDataService {

	public boolean  insert(MemberPO mpo) throws RemoteException;
	
	public MemberPO find(String ID);
	
	public boolean update (MemberPO po);
	
}
