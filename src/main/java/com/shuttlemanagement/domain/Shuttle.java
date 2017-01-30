package com.shuttlemanagement.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Shuttle is sample data to save model 
 * @author Kazim Ulusoy
 */
@Document(collection = "shuttles")
public class Shuttle {
	 
	/** The id. */
	@Id
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
	
	/**
	 * Instantiates a new shuttle.
	 *
	 * @param location the location
	 * @param operationMode the operation mode
	 * @param shuttleNumber the shuttle number
	 * @param shuttleName the shuttle name
	 * @param routeDescription the route description
	 * @param driverFullName the driver full name
	 * @param driverPhone the driver phone
	 * @param vehiclePlate the vehicle plate
	 * @param seatingCapacity the seating capacity
	 * @param workingHour the working hour
	 */
	public Shuttle(String location, String operationMode, String shuttleNumber, String shuttleName,
			String routeDescription, String driverFullName, String driverPhone, String vehiclePlate,
			String seatingCapacity, String workingHour) {
		super();
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

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the location.
	 *
	 * @param location the new location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Gets the operation mode.
	 *
	 * @return the operation mode
	 */
	public String getOperationMode() {
		return operationMode;
	}

	/**
	 * Sets the operation mode.
	 *
	 * @param operationMode the new operation mode
	 */
	public void setOperationMode(String operationMode) {
		this.operationMode = operationMode;
	}

	/**
	 * Gets the shuttle number.
	 *
	 * @return the shuttle number
	 */
	public String getShuttleNumber() {
		return shuttleNumber;
	}

	/**
	 * Sets the shuttle number.
	 *
	 * @param shuttleNumber the new shuttle number
	 */
	public void setShuttleNumber(String shuttleNumber) {
		this.shuttleNumber = shuttleNumber;
	}

	/**
	 * Gets the shuttle name.
	 *
	 * @return the shuttle name
	 */
	public String getShuttleName() {
		return shuttleName;
	}

	/**
	 * Sets the shuttle name.
	 *
	 * @param shuttleName the new shuttle name
	 */
	public void setShuttleName(String shuttleName) {
		this.shuttleName = shuttleName;
	}

	/**
	 * Gets the route description.
	 *
	 * @return the route description
	 */
	public String getRouteDescription() {
		return routeDescription;
	}

	/**
	 * Sets the route description.
	 *
	 * @param routeDescription the new route description
	 */
	public void setRouteDescription(String routeDescription) {
		this.routeDescription = routeDescription;
	}

	/**
	 * Gets the driver full name.
	 *
	 * @return the driver full name
	 */
	public String getDriverFullName() {
		return driverFullName;
	}

	/**
	 * Sets the driver full name.
	 *
	 * @param driverFullName the new driver full name
	 */
	public void setDriverFullName(String driverFullName) {
		this.driverFullName = driverFullName;
	}

	/**
	 * Gets the driver phone.
	 *
	 * @return the driver phone
	 */
	public String getDriverPhone() {
		return driverPhone;
	}

	/**
	 * Sets the driver phone.
	 *
	 * @param driverPhone the new driver phone
	 */
	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}

	/**
	 * Gets the vehicle plate.
	 *
	 * @return the vehicle plate
	 */
	public String getVehiclePlate() {
		return vehiclePlate;
	}

	/**
	 * Sets the vehicle plate.
	 *
	 * @param vehiclePlate the new vehicle plate
	 */
	public void setVehiclePlate(String vehiclePlate) {
		this.vehiclePlate = vehiclePlate;
	}

	/**
	 * Gets the seating capacity.
	 *
	 * @return the seating capacity
	 */
	public String getSeatingCapacity() {
		return seatingCapacity;
	}

	/**
	 * Sets the seating capacity.
	 *
	 * @param seatingCapacity the new seating capacity
	 */
	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	/**
	 * Gets the working hour.
	 *
	 * @return the working hour
	 */
	public String getWorkingHour() {
		return workingHour;
	}

	/**
	 * Sets the working hour.
	 *
	 * @param workingHour the new working hour
	 */
	public void setWorkingHour(String workingHour) {
		this.workingHour = workingHour;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Shuttle [id=" + id + ", location=" + location + ", operationMode=" + operationMode + ", shuttleNumber="
				+ shuttleNumber + ", shuttleName=" + shuttleName + ", routeDescription=" + routeDescription
				+ ", driverFullName=" + driverFullName + ", driverPhone=" + driverPhone + ", vehiclePlate="
				+ vehiclePlate + ", seatingCapacity=" + seatingCapacity + ", workingHour=" + workingHour + "]";
	}
	
	
}