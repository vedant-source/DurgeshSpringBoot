package com.form.validation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginCreds {
	
	
	@NotBlank(message = "Email should not be blank ...!!! ")
    @Size(min = 3, message = "Email must be of more than 3 letters ...!!! ")
	private String email;
	
	private String password;

	public LoginCreds() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginCreds(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginCreds [email=" + email + ", password=" + password + "]";
	}

}
