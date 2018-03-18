package com.devopsbuddy.utils;

import com.devopsbuddy.backend.persistence.domain.backend.User;

public class UsersUtils {
	
	private UsersUtils() {
		throw new AssertionError("Non instantiable");
	}
	
	public static User createBasicUser() {
		User user = new User();
		user.setUsername("basicUser");
		user.setPassword("Secret");
		user.setEmail("example@example.com");
		user.setFirstName("John");
		user.setLastName("Doe");
		user.setPhoneNumber("1234567890");
		user.setCountry("US");
		user.setEnabled(true);
		user.setDescription("A basic user");
		user.setProfileImageUrl("https://blahblahblah.images.com/basicuser");
		return user;
	}	

}
