package businesslogic.Userberbl;

import po.HotelPO;
import po.ResultMessage;
import po.UserPO;
import vo.HotelVO;
import vo.UserRole;
import vo.UserVO;

public class User {
	UserList ul=new UserList();
	HotelList hl=new HotelList();
	private UserRole ur;
	private String id;
	public User(UserRole ur,String ID){
		this.ur=ur;
		this.id=ID;
	}
	public ResultMessage addUser(User u){
		ul.addUser(u);
		return ResultMessage.Success;
	
	}
	public ResultMessage deleteUser(User u){
		ul.deleteUser(u);
		return ResultMessage.Success;
	}
	public ResultMessage modifyUser(String ID,UserPO po){
		if(ID=="NULL"||po==null){
			System.out.println("Not Found!");
			return ResultMessage.Failure;
		}else{
			System.out.println("Success");
			return ResultMessage.Success;
		}
	}
	public UserVO getUser(String ID,UserPO po){
		if(ID=="NULL"){
			return null;
		}else{
			System.out.println("find");
			return new UserVO();
		}
	}
	public ResultMessage addHotel(User h){
		hl.addHotel(h);
		return ResultMessage.Success;
	}
	public ResultMessage deleteHotel(User h){
		hl.deleteHotel(h);
		return ResultMessage.Success;
	}

	public ResultMessage modifyHotel(String Name,HotelPO po){
	if(Name=="NULL"||po==null){
		System.out.println("Not Found!");
		return ResultMessage.Failure;
	}else{
		System.out.println("Success");
		return ResultMessage.Success;
	}
}
	public HotelVO getHotel(String Name,HotelPO po){
		if(Name=="NULL"){
			return null;
		}else{
			System.out.println("find");
			return new HotelVO();
		}
	}
	public void endMaintain() {
		System.out.println("End!");
		
	}
}
