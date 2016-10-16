package blservice;

import java.util.ArrayList;

import businesslogic.ResultMessage;
import vo.MemberVO;

public interface MemberService {

	public MemberVO getInfo(String ID);
	
	public ResultMessage modify(MemberVO vo);
	
	public ResultMessage register(MemberVO vo);
	
	public ArrayList<MemberVO> getMember(String type);
	
	
}
