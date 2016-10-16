package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;

import org.omg.PortableServer.IdAssignmentPolicy;

import businesslogic.ResultMessage;
import po.HotelPO;

public class HotelDataServiceImpl {

	public static String hotelFile="Hotel.txt";
	
	
    public HotelPO find(String ID) throws Exception {
    	BufferedReader bReader=new  BufferedReader(new FileReader("Hotel.txt"));
    	if (bReader.readLine().equals(ID)) {
			
		}
		return null;
	
    }
	
	public ResultMessage update(String ID, HotelPO po) throws Exception {
		BufferedReader bReader=new  BufferedReader(new FileReader("Hotel.txt"));
		BufferedWriter bWriter=new BufferedWriter(new FileWriter("Hotel.txt"));
		if (bReader.readLine().equals(ID)) {
			
			return ResultMessage.Success;
		}
		return ResultMessage.Failure;
	}
	
	public ResultMessage add(HotelPO po) throws Exception {
		BufferedWriter bWriter=new BufferedWriter(new FileWriter(hotelFile));
		
		return ResultMessage.Success;
	}
}

