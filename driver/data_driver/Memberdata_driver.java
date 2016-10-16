package data_driver;

import businesslogic.ResultMessage;
import dataservice.MemberDataService;
import po.MemberPO;

public class Memberdata_driver {
	public void drive(MemberDataService mds) throws Exception{
		MemberPO mPO=new MemberPO();
		mPO=mds.find("0000");
		ResultMessage rMessage1=mds.insert( mPO);
		ResultMessage rMessage2=mds.update(mPO);
	}
}
