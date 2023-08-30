package com.Shwetha.placement;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin 
{
	@Id
	@Column(name="id")
	private int sid;
	
	@Column(name="sname")
	private String sname;
	
	@Column(name="address")
	private String address;
	
	@Column(name="cgpa")
	private int cgpa;
	
	@Column(name="location")
	private String location;
	
	@Column(name="qualification")
	private String qualification;
	
	public int getSid()
	{
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCgpa() {
		return cgpa;
	}
	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getQualification() {
		return qualification;
	}
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(int sid, String sname, String address, int cgpa, String location, String qualification) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
		this.cgpa = cgpa;
		this.location = location;
		this.qualification = qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Override
	public String toString() {
		return "Admin [sid=" + sid + ", sname=" + sname + ", address=" + address + ", cgpa=" + cgpa + ", location="
				+ location + ", qualification=" + qualification + "]";
	}
}
