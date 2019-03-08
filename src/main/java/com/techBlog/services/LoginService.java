package com.techBlog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techBlog.utilities.CheckForSpecialChars;

@Service
public class LoginService {
	
	@Autowired
	CheckForSpecialChars gateKeeper;
	
	public boolean validateUser(String userId, String password ) {
		
		if( !gateKeeper.isSafe(userId, password) ) {
			return false;
		}
		
		return true;
	}
}
