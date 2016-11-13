package vo;

import java.util.ArrayList;

import po.HotelPO;
import po.Room;

public class HotelVO {
	
	public String id;
	public String name;
	public String area;
	public String address;
	public String introduction;
	public int star;
	public double mark;
	public ArrayList<Room> rooms;
	public ArrayList<RoomType> roomCondition;
	
	public HotelVO(HotelPO hotelPO){
		id = hotelPO.id;
		name = hotelPO.name;
		area = hotelPO.area;
		address = hotelPO.address;
		introduction = hotelPO.introduction;
		star = hotelPO.star;
		mark = hotelPO.mark;
		
		//convert rooms to rommCondition
	}
}
