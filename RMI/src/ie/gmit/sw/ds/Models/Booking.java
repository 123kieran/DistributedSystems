package ie.gmit.sw.ds.Models;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingID",
    "startDate",
    "endDate",
    "carReg",
    "cust"
})
@XmlRootElement(name = "booking")
public class Booking implements Serializable {

   
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "BookingID")
    protected int bookingID;
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "EndDate")
    protected String endDate;
    protected int cust;
    protected String carReg;
	public Booking(int bookingID, String startDate, String endDate, int cust, String carReg) {
		super();
		this.bookingID = bookingID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.cust = cust;
		this.carReg = carReg;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBookingID() {
		return bookingID;
	}
	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getCust() {
		return cust;
	}
	public void setCust(int cust) {
		this.cust = cust;
	}
	public String getCarReg() {
		return carReg;
	}
	public void setCarReg(String carReg) {
		this.carReg = carReg;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
 
    
}
	
  