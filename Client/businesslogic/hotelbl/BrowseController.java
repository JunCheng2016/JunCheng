package businessLogicServiceImpl.hotelbl;

import java.util.ArrayList;

import businessLogicService.hotelblService.HotelblBrowseService;
import vo.HotelVO;

public class BrowseController implements HotelblBrowseService{
	
	BrowseHotel bh;

	@Override
	public ArrayList<HotelVO> getHotelList(String area, String address, HotelVO hotelRange) {
		return bh.browse(area, address, hotelRange);
	}

	@Override
	public ArrayList<HotelVO> sortHotelList(ArrayList<HotelVO> hotelList, boolean price, boolean star, boolean mark) {
		return bh.sort(hotelList, price, star, mark);
	}

	@Override
	public HotelVO getHotelInfo(String id) {
		return bh.getHotelInfo(id);
	}
}
