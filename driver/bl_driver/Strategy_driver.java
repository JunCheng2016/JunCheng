package bl_driver;

import blservice.StrategyService;
import businesslogic.StrategyServiceImpl;
import vo.StrategyVO;

public class Strategy_driver {
	public void drive(StrategyService ss){
		ss.addStrategy(new StrategyVO());
		ss.deleteStrategy("asd");
		ss.getInfo("ads");
	}
	public static void main(String[] args){
		Strategy_driver sd=new Strategy_driver();
		StrategyService ss=new StrategyServiceImpl();
		sd.drive(ss);
	}
}
