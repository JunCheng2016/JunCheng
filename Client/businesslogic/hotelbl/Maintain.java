package businessLogicServiceImpl.hotelbl;

import businessLogicService.hotelblService.HotelblMaintainService;
import dataService.HotelDataService;
import po.HotelInfoPO;
import po.HotelPO;
import vo.HotelInfoVO;
import vo.HotelVO;

public class Maintain implements HotelblMaintainService {

	@Override
	public HotelVO getHotelInfo(String id) {
		// TODO Auto-generated method stub
		return new HotelVO(HotelDataService.getHotelInfo(id));
	}

	@Override
	public boolean setHotelInfo(HotelVO hotelInfoVO) {
		// TODO Auto-generated method stub
		return HotelDataService.setHotelInfo(new HotelPO(hotelInfoVO));
	}
}
