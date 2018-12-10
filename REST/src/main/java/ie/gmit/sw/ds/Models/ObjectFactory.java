package ie.gmit.sw.ds.Models;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

	public ObjectFactory() {
	}

	
	public Booking createBooking() {
		return new Booking();
	}

}