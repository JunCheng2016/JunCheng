package businessLogicServiceImpl.hotelbl;

import java.util.ArrayList;

import dataService.HotelDataService;
import po.HotelPO;
import vo.HotelVO;

public class BrowseHotel {
	
	public ArrayList<HotelVO> browse(String area, String address, HotelVO hotelRange){
		ArrayList<HotelPO> hotelsPO = HotelDataService.getHotelList(area, address);
		
		ArrayList<HotelVO> hotelsVO = new ArrayList<HotelVO>();
		return hotelsVO;
	}
	
	public ArrayList<HotelVO> sort(ArrayList<HotelVO> hotelList, boolean price, boolean star, boolean mark){
		
		return hotelList;
	}
	
	public HotelVO getHotelInfo(String id){
		
		return new HotelVO(HotelDataService.getHotelInfo(id));
		
	}
}
