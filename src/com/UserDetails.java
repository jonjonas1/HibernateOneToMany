package com;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="details")
public class UserDetails {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String userName;
	
	//connection between user and vehicle class
	@OneToMany
	@JoinColumn(name="Owner_Id") //rename table column
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	
	public  List<Vehicle> getVehicle() { 
		return vehicles;
	}
	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}
	public int getUserId() {
		return id;
	}
	public void setUserId(int userId) {
		this.id = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", userName=" + userName + "]";
	}
	
	
	public UserDetails() {
		super();
	}
	public UserDetails(String userName) {
		super();
		this.userName = userName;
	}
	
	
}
