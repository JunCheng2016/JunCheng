package businesslogic.Memberbl;

import java.util.ArrayList;

public class MemberList {
	private ArrayList<MemberItem> list;
	public MemberList(){
		list=new ArrayList<MemberItem>();
	}
	public void addMemberItem(MemberItem mi){
		list.add(mi);
	}
	public MemberList getMemberList(){
		return this;
	}
}
