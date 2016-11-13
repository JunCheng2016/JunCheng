package businesslogicservice;
import po.ResultMessage;
import java.util.ArrayList;

import vo.MemberVO;

public interface MemberService {

	public MemberVO getInfo(String ID);
	
	public ResultMessage modify(MemberVO vo);
	
	public ResultMessage register(MemberVO vo);
	
	public ArrayList<MemberVO> getMember(String type);
	
	
}
