package model;

import org.springframework.data.annotation.Id;


public class Doctor {

	@Id
	private String id;
	private String name;
	
	public Doctor(){}

	public Doctor(String id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
