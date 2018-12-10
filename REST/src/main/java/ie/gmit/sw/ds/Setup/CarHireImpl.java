package ie.gmit.sw.ds.Setup;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import ie.gmit.sw.ds.Models.Booking;

public class CarHireImpl extends UnicastRemoteObject implements Interface {


	private static final long serialVersionUID = 1L;
	private Connection con;
	private Statement stat;

	protected CarHireImpl() throws RemoteException, SQLException {
		super();
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CARHIREDATABASE?useSSL=false", "root", "");
	}
	
	@Override
	public List<Booking> readCarHire() throws RemoteException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> writeCarHire(String input) throws RemoteException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> updateCarHire(String input) throws RemoteException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> deleteCarHire(String input) throws RemoteException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}



}
