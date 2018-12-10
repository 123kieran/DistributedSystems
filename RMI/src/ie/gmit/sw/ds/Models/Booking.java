
package ie.gmit.sw.ds.Models;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Booking")
public class Booking implements Serializable{

   
	private static final long serialVersionUID = 1L;
	@XmlAttribute(name = "vehicleId")
    protected Integer vehicleId;
    @XmlAttribute(name = "customerId")
    protected Integer customerId;
    @XmlAttribute(name = "bookingNumber", required = true)
    protected String bookingNumber;
    @XmlAttribute(name = "startDate", required = true)
    protected String startDate;
    @XmlAttribute(name = "endDate", required = true)
    protected String endDate;
    @XmlAttribute(name = "bookingId", required = true)
    protected int bookingId;


    public Integer getVehicleId() {
        return vehicleId;
    }

 
    public void setVehicleId(Integer value) {
        this.vehicleId = value;
    }

   
    public Integer getCustomerId() {
        return customerId;
    }

  
    public void setCustomerId(Integer value) {
        this.customerId = value;
    }

   
    public String getBookingNumber() {
        return bookingNumber;
    }

   
    public void setBookingNumber(String value) {
        this.bookingNumber = value;
    }

  
    public String getStartDate() {
        return startDate;
    }

    
    public void setStartDate(String value) {
        this.startDate = value;
    }

   
    public String getEndDate() {
        return endDate;
    }

    
    public void setEndDate(String value) {
        this.endDate = value;
    }

   
    public int getBookingId() {
        return bookingId;
    }

   
    public void setBookingId(int value) {
        this.bookingId = value;
    }

}