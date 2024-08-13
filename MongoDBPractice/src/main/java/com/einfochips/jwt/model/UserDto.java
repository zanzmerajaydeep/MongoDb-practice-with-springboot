package com.einfochips.jwt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	
	private int id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String role;

}
