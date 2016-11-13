package po;

import vo.UserRole;

public class StrategyPO {
	private UserRole ur;
	private String strategy_name;
	private String descrip;
	private String start_date;
	private String end_date;
	private double count;
	public UserRole getUserRole(){
		return ur;
	}
	public String getName(){
		return strategy_name;
	}
	public String getDescrip(){
		return descrip;
	}
	public String getStartDate(){
		return start_date;
	}
	public String getEndDate(){
		return end_date;
	}
	public double getCount(){
		return count;
	}
}
