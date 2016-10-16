package po;

import vo.UserRole;

public class UserPO {
	String Id;
	String name;
	String password;
	UserRole role;
	public UserPO(String i,String n,String p,UserRole r){
		Id=i;
		name=n;
		password=p;
		role=r;
	}
	public String getId(){
		return Id;
	}
	public String getName(){
		return name;
	}
	public String getPassword(){
		return password;
	}
	public UserRole getUserRole(){
		return role;
	}
}
