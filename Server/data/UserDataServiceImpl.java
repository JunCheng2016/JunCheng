package data;

import po.UserPO;

public class UserDataServiceImpl {

	public UserPO find(String type,String ID) {
		if(ID!=null){
			System.out.println("Find succeed!");
		}else{
			System.out.println("Update failed!");
		}
		return null;
	}

	public boolean  update(String ID,UserPO po) {
		System.out.println("Update succeed!");
		return true;
	}
	
	public boolean  insert(UserPO po) {
		System.out.println("Insert succeed!");
		return true;
	}
	
	public boolean  check(UserPO po) {
		System.out.println("Check succeed!");
		return true;
	}
}
