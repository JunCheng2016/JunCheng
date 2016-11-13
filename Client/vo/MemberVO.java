package vo;

public class MemberVO {
	private String Id;
	private String name;
	private String password;
	private UserRole role;
	private double credit;
	public MemberVO(String i,UserRole r){
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
}
