package com.jac.web.model;

public class UserRoles {
	
	private int ID;
	private String name;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public UserRoles(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}

}
