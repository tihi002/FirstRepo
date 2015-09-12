package com.gmail.rozman.tihamer;

import java.io.Serializable;

public class Station implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	
	/**
	 * Returns the id of the station
	 * @return id
	 */
	Integer getId() {
		return id;
	}
	/**
	 * Set the id of the station
	 * @param id id of the station
	 */
	void setId(Integer id) {
		this.id = id;
	}
	/**
	 * Returns the name of the station
	 * @return name 
	 */
	String getName() {
		return name;
	}
	/**
	 * Set the name of the station
	 * @param name name of the station 
	 */
	void setName(String name) {
		this.name = name;
	}
	
	

}
