package ie.gmit.sw.REST;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ie.gmit.sw.ds.Setup.Interface;
import ie.gmit.sw.ds.Models.Booking;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
     /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     * @throws Exception 
     * @throws RemoteException 
     * @throws MalformedURLException 
     * @throws SQLException 
     */
	@Path("/readCarHire")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Booking> getIt() throws MalformedURLException, RemoteException, Exception, SQLException {
    	Interface CarBookingService;
    	CarBookingService = (Interface) Naming.lookup("rmi://127.0.0.1:1099/database");
    	
        return CarBookingService.readCarHire();
    }
	
	@Path("/writeCarHire")
	@POST
    @Produces(MediaType.APPLICATION_XML)
    public List<Booking> writeIt(String input) throws MalformedURLException, RemoteException, Exception, SQLException {
		Interface CarBookingService;
    	CarBookingService = (Interface) Naming.lookup("rmi://127.0.0.1:1099/database");
        return CarBookingService.writeCarHire(input);
    }
	
	@Path("/updateCarHire")
	@POST
    @Produces(MediaType.APPLICATION_XML)
    public List<Booking> updateIt(String input) throws MalformedURLException, RemoteException, Exception, SQLException {
		Interface CarBookingService;
    	CarBookingService = (Interface) Naming.lookup("rmi://127.0.0.1:1099/database");
        return CarBookingService.updateCarHire(input);
    }
	
	@Path("/deleteCarHire")
	@POST
    @Produces(MediaType.APPLICATION_XML)
    public List<Booking> deleteIt(String input) throws MalformedURLException, RemoteException, Exception, SQLException {
		Interface CarBookingService;
    	CarBookingService = (Interface) Naming.lookup("rmi://127.0.0.1:1099/database");
        return CarBookingService.deleteCarHire(input);
    }
	
}