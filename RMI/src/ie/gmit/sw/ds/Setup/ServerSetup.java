package ie.gmit.sw.ds.Setup;


import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


public class ServerSetup {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Interface carBookingService = new CarHireImpl();

		// Start the RMI registry on port 1099
		LocateRegistry.createRegistry(1099);

		//Bind our remote object to the registry with the human-readable name "carBookingService"
		Naming.rebind("carbooking", carBookingService);

		// Print a message
		System.out.println("Server is ready.");
		
	
	}

}