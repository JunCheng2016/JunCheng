package bl_driver;

import businesslogic.HotelLimit;
import businesslogic.HotelServiceImpl;
import businesslogicservice.HotelService;
import po.HotelPO;

public class Hotel_driver {
	public void drive(HotelService hs){
		hs.getHotel(new HotelLimit());
		hs.getInfo("abd");
		hs.modifyHotel(new HotelPO());
		hs.updateHotel(new HotelPO());
	}
	public static void main(String[] args){
		Hotel_driver hd=new Hotel_driver();
		HotelService hs=new HotelServiceImpl();
		hd.drive(hs);
	}
}
