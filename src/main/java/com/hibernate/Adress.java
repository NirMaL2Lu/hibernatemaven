package com.hibernate;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity 
@Table
public class Adress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "adress_id")
	private int adressId;
	@Column(length = 50,name = "Street")
	private String street;
	@Column(length = 60,name = "City")
	private String city;
	@Column(name = "is_open")
	private boolean isOpen;
	@Transient
	private double x;
	@Column(name = "add_date")
	@Temporal(TemporalType.DATE)
	private Date addDate;
	@Column(name = "student_img")
	@Lob
	private byte[] image;
	
	public Adress() {
		
	}

	public Adress(int adressId, String street, String city, boolean isOpen, double x, Date addDate, byte[] image) {
		super();
		this.adressId = adressId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addDate = addDate;
		this.image = image;
	}

	public int getAdressId() {
		return adressId;
	}

	public void setAdressId(int adressId) {
		this.adressId = adressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Adress [adressId=" + adressId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen + ", x="
				+ x + ", addDate=" + addDate + ", image=" + Arrays.toString(image) + "]";
	}
	
	
	
	
	
}
