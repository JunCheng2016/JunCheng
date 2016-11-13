package businesslogicservice;



import po.ResultMessage;
import vo.HotelVO;
import vo.MemberVO;
import vo.UserVO;

public interface UserService {
	
	public ResultMessage login(String Id,String password);
	
	public UserVO getUserInfo(String type);
	
	public ResultMessage updateUser(String Id,UserVO vo);
	
	public ResultMessage addSales(UserVO vo);
	
	public ResultMessage addHotel(HotelVO vo);
	
	public ResultMessage deposit(MemberVO vo,double money);
	
	
}
