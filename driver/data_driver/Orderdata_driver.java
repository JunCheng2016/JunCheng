package data_driver;

import java.util.ArrayList;

import businesslogic.OrderLimit;
import businesslogic.ResultMessage;
import dataservice.HotelDataService;
import dataservice.OrderDataService;
import po.HotelPO;
import po.OrderPO;

public class Orderdata_driver {
	public void drive(OrderDataService Ods) throws Exception{
		OrderPO oPO=new OrderPO();
		oPO=Ods.find("0000");
		ResultMessage rMessage1=Ods.update(oPO);
		ResultMessage rMessage2=Ods.insert(oPO);
		ArrayList<OrderPO> list =new ArrayList<>();
		list.add(oPO);
		OrderLimit limit=new OrderLimit();
		list=Ods.list( limit);
	}
}
