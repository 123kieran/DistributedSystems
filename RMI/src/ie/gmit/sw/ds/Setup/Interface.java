package ie.gmit.sw.ds.Setup;

import java.rmi.*;
import java.util.List;




public interface Interface extends Remote{
	
	public void createCarHire(String q) throws RemoteException; // create a booking
	

}