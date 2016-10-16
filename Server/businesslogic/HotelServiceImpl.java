package businesslogic;

import java.util.ArrayList;

import po.HotelPO;
import vo.HotelVO;
import vo.MemberVO;
import vo.UserVO;

public class HotelServiceImpl {

	public HotelPO getInfo(String name) {
		HotelPO po=new HotelPO();
		if(name=="001"){
			return po;
		}else{
			return null;
		}
	}
	
	public ArrayList<HotelVO> getHotel (ArrayList<HotelVO> limit) {
		return limit;
	}
	
	public ResultMessage modifyHotel(HotelPO po) {
		if(po!=null){
			return ResultMessage.Success;
		}else{
			return ResultMessage.Failure;
		}
		
	}

	public ResultMessage updateHotel(HotelPO po) {
		if(po != null){
			return ResultMessage.Success;
		}else{
			return ResultMessage.Failure;
		}
		
	}
	
}
