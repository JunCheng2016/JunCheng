package businesslogic.Strategybl;

import java.rmi.RemoteException;
import java.util.Map;

import data.StrategyDataServiceImpl;
import dataservice.StrategyDataService;
import po.ResultMessage;
import po.StrategyPO;
import vo.OrderVO;
import vo.StrategyVO;
import vo.UserRole;

public class Strategy {
	private StrategyDataService sds;
	private String id;
	private StrategyList strategy_price;
	private Map<String,StrategyVO> strategylist;
	public Strategy(String ID,UserRole ur){
		sds=new StrategyDataServiceImpl();
		id=ID;
	}
	public Map<String,StrategyVO> getStrategyList() throws RemoteException{
		if(sds.findAll(id)==null){
			return null;
		}else{
			strategylist=sds.findAll(id);
			return strategylist;
		}
	}
	
	public StrategyVO getStrategy (String ID,String StrategyName){
		if(strategylist!=null){
			return strategylist.get(StrategyName);
		}
		return null;
	}
	
	public ResultMessage modifyStrategy(UserRole ur,String ID,StrategyPO po) throws RemoteException{
		if(sds.find(ID,"po.getName")!=null&&sds.find(ID,"po.getName").getUserRole()==ur){
			return sds.insert(po);
		}
		return ResultMessage.Failure;
	}
	
	public ResultMessage removeStrategy (UserRole ur,String ID,StrategyPO po) throws RemoteException{
		if(sds.find(ID,"po.getName")!=null&&sds.find(ID,"po.getName").getUserRole()==ur){
			return sds.delete(po);
		}
		return ResultMessage.Failure;
	}
	
	public ResultMessage addStrategy(UserRole ur,String ID,StrategyPO po) throws RemoteException{
		if(sds.findAll(ID)!=null&&sds.find(ID,"po.getName").getUserRole()==ur){
			return sds.delete(po);
		}
		return ResultMessage.Failure;
	}
	
	public StrategyList calPrice(String ID,UserRole ur,OrderVO vo) throws RemoteException{
		if(vo!=null&&sds.findAll(ID)!=null&&sds.findAll(ID).get(ID).getUserRole()==ur){
			strategy_price=new StrategyList(ID,ur);
			/*
			 * while(strategy_price!=null)*/
			double p=0.0;
			StrategyVO svo=new StrategyVO();
			strategy_price.addLineItem(p,svo);
		}
		return strategy_price;
	}

}
