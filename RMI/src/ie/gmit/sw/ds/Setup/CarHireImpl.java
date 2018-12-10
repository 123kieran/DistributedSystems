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
		System.out.println("In read");
		stat = con.createStatement();
		
		List<Booking> carList = new ArrayList<Booking>();
		
		String selectQuery = "select * from bookings ORDER BY BookingID";//sql statement
		
		ResultSet rs = stat.executeQuery(selectQuery);//run query
		
		while(rs.next()){
			int BookingID = rs.getInt("BookingID");
			String StartDate = rs.getString("StartDate");
			String EndDate = rs.getString("EndDate");
			int CustID = rs.getInt("CustID");
			String CarReg = rs.getString("CarReg");
			
			Booking b = new Booking();
		
			
			b.setBookingID(BookingID);
			b.setStartDate(StartDate);
			b.setEndDate(EndDate);
			b.setCust(CustID);
			b.setCarReg(CarReg);
			
			carList.add(b); // add to list
		}
		return carList;
	}
	
	@Override
	public List<Booking> writeCarHire(String input) throws RemoteException, SQLException {
		System.out.println("In write");
	
		stat = con.createStatement();
				
		input = input.replace("startDate=", "");
		input = input.replace("endDate=", "");
		input = input.replace("custID=", "");
		input = input.replace("carReg=", "");
		
		String[] inputParts = input.split("&");
		
		for (int j = 0; j < inputParts.length; j++) {
			System.out.println("->> " + inputParts[j]);
		}
		
		List<Booking> carList = new ArrayList<Booking>();
		
		String writeQuery = "INSERT INTO Bookings (BookingID, StartDate, EndDate, CustID, CarReg) VALUES " + 
							"(NULL, '" + inputParts[0] + "', '" + inputParts[1] + "', " + inputParts[2] + ", '" + inputParts[3] + "');";
		
		stat.executeUpdate(writeQuery);
		
		String selectQuery = "select * from bookings ORDER BY BookingID";//sql statement
		
		ResultSet rs = stat.executeQuery(selectQuery); //run query
		
		while(rs.next()){
			int BookingID = rs.getInt("BookingID");
			String StartDate = rs.getString("StartDate");
			String EndDate = rs.getString("EndDate");
			int CustID = rs.getInt("CustID");
			String CarReg = rs.getString("CarReg");
			
			Booking b = new Booking();
	
			
			b.setBookingID(BookingID);
			b.setStartDate(StartDate);
			b.setEndDate(EndDate);
			b.setCust(CustID);
			b.setCarReg(CarReg);
			
			carList.add(b);//add to list
		}
		
		return carList;
	}
	
	@Override
	public List<Booking> updateCarHire(String input) throws RemoteException, SQLException {
		System.out.println("In update");
		stat = con.createStatement();
		
		System.out.println("Before: " + input);
		
		String[] inputParts = input.split("&");
		
		System.out.println("First position: " + inputParts[0]);
		input = input.replace(inputParts[0], "");
		input = input.replace("&", "', ");
		input = input.replace("', startDate=", "startDate='");
		input = input.replace("endDate=", "endDate='");
		input = input.replace("custID=", "custID='");
		input = input.replace("carReg=", "carReg='");
		
		input = input.replace("startDate='',", "");
		input = input.replace("endDate='',", "");
		input = input.replace("custID='',", "");
		input = input.replace("carReg=''", "");
		
		input = input + "'";
		
		System.out.println("After: " + input);
		
		for (int j = 0; j < inputParts.length; j++) {
			System.out.println("->> " + inputParts[j]);
		}
		
		List<Booking> carList = new ArrayList<Booking>();
		
		String updateQuery = "UPDATE Bookings SET " + input + " WHERE " + inputParts[0] + ";";
		
		stat.executeUpdate(updateQuery);
		
		String selectQuery = "select * from bookings ORDER BY BookingID";//sql statement
		
		ResultSet rs = stat.executeQuery(selectQuery);//run query
		
		while(rs.next()){
			int BookingID = rs.getInt("BookingID");
			String StartDate = rs.getString("StartDate");
			String EndDate = rs.getString("EndDate");
			int CustID = rs.getInt("CustID");
			String CarReg = rs.getString("CarReg");
			
			Booking o = new Booking();
		
			
			o.setBookingID(BookingID);
			o.setStartDate(StartDate);
			o.setEndDate(EndDate);
			o.setCust(CustID);
			o.setCarReg(CarReg);
			
			carList.add(o);//add to list
		}
		
		return carList;
	}

	@Override
	public List<Booking> deleteCarHire(String input) throws RemoteException, SQLException {
		System.out.println("In delete");
		System.out.println("->> " + input);
		stat = con.createStatement();
		
		List<Booking> carList = new ArrayList<Booking>();
		
		String deleteQuery = "DELETE FROM Bookings WHERE " + input + ";";
		
		stat.executeUpdate(deleteQuery);//delete query
		
		String selectQuery = "select * from bookings ORDER BY BookingID";//delete query
		
		ResultSet rs = stat.executeQuery(selectQuery);//run query
		
		while(rs.next()){
			int BookingID = rs.getInt("BookingID");
			String StartDate = rs.getString("StartDate");
			String EndDate = rs.getString("EndDate");
			int CustID = rs.getInt("CustID");
			String CarReg = rs.getString("CarReg");
			
			Booking b = new Booking();
		
			
			b.setBookingID(BookingID);
			b.setStartDate(StartDate);
			b.setEndDate(EndDate);
			b.setCust(CustID);
			b.setCarReg(CarReg);
			
			carList.add(b);//add to list
		}
		
		return carList;
	}

}