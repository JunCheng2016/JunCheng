package po;

import vo.UserRole;

public class MemberPO {
	private String Id;
	private String name;
	private String password;
	private UserRole role;
	private double credit;
	public MemberPO(String i,UserRole r){
		Id=i;
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
	public double getCredit(){
		return credit;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public void setCredit(double x){
		credit+=x;
	}
}