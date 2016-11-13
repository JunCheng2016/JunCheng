package businesslogic.Userberbl;
import java.util.ArrayList;

public class HotelList {
	private ArrayList<User> list;
	public HotelList(){
		list=new ArrayList<User>();
	}
	public void addHotel(User h){
		list.add(h);
	}
	public void deleteHotel(User h){
		list.remove(h);
	}
	public HotelList getHotelList(){
		return this;
	}
	
	
}
