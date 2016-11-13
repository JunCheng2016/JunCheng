package businesslogic.Memberbl;

import blservice.MemberService;
import po.MemberPO;
import po.ResultMessage;
import vo.MemberVO;
import vo.UserRole;

public class MemberController implements MemberService{
	private Member m;
	public MemberVO getMemberInfo(String ID) throws Exception{
		if(m==null){
			m=new Member(ID,UserRole.Member);
		}
		return m.getMemberInfo(ID);
	}
	public ResultMessage modifyMemberInfo(String ID,MemberPO po) throws Exception{
		if(m==null){
			m=new Member(ID,UserRole.Member);
		}
		return m.modifyMemberInfo(ID, po);
	}
	public MemberList getMemberCreditInfo (String ID) throws Exception{
		return m.getMemberCreditInfo(ID);
	}
}
