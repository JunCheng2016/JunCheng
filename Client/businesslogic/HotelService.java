package businesslogic;

import java.util.ArrayList;

import businesslogic.HotelLimit;
import businesslogic.ResultMessage;
import po.HotelPO;
import vo.HotelVO;

public interface HotelService {
	
	public HotelVO getInfo(String name);
	
	public ArrayList<HotelVO> getHotel (HotelLimit limit);
	
	public ResultMessage modifyHotel(HotelPO po);

	public ResultMessage updateHotel(HotelPO po);
}
