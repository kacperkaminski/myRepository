package com.helpdesk.helpdeskbackend.service.pojo;

import com.helpdesk.helpdeskbackend.model.Role;

public class UserUpdateDetails {

	private Role role;
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private boolean active;

	public UserUpdateDetails() {
	}

	public UserUpdateDetails(Role role, String firstName, String lastName, String email, String username,
			boolean active) {
		this.role = role;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.active = active;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
