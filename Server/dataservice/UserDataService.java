package dataservice;

import po.UserPO;

public interface UserDataService {

	public UserPO find(String type,String ID);

	public boolean  update(String ID,UserPO po);
	
	public boolean  insert(UserPO po);
	
	public boolean  check(UserPO po);
}
