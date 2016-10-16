package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Member;
import java.rmi.RemoteException;

import po.MemberPO;

public class MemberDataServiceImpl {

	public static String memberFile="member.txt";
	
	
	public boolean  insert(MemberPO mpo) throws Exception {
		BufferedWriter bw=new BufferedWriter(new FileWriter(memberFile));
		
		return false;
		
	}
	
	public MemberPO find(String ID) throws Exception {
		BufferedReader bReader=new BufferedReader(new FileReader(memberFile));
		MemberPO mPo =new MemberPO(ID);
		
		return mPo;
		
	}
	
	public boolean update (MemberPO po) throws Exception {
		BufferedWriter bw=new BufferedWriter(new FileWriter(memberFile));
		BufferedReader bReader=new BufferedReader(new FileReader(memberFile));
		
		return false;
	}
	
}
