package com.shuttlemanagement.domain;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The Class Shuttle.
 */
@Document(collection = "shuttles")
public class Shuttle {
	 
	/** The id. */
	private String id;
	
	/** The location. */
	private String location;
	
	/** The operation mode is mode for normal or turn of work. */
	private String operationMode;
	
	/** The shuttle number. */
	private String shuttleNumber;
	
	/** The shuttle name. */
	private String shuttleName;
	
	/** The route description. */
	private String routeDescription;
	
	/** The driver full name. */
	private String driverFullName;
	
	/** The driver phone. */
	private String driverPhone;
	
	/** The vehicle plate. */
	private String vehiclePlate;
	
	/** The seatingCapacity. */
	private String seatingCapacity;
	
	/** The working hour. */
	private String workingHour;

	/**
	 * Instantiates a new shuttle.
	 */
	public Shuttle() {
		super();
	}
	
	public Shuttle(String id, String location, String operationMode, String shuttleNumber, String shuttleName,
			String routeDescription, String driverFullName, String driverPhone, String vehiclePlate,
			String seatingCapacity, String workingHour) {
		super();
		this.id = id;
		this.location = location;
		this.operationMode = operationMode;
		this.shuttleNumber = shuttleNumber;
		this.shuttleName = shuttleName;
		this.routeDescription = routeDescription;
		this.driverFullName = driverFullName;
		this.driverPhone = driverPhone;
		this.vehiclePlate = vehiclePlate;
		this.seatingCapacity = seatingCapacity;
		this.workingHour = workingHour;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOperationMode() {
		return operationMode;
	}

	public void setOperationMode(String operationMode) {
		this.operationMode = operationMode;
	}

	public String getShuttleNumber() {
		return shuttleNumber;
	}

	public void setShuttleNumber(String shuttleNumber) {
		this.shuttleNumber = shuttleNumber;
	}

	public String getShuttleName() {
		return shuttleName;
	}

	public void setShuttleName(String shuttleName) {
		this.shuttleName = shuttleName;
	}

	public String getRouteDescription() {
		return routeDescription;
	}

	public void setRouteDescription(String routeDescription) {
		this.routeDescription = routeDescription;
	}

	public String getDriverFullName() {
		return driverFullName;
	}

	public void setDriverFullName(String driverFullName) {
		this.driverFullName = driverFullName;
	}

	public String getDriverPhone() {
		return driverPhone;
	}

	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}

	public String getVehiclePlate() {
		return vehiclePlate;
	}

	public void setVehiclePlate(String vehiclePlate) {
		this.vehiclePlate = vehiclePlate;
	}

	public String getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public String getWorkingHour() {
		return workingHour;
	}

	public void setWorkingHour(String workingHour) {
		this.workingHour = workingHour;
	}

	@Override
	public String toString() {
		return "Shuttle [id=" + id + ", location=" + location + ", operationMode=" + operationMode + ", shuttleNumber="
				+ shuttleNumber + ", shuttleName=" + shuttleName + ", routeDescription=" + routeDescription
				+ ", driverFullName=" + driverFullName + ", driverPhone=" + driverPhone + ", vehiclePlate="
				+ vehiclePlate + ", seatingCapacity=" + seatingCapacity + ", workingHour=" + workingHour + "]";
	}
}