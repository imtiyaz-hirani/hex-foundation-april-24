package com.model;

import java.time.LocalDate;

public class Car {
	private int id;
	private String vehicleNumber;
	private LocalDate dateOfRegistration;
	private String company;
	private String model; 
	private double price;
	
	public Car(int id, String vehicleNumber, LocalDate dateOfRegistration, String company, String model, double price) {
		super();
		this.id = id;
		this.vehicleNumber = vehicleNumber;
		this.dateOfRegistration = dateOfRegistration;
		this.company = company;
		this.model = model;
		this.price = price;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public LocalDate getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(LocalDate dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", vehicleNumber=" + vehicleNumber + ", dateOfRegistration=" + dateOfRegistration
				+ ", company=" + company + ", model=" + model + ", price=" + price + "]";
	}
	
	
}
