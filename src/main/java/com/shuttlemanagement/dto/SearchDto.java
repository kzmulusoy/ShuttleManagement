package com.shuttlemanagement.dto;

/**
 * The Class SearchDto.
 */
public class SearchDto {
	
	/** The location. */
	private String location;
	
	/** The opetation mode. */
	private String opetationMode;
	
	/** The destination. */
	private String destination;
	
	/**
	 * Instantiates a new search dto.
	 */
	public SearchDto() {
		super();
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
	 * Gets the opetation mode.
	 *
	 * @return the opetation mode
	 */
	public String getOpetationMode() {
		return opetationMode;
	}

	/**
	 * Sets the opetation mode.
	 *
	 * @param opetationMode the new opetation mode
	 */
	public void setOpetationMode(String opetationMode) {
		this.opetationMode = opetationMode;
	}

	/**
	 * Gets the destination.
	 *
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * Sets the destination.
	 *
	 * @param destination the new destination
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
}
