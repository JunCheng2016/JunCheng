package businesslogicservice;

import businesslogic.ResultMessage;
import vo.StrategyVO;

public interface StrategyService {

	public StrategyVO getInfo(String name);
	
	public ResultMessage addStrategy(StrategyVO vo);
	
	public ResultMessage deleteStrategy(String name);
	
	
}
