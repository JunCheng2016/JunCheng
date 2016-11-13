package businesslogic.Strategybl;

import vo.OrderVO;
import vo.UserRole;

public class PriceController {
	private Strategy strategy;
	public StrategyList calPrice(String ID,UserRole ur,OrderVO vo){
		return strategy.calPrice(ID, ur, vo);
	}
	
	public void endMaintain(){
		strategy.endMaintain();
	}
}
