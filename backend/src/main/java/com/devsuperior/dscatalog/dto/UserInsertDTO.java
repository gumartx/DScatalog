package com.devsuperior.dscatalog.dto;

import com.devsuperior.dscatalog.entities.User;

public class UserInsertDTO extends UserDTO {
	private static final long serialVersionUID = 1L;
	
	private String password;
	
	public UserInsertDTO() {
	}

	public UserInsertDTO(User entity) {
		super(entity);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
