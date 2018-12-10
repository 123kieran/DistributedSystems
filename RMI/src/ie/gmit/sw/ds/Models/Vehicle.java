package ie.gmit.sw.ds.Models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle", propOrder = { "id", "type", "year", "colour", "engine" })
public class Vehicle {

	protected int id;
	@XmlElement(required = true)
	protected String type;
	@XmlElement(required = true)
	protected String year;
	@XmlElement(required = true)
	protected String colour;
	protected float engine;

	public int getId() {
		return id;
	}

	public void setId(int value) {
		this.id = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String value) {
		this.type = value;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String value) {
		this.year = value;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String value) {
		this.colour = value;
	}

	public float getEngine() {
		return engine;
	}

	public void setEngine(float value) {
		this.engine = value;
	}

}