package ie.gmit.sw.ds.Models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "customerId",
    "firstName",
    "lastName",
    "age",
    "county",
    "dateOfBirth"
})
public class Customer {

    protected int customerId;
    @XmlElement(required = true)
    protected String firstName;
    @XmlElement(required = true)
    protected String lastName;
    protected int age;
    @XmlElement(required = true)
    protected String county;
    @XmlElement(required = true)
    protected String dateOfBirth;

 
    public int getCustomerId() {
        return customerId;
    }

  
    public void setCustomerId(int value) {
        this.customerId = value;
    }


    public String getFirstName() {
        return firstName;
    }

 
    public void setFirstName(String value) {
        this.firstName = value;
    }

  
    public String getLastName() {
        return lastName;
    }


    public void setLastName(String value) {
        this.lastName = value;
    }

 
    public int getAge() {
        return age;
    }

 
    public void setAge(int value) {
        this.age = value;
    }


    public String getCounty() {
        return county;
    }

 
    public void setCounty(String value) {
        this.county = value;
    }

  
    public String getDateOfBirth() {
        return dateOfBirth;
    }

  
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

}