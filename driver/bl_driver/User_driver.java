package bl_driver;

import blservice.UserService;
import businesslogic.UserServiceImpl;
import vo.HotelVO;
import vo.MemberVO;
import vo.UserVO;

public class User_driver {
	public void drive(UserService us){
		us.addHotel(new HotelVO());
		us.addSales(new UserVO());
		us.deposit(new MemberVO(), 3.0);
		us.getUserInfo("Sales");
		us.login("0123", "456");
		us.updateUser("123456", new UserVO());
	}
	public static void main(String[]args){
		User_driver ud=new User_driver();
		UserService us=new UserServiceImpl();
		ud.drive(us);
	}
}
