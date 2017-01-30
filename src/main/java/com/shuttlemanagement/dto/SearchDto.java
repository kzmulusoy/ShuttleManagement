package com.shuttlemanagement.dto;

/**
 * The Class SearchDto.
 * @author Kazim Ulusoy
 */
public class SearchDto {
	
	/** The location. */
	private String location;
	
	/** The destination. */
	private String destination;
	
	/** The oprmode. */
	private String oprmode;
	
	/**
	 * Instantiates a new search dto.
	 */
	public SearchDto() {
		super();
	}
	
	/**
	 * Instantiates a new search dto.
	 *
	 * @param location the location
	 * @param destination the destination
	 * @param oprmode the oprmode
	 */
	public SearchDto(String location, String destination, String oprmode) {
		super();
		this.location = location;
		this.destination = destination;
		this.oprmode = oprmode;
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

	/**
	 * Gets the oprmode.
	 *
	 * @return the oprmode
	 */
	public String getOprmode() {
		return oprmode;
	}

	/**
	 * Sets the oprmode.
	 *
	 * @param oprmode the new oprmode
	 */
	public void setOprmode(String oprmode) {
		this.oprmode = oprmode;
	}
	
	
}
