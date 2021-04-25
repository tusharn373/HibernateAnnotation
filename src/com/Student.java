package com;

import javax.persistence.*;

@Entity
@Table(name="annotStud")
public class Student
{
	@Id
	int roll_no;
	@Column
	String name;
	@Column
	String address;
	@Column
	float result;
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
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
	public float getResult() {
		return result;
	}
	public void setResult(float result) {
		this.result = result;
	}
	public Student(int roll_no, String name, String address, double d) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.address = address;
		this.result = (float) d;
	}
	
}