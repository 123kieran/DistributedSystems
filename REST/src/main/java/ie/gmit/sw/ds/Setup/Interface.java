package ie.gmit.sw.ds.Setup;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import ie.gmit.sw.ds.Models.Booking;


public interface Interface extends Remote{
	
	public List<Booking> readCarHire() throws RemoteException, SQLException;
	public List<Booking> writeCarHire(String input) throws RemoteException, SQLException;	
	public List<Booking> updateCarHire(String input) throws RemoteException, SQLException;
	public List<Booking> deleteCarHire(String input) throws RemoteException, SQLException;

}