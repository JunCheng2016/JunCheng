package businesslogicservice;



import businesslogic.ResultMessage;
import vo.HotelVO;
import vo.MemberVO;
import vo.UserVO;

public interface UserService {
	
	public ResultMessage login(String Id,String password);
	
	public UserVO getUserInfo(String type);
	
	public ResultMessage updateUser(String Id,UserVO vo);
	
	public ResultMessage addSales(UserVO vo);
	
	public ResultMessage addHotel(HotelVO vo);
	
	public ResultMessage addHotel(MemberVO vo,double money);
	
	public ResultMessage deposit(MemberVO vo,double money);
	
	
}
