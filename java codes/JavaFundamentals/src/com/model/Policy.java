package com.model;

public class Policy {
	private int id;
	private String name;
	private int age;
	private int duration;
	private double premium;

	public Policy(int id, String name, int age, int duration, double premium) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.duration = duration;
		this.premium = premium;
	}

	public Policy() { }


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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}


	@Override
	public String toString() {
		return "Policy [id=" + id + ", name=" + name + ", age=" + age + ", duration=" + duration + ", premium="
				+ premium + "]";
	}



	 

	
}
