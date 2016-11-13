package businesslogic.Memberbl;

public class MemberItem {
	private String id;
	private String date;
	private double price;
	private String hotel;
	public MemberItem(String ID,String Date,double Price,String Hotel){
		this.id=ID;
		this.date=Date;
		this.price=Price;
		this.hotel=Hotel;
	}
	public String getID(){
		return id;
	}
	public String getDate(){
		return date;
	}
	public double getPrice(){
		return price;
	}
	public String getHotel(){
		return hotel;
	}
}
