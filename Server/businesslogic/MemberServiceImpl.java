package businesslogic;

import java.util.ArrayList;

import vo.MemberVO;

public class MemberServiceImpl {
	ArrayList<MemberVO> MemberList=new ArrayList<MemberVO>();
	public MemberVO getInfo(String ID) {
		if(ID=="1111"){
			return new MemberVO();
		}else{
			return null;
		}
	}
	
	public ResultMessage modify(MemberVO vo) {
		MemberList.remove(0);
		MemberList.add(vo);
		return ResultMessage.Success;
	}
	
	public ResultMessage register(MemberVO vo) {
		MemberList.add(vo);
		return ResultMessage.Success;
	}
	
	public ArrayList<MemberVO> getMember(String type) {
		return MemberList;
	}
	
}
