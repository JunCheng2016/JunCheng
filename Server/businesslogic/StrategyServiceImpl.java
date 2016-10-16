package businesslogic;

import vo.StrategyVO;

public class StrategyServiceImpl {

	private StrategyVO StrategyVO;

	public StrategyVO getInfo(String name) {
		if(name=="01"){
			return StrategyVO;
		}else{
			return null;
		}
	}
	
	public ResultMessage addStrategy(StrategyVO vo) {
		if(vo!=null){
			return ResultMessage.Success;
		}else{
			return ResultMessage.Failure;
		}
	}
	
	public ResultMessage deleteStrategy(String name) {
		if(name!=null){
			return ResultMessage.Success;
		}else{
			return ResultMessage.Failure;
		}
	}
	
	
}
