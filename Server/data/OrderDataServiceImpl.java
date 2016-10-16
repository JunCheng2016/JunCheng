package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.jws.Oneway;

import businesslogic.OrderLimit;
import po.MemberPO;
import po.OrderPO;

public class OrderDataServiceImpl {

	public static String orderFile="Order.txt";
	
	public boolean insert(OrderPO po) throws Exception {
		BufferedWriter bWriter =new BufferedWriter(new FileWriter(orderFile));
		return false;
		
}
	
	public OrderPO  find(String ID) throws RemoteException, Exception {
		BufferedReader bReader=new BufferedReader(new FileReader(orderFile));
		OrderPO oPo =new OrderPO();
		
		return oPo;
	}
	
	public ArrayList<OrderPO> list(OrderLimit listLimit)throws RemoteException, Exception {
		ArrayList< OrderPO> orderList=new ArrayList<>();
		BufferedReader bReader=new BufferedReader(new FileReader(orderFile));
		OrderPO oPo =new OrderPO();
		
		return orderList;
	}

	public boolean update(OrderPO po) throws Exception {
		BufferedWriter bw=new BufferedWriter(new FileWriter(orderFile));
		BufferedReader bReader=new BufferedReader(new FileReader(orderFile));
		
		return false;
	}
}
