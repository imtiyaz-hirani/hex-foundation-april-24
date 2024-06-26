package com.model;

public class Customer {
	private int id;
	private String name;
	private int userId;

	public Customer(int id, String name, int userId) {
		super();
		this.id = id;
		this.name = name;
		this.userId = userId;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", userId=" + userId + "]";
	}

}
