package businesslogic.Memberbl;

import data.MemberDataServiceImpl;
import dataservice.MemberDataService;
import po.MemberPO;
import po.ResultMessage;
import vo.MemberVO;
import vo.UserRole;

public class Member {
	private MemberDataService mds;
	private MemberList ml;
	public Member(String i,UserRole r){
		mds=new MemberDataServiceImpl();
		//¥À¥¶”√
	}
	public MemberVO getMemberInfo(String ID) throws Exception{
		if(mds.find(ID)==null){
			return null;
		}else{
			System.out.println("find");
			return mds.find(ID);
		}
	}
	public ResultMessage modifyMemberInfo(String ID,MemberPO po) throws Exception{
		if(mds.find(ID)==null){
			System.out.println("Not Found!");
			return ResultMessage.Failure;
		}else{
			System.out.println("Success");
			mds.update(po);
			return ResultMessage.Success;
		}
	}
	public MemberList getMemberCreditInfo (String ID) throws Exception{
		if(mds.find(ID)==null){
			return null;
		}else{
			//while(){°≠°≠}
			addCredit(ID);
			return ml;
		}
	}
	private void addCredit(String ID){
		ml=new MemberList();
		/*mds.getAll(CreditItem)
		MemberItem mi=new MemberItem(ID,"",100.0,"XieCheng");
		ml.addMemberItem(mi);
		*/
	}
}
