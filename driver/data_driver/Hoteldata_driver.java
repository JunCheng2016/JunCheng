package data_driver;

import java.rmi.RemoteException;

import javax.naming.spi.DirStateFactory.Result;

import businesslogic.HotelLimit;
import businesslogic.ResultMessage;
import businesslogicservice.HotelService;
import dataservice.HotelDataService;
import po.HotelPO;

public class Hoteldata_driver {
	public void drive(HotelDataService Hds) throws Exception{
		HotelPO hPO=new HotelPO();
		hPO=Hds.find("0000");
		ResultMessage rMessage1=Hds.update("0000", hPO);
		ResultMessage rMessage2=Hds.add(hPO);
	}
}
