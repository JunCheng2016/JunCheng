package dataservice;

import java.rmi.RemoteException;

import businesslogic.ResultMessage;
import po.MemberPO;

public interface MemberDataService {

	public ResultMessage  insert(MemberPO mpo) throws RemoteException;
	
	public MemberPO find(String ID);
	
	public ResultMessage update (MemberPO po);
	
}
