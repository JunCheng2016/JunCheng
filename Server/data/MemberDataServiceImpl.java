package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import po.MemberPO;
import po.ResultMessage;

public class MemberDataServiceImpl {

	public static String memberFile="member.txt";
	
	
	public ResultMessage  insert(MemberPO mpo) throws Exception {
		BufferedWriter bw=new BufferedWriter(new FileWriter(memberFile));
		
		return ResultMessage.Success;
		
	}
	
	public MemberPO find(String ID) throws Exception {
		BufferedReader bReader=new BufferedReader(new FileReader(memberFile));
		MemberPO mPo =new MemberPO();
		
		return mPo;
		
	}
	
	public ResultMessage update (MemberPO po) throws Exception {
		BufferedWriter bw=new BufferedWriter(new FileWriter(memberFile));
		BufferedReader bReader=new BufferedReader(new FileReader(memberFile));
		
		return ResultMessage.Success;
	}
	
}
