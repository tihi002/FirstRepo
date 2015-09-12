package com.gmail.rozman.tihamer;

import java.io.Serializable;

	/**
	 * The class describes the behavior of a train or route
	 */
public class Train implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	/**
	 * Returns the id of the train
	 * @return id
	 */
	Integer getId() {
		return id;
	}
	/**
	 * Set the id of the train
	 * @param id id of the train
	 */
	void setId(Integer id) {
		this.id = id;
	}
	/**
	 * Returns the name of the train
	 * @return name 
	 */
	String getName() {
		return name;
	}
	/**
	 * Set the name of the train
	 * @param name name of the train 
	 */
	void setName(String name) {
		this.name = name;
	}
	
	
	

}
