package businesslogic;

import java.util.ArrayList;

import businesslogicservice.UserService;
import vo.HotelVO;
import vo.MemberVO;
import vo.UserVO;

public class UserServiceImpl implements UserService{
	private ArrayList<UserVO> UserList=new ArrayList<UserVO>();
	private ArrayList<HotelVO> HotelList=new ArrayList<HotelVO>();
	public ResultMessage login(String Id,String password) {
		if(Id=="0001"&&password=="012345"){
			return ResultMessage.Success;
		}
		return ResultMessage.Failure;
	}
	
	public UserVO getUserInfo(String type) {
		switch(type){
		case "Manager":
			return new UserVO();
		case "Customer":
			return new UserVO();
		case "Sales":
			return new UserVO();
		case "HotelWorker":
			return new UserVO();
		default:
			return null; 
		}
	}
	
	public ResultMessage updateUser(String Id,UserVO vo) {
		System.out.println("Update successfully!");
		return ResultMessage.Success;
	}
	
	public ResultMessage addSales(UserVO vo) {
		UserList.add(vo);
		return ResultMessage.Success;
	}
	
	public ResultMessage addHotel(HotelVO vo) {
		HotelList.add(vo);
		return ResultMessage.Success;
	}
	
	public ResultMessage deposit(MemberVO vo,double money) {
		System.out.println("Bob has gain гд5");
		return ResultMessage.Success;
	}
	
}
