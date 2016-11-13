package businesslogic.Strategybl;

import java.util.HashMap;
import java.util.Map;

import vo.StrategyVO;
import vo.UserRole;

public class StrategyList {
	private Map<String,StrategyLineItem> list;
	private int number;
	public StrategyList(String ID,UserRole ur){
		//find strategy from database
		if(ID==null){
			list=new HashMap<String,StrategyLineItem>();
		}
	}
	public int getNumber(){
		return number;
	}
	public void addLineItem(double p,StrategyVO vo){
		StrategyLineItem sli=new StrategyLineItem(vo,p);
		list.put(sli.getStrategy().getStrategyName(),sli);
	}
	public StrategyLineItem getStrategy(String ID,UserRole ur){
		return list.get(ID);
	}
}
