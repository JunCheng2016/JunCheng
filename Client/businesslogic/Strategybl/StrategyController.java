package businesslogic.Strategybl;

import java.rmi.RemoteException;
import java.util.Map;

import blservice.StrategyService;
import po.ResultMessage;
import po.StrategyPO;
import vo.StrategyVO;
import vo.UserRole;

public class StrategyController implements StrategyService{
	private Strategy strategy;
	public StrategyController(String ID,UserRole ur){
		if(strategy==null){
			strategy=new Strategy(ID,ur);
		}
	}
	public StrategyVO getStrategy (String ID,String StrategyName){
		return strategy.getStrategy(ID, StrategyName);
	} 
	
	public Map<String,StrategyVO> getStrategyList(String ID,UserRole ur)throws RemoteException{
		return strategy.getStrategyList();
	}
	
	public ResultMessage modifyStrategy(UserRole ur,String ID,StrategyPO po)throws RemoteException{
		return strategy.modifyStrategy(ur, ID, po);
	}
	
	public ResultMessage removeStrategy (UserRole ur,String ID,StrategyPO po) throws RemoteException{
		return strategy.removeStrategy(ur, ID, po);
	}
	
	public ResultMessage addStrategy(UserRole ur,String ID,StrategyPO po)throws RemoteException{
		return strategy.addStrategy(ur, ID, po);
	}
}
