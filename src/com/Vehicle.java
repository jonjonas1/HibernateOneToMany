package com;

import javax.persistence.*;

@Entity
public class Vehicle {
	@Id @GeneratedValue
	private int id;
	private String vehicleName;
	
	@OneToOne
	private UserDetails userDetails;
	
	public int getVehicleId() {
		return id;
	}
	public void setVehicleId(int vehicleId) {
		this.id = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	

}
