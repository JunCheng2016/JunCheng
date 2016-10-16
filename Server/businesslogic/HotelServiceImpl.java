package businesslogic;

import java.util.ArrayList;

import businesslogicservice.HotelService;
import po.HotelPO;
import vo.HotelVO;
import vo.MemberVO;
import vo.UserVO;

public class HotelServiceImpl implements HotelService{

	public HotelVO getInfo(String name) {
		HotelVO vo=new HotelVO();
		if(name=="001"){
			return vo;
		}else{
			return null;
		}
	}
	
	public ArrayList<HotelVO> getHotel (HotelLimit limit) {
		
		return null;
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
