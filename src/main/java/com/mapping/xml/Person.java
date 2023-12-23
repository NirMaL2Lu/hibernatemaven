package com.mapping.xml;

public class Person {

	private int id;
	private String name;
	private String address;
	private long phNumber;
	
	public Person() {
		
	}
	

	public Person(String name, String address, long phNumber) {
		super();
		this.name = name;
		this.address = address;
		this.phNumber = phNumber;
	}


	public Person(int id, String name, String address, long phNumber) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phNumber = phNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(long phNumber) {
		this.phNumber = phNumber;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", phNumber=" + phNumber + "]";
	}
	
	
	
	
}
