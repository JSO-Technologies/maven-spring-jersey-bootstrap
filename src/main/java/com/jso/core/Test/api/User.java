package com.jso.core.Test.api;

import org.hibernate.validator.constraints.NotBlank;

public class User {
	@NotBlank
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
