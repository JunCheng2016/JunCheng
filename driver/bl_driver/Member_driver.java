package bl_driver;

import businesslogic.MemberServiceImpl;
import businesslogicservice.MemberService;
import vo.MemberVO;

public class Member_driver {
	public void drive(MemberService us){
		us.getInfo("123");
		us.getMember("Sales");
		us.modify(new MemberVO());
		us.register(new MemberVO());
	}
	public static void main(String[]args){
		Member_driver md=new Member_driver();
		MemberService ms=new MemberServiceImpl();
		md.drive(ms);
	}
}
